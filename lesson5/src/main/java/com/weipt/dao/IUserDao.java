package com.weipt.dao;

import com.weipt.pojo.User;

import java.util.Map;

public interface IUserDao {

    void insert(User user);

    Map<String, Object> querySingle(Object o);
}
