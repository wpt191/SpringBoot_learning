package com.weipt.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.annotation.Schedules;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class MyJob {

    @Scheduled(fixedRate = 1000)
    public void run(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd hhmmss");
        String nowData = simpleDateFormat.format(new Date());
        System.out.println(nowData);
    }
}
