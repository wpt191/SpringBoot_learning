package com.weipt.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * 在不用mybatis的时候，需要我们一般手动的去实现dao接口，并书写逻辑，比如调用idbc入库
 * 当我们实际用到
 *
 *
 */
@SpringBootApplication(scanBasePackages = "com.weipt")
@MapperScan(basePackages = "com.weipt.dao")
public class MybatisApp {

    public static void main(String[] args) {
        SpringApplication.run(MybatisApp.class, args);
    }
}
