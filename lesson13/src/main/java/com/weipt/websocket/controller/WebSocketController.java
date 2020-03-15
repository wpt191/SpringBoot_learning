package com.weipt.websocket.controller;

import com.weipt.websocket.pojo.SocketMsg;
import com.weipt.websocket.pojo.SocketResponse;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: SpringBoot_learning
 * @description:
 * @author: weipt
 * @create: 2020-03-15 21:22
 **/
@Controller
public class WebSocketController {

    private SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

    //当浏览器向服务器端发送STOMP请求时，通过@MessageMapping注解来映射/getServerTime地址
    @MessageMapping(value = "/getServerTime")
    //当服务端有消息时，会对订阅了@SendTo中的路径的客户端发送消息
    @SendTo(value = "/topic/getResponse")
    public SocketResponse serverTime(SocketMsg message) throws InterruptedException {
        return new SocketResponse(message.getMessage() + sf.format(new Date()));
    }

    @RequestMapping("run")
    public String toPage(){
        return "websocket";
    }
}
