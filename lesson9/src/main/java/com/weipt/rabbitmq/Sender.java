package com.weipt.rabbitmq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @program: SpringBoot_learning
 * @description: 消息发送方
 * @author: weipt
 * @create: 2020-03-15 20:36
 **/
@Component
public class Sender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public String  send() {
        this.rabbitTemplate.convertAndSend("myQueue", "hello");
        return "发送成功";
    }

}
