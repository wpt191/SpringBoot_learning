package com.weipt.email.service;

import java.io.File;

public interface IEmailService {

    void sendMsg(String target, String title, String content);

    void sendMsg(String target, String title, String content, File file);
}
