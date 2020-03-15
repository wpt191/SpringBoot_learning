package com.weipt.websocket.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;

/**
 * @program: SpringBoot_learning
 * @description: 配置类，websocket是一种全双工通讯
 * @author: weipt
 * @create: 2020-03-15 21:16
 **/
//WebSocket的配置类
@Configuration
//开启对WebSocket的支持
@EnableWebSocketMessageBroker
public class WebSocketConfig extends AbstractWebSocketMessageBrokerConfigurer {

    //注册一个STOMP协议的节点，并映射到指定的URL
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        //注册一个STOMP的endpoint,并指定使用SockJS协议
        registry.addEndpoint("/endpointSocket").withSockJS();
    }

    //配置消息代理
    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        //配置一个广播式的消息代理
        registry.enableSimpleBroker("/topic");
    }
}
