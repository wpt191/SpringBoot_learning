package com.weipt.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {

    private String user_name;
    private String user_pwd;
    private int user_age;
}
