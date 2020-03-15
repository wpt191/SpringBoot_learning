package com.weipt.websocket.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @program: SpringBoot_learning
 * @description: 服务端向客户端发送数据
 * @author: weipt
 * @create: 2020-03-15 21:21
 **/
@Data
@AllArgsConstructor
public class SocketResponse {
    private String responseMessage;
}
