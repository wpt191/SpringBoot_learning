package com.weipt.service;

import com.weipt.pojo.User;

import java.util.List;

public interface IUserService {
    int insert(User user);

    User selectByname(String name);

    List<User> selectByExample();
}
