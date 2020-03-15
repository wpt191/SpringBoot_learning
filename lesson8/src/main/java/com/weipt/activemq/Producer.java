package com.weipt.activemq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

import javax.jms.Destination;


/**
 * @program: SpringBoot_learning
 * @description: 消息发送者
 * @author: weipt
 * @create: 2020-03-15 20:22
 **/
@Component
public class Producer {

    @Autowired
    private JmsMessagingTemplate template;

    public void sendMessage(Destination des, String msg){
        template.convertAndSend(des, msg);
    }
}
