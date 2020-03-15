package com.weipt.app;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 实现 QuartZ进行定时任务
 *
 */
@EnableScheduling
@SpringBootApplication(scanBasePackages = "com.weipt.job")
public class JobApp {

    public static void main(String[] args) {
        SpringApplication.run(JobApp.class, args);
    }
}
