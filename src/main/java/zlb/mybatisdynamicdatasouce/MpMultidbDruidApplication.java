package zlb.mybatisdynamicdatasouce;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("zlb.mybatisdynamicdatasouce.mapper")
public class MpMultidbDruidApplication {

    public static void main(String[] args) {
        SpringApplication.run(MpMultidbDruidApplication.class, args);
    }

}
