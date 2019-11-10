package zlb.mybatisdynamicdatasouce.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

import java.util.ArrayList;

public class DynamicDataSource extends AbstractRoutingDataSource {
    private static final Logger logger = LoggerFactory.getLogger("DynamicDataSource.class");
    @Override
    protected Object determineCurrentLookupKey() {
        String typeKey = DbContextHolder.getDbType();
        if (typeKey == DbContextHolder.WRITE) {
            logger.info("使用了写库");
            return DBTypeEnum.write.getValue();
        }
        //        如果使用vip-虚拟地址的方式使用读库，此处可直接写具体dbName
        //使用随机数决定使用哪个读库
        String dbName = getRandomDBName(DBTypeEnum.values());
        logger.info("使用了读写随机库{}",dbName);
        return dbName;
    }

    private String getRandomDBName(DBTypeEnum[] values){
        ArrayList<String> dbs = new ArrayList<>();
        for(DBTypeEnum dbTypeEnum:values){
//            此处可更改代码，确定读库包括哪些
            dbs.add(dbTypeEnum.getValue());
        }
        int i= (int) Math.floor(Math.random()*dbs.size());
        String dbName = dbs.get(i);
        return dbName;
    }
}