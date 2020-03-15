package com.weipt.pojo;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    public String name;
    public int age;

    @JSONField(format = "yyyy-MM-dd hh:mm:ss")
    public Date date;
}
