package com.weipt.service;

import com.weipt.pojo.User;

import java.util.Map;

public interface IuserService {

    void insert(User user);

    Map<String, Object> querySingle(Object o);
}
