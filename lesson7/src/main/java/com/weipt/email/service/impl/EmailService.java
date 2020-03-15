package com.weipt.email.service.impl;

import com.weipt.email.EmailConfig;
import com.weipt.email.service.IEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

/**
 * @program: SpringBoot_learning
 * @description: 调用java自带api，进行邮件发送
 * @author: weipt
 * @create: 2020-03-15 16:47
 **/
@Service
public class EmailService implements IEmailService {

    @Autowired
    private EmailConfig emailConfig;

    @Autowired
    private JavaMailSender mailSender;

    @Override
    public void sendMsg(String target, String title, String content) {
        //实现简单的纯文件邮件发送
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(emailConfig.getEmailForm());
        message.setTo(target);
        message.setSubject(title);
        message.setText(content);
        mailSender.send(message);
    }

    @Override
    public void sendMsg(String target, String title, String content, File file) {
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        try {
            MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
            helper.setFrom(emailConfig.getEmailForm());
            helper.setTo(target);
            helper.setSubject(title);
            helper.setText(content);
            FileSystemResource r = new FileSystemResource(file);
            helper.addAttachment("附件", r);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
        mailSender.send(mimeMessage);
    }
}
