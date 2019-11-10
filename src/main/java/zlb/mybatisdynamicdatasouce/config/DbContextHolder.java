package zlb.mybatisdynamicdatasouce.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DbContextHolder {
    private static final Logger logger = LoggerFactory.getLogger("DbContextHolder.class");
    public static final String WRITE = "WRITE";
    public static final String READ = "READ";

    private static final ThreadLocal<String> contextHolder = new ThreadLocal<>();

    public static void setDbType(String dbType) {
        if (dbType == null) {
            logger.error("dbType为空");
            throw new NullPointerException();
        }
        logger.info("设置dbType为：{}",dbType);
        contextHolder.set(dbType);
    }

    public static String getDbType() {
        return contextHolder.get() == null ? WRITE : contextHolder.get();
    }

    public static void clearDbType() {
        contextHolder.remove();
    }
}