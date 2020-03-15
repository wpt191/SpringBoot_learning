package com.weipt.dao;

import com.weipt.pojo.User;

import java.util.List;

public interface IUserDao {

    int insert(User user);

    User selectByname(String name);

    List<User> selectByExample();
}
