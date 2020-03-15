package com.weipt.service;

import com.weipt.pojo.User;

import java.util.List;

public interface IUserService {
    int insert(User user);

    List<User> selectByName(String name);

}
