package com.weipt.controller;

import com.weipt.rabbitmq.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @program: SpringBoot_learning
 * @description: RabbitMQ
 * @author: weipt
 * @create: 2020-03-15 20:41
 **/
@Controller
public class RabbitMQController {

    @Autowired
    private Sender sender;

    public void testRabiMQ(){
        sender.send();
    }
}
