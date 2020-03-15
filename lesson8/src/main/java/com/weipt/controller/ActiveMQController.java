package com.weipt.controller;

import com.weipt.activemq.Consumer;
import com.weipt.activemq.Producer;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.jms.Destination;

/**
 * @program: SpringBoot_learning
 * @description: ActiveMQ controller
 * @author: weipt
 * @create: 2020-03-15 20:27
 **/
@Controller
public class ActiveMQController {

    @Autowired
    private Producer producer;

    public void testSend(){
        Destination des = new ActiveMQQueue("MyQueue");
        producer.sendMessage(des, "hello ActiveMQ");
    }
}
