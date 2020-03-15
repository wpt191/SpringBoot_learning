package com.weipt.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.annotation.Schedules;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;

import java.util.UUID;

/**
 * @program: SpringBoot_learning
 * @description: 消息发送方，发布订阅模式，所以接收者不用实时监听，要的时候去取就行
 * @author: weipt
 * @create: 2020-03-15 20:47
 **/
@Component
@EnableScheduling
public class Producer {

    @Autowired
    private KafkaTemplate kafkaTemplate;

    /**
     * 定时任务
     */
    @Scheduled(cron = "00/1 * * * * ?")
    public void send(){
        String message = UUID.randomUUID().toString();
        ListenableFuture future = kafkaTemplate.send("tests", message);
        future.addCallback(o -> System.out.println("send-消息发送成功：" + message),
                throwable -> System.out.println("消息发送失败：" + message));
    }
}
