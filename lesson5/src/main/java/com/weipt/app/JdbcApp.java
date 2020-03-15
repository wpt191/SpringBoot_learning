package com.weipt.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.weipt")
public class JdbcApp {

    public static void main(String[] args) {
        SpringApplication.run(JdbcApp.class, args);
    }
}
