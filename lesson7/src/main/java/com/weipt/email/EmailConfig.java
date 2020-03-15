package com.weipt.email;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @program: SpringBoot_learning
 * @description: 邮件配置类，通过获取配置文件中数据来初始化邮件类
 * @author: weipt
 * @create: 2020-03-15 16:43
 **/

@Data
@Component
public class EmailConfig {

    @Value("${spring.mail.username}")
    private String emailForm;
}
