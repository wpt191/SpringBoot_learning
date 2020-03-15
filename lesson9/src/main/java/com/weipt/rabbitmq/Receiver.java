package com.weipt.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @program: SpringBoot_learning
 * @description: 消息接受方
 * @author: weipt
 * @create: 2020-03-15 20:38
 **/
@Component
public class Receiver {

    @RabbitHandler
    @RabbitListener(queues = "myQueue")
    public void receiveMsg(String msg){
        System.out.println(msg);
    }
}
