package com.weipt.email.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program: SpringBoot_learning
 * @description: springBoot启动类
 * @author: weipt
 * @create: 2020-03-15 17:02
 **/
@SpringBootApplication(scanBasePackages = "com.weipt.email")
public class EmailApp {
    public static void main(String[] args) {
        SpringApplication.run(EmailApp.class, args);
    }
}
