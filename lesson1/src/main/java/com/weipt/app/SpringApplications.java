package com.weipt.app;


import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@EnableAsync  //启动异步调用功能
@SpringBootApplication(scanBasePackages = {"com.weipt.controller", "com.weipt.interceptor","com.weipt.service"})  //将controller,拦截器进行扫描
public class SpringApplications implements WebMvcConfigurer {


    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        //创建消息转换器
        FastJsonHttpMessageConverter convert = new FastJsonHttpMessageConverter();
        //创建json配置对象
        FastJsonConfig config = new FastJsonConfig();
        //对json进行格式化
        config.setSerializerFeatures(SerializerFeature.PrettyFormat);
        //进行关联
        convert.setFastJsonConfig(config);
        converters.add(convert);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringApplications.class, args);
    }


}
