package com.weipt.activemq;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @program: SpringBoot_learning
 * @description: 消息监听者
 * @author: weipt
 * @create: 2020-03-15 20:25
 **/
@Component
public class Consumer {

    @JmsListener(destination = "MyQueue")
    public void receiveMsg(String msg){
        System.out.println(msg);
    }
}
