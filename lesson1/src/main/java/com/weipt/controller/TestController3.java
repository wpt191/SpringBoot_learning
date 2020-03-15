package com.weipt.controller;

import com.weipt.pojo.User;
import com.weipt.service.IAsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.concurrent.Future;

@RestController
@RequestMapping("/hello3")
public class TestController3 {

    @RequestMapping("/test1")
    public Object test1(){
        User user = new User("魏平涛",12,new Date());
        return user;
    }

    //测试全局异常拦截器
    @RequestMapping("/test2")
    public Object test2(){
        return 5/0;
    }

    @Autowired
    private IAsyncService iAsyncService;
    //测试异步调用
    @RequestMapping("/test3")
    public String test3() throws Exception{
        long start = System.currentTimeMillis();
        Future<String> task1 = iAsyncService.doTask1();
        Future<String> task2 = iAsyncService.doTask2();
        Future<String> task3 = iAsyncService.doTask3();
        while (true){
            if(task1.isDone() && task2.isDone() && task3.isDone()){
                break;
            }
            Thread.sleep(1000);
        }
        long end = System.currentTimeMillis();
        return "全部执行完成："+(end-start)+"ms";
    }
}
