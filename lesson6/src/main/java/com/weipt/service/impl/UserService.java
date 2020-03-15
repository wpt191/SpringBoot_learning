package com.weipt.service.impl;

import com.weipt.dao.IUserDao;
import com.weipt.pojo.User;
import com.weipt.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {

    @Autowired
    private IUserDao iUserDao;

    @Override
    public int insert(User user) {
        return iUserDao.insert(user);
    }

    @Override
    public User selectByname(String name) {
        return null;
    }

    @Override
    public List<User> selectByExample() {
        return null;
    }
}
