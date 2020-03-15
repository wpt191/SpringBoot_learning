package com.weipt.email.controller;

import com.weipt.email.service.IEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * @program: SpringBoot_learning
 * @description: 邮件发送入口
 * @author: weipt
 * @create: 2020-03-15 16:55
 **/
@RestController
@RequestMapping("/mail")
public class MailController {

    @Autowired
    private IEmailService emailService;

    @RequestMapping("/send")
    public String testSend(){
        emailService.sendMsg("weipt@dcits.com","SpringBoot纯文本测试","看到此内容，即为成功");
        return "SUCCESS";
    }

    @RequestMapping("/send2")
    public String testSend2(){
        File file = null;
        File file2 = null;
        try {
            file = ResourceUtils.getFile("classpath:static/111.txt"); //从项目中获取
            file2 = new File("D://111.txt");  //从本地获取
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        emailService.sendMsg("191075068@qq.com","SpringBoot附件测试","看到此内容，即为成功",file2);
        return "SUCCESS";
    }
}
