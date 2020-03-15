package com.weipt.controller;
import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.Charset;


@RestController
@RequestMapping("/hello2")
@EnableAutoConfiguration
@ConfigurationProperties(prefix = "weipt")  //自定义配置前缀
public class TestController2 {

    private static  Logger logger = Logger.getLogger("TestController2");

    private String name;  //名称与配置文件保持一致，并且要有get/set方法

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @RequestMapping("/test1")
    public String test1(){
        return name;
    }


    public static void main(String[] args) {
        logger.debug("lo4j测试");
        SpringApplication.run(TestController2.class, args);
    }

    //消息转换器，解决中文乱码（返回前端的时候）
    @Bean
    public StringHttpMessageConverter stringHttpMessageConverter(){
        StringHttpMessageConverter converter=new StringHttpMessageConverter(Charset.forName("UTF-8"));
        return converter;
    }

}
