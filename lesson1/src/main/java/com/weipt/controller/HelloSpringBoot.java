package com.weipt.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello1")
@EnableAutoConfiguration
//@EnableAutoConfiguration(exclude = {RedisAutoConfiguration.class})  exclude后面是剔除项
public class HelloSpringBoot {


    @RequestMapping("/test1")
    public String test(){
        return "Hello SpringBoot";
    }

    /**
     * 当属性比较多的时候，@Value要重复写
     * springboot提供了类型安全配置
     * 见下一个controller
     */
    @Value("${weipt.name}")
    String name;

    @RequestMapping("/test2")
    public String test2(){
        return name;
    }

    private String addr;
    @RequestMapping("/test3")
    public String test3(){
        return name;
    }


    public static void main(String[] args) {
        SpringApplication.run(HelloSpringBoot.class,args);
    }
}
