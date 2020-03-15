package com.weipt.service.impl;

import com.weipt.dao.IUserDao;
import com.weipt.pojo.User;
import com.weipt.service.IuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserService implements IuserService {

    @Autowired
    private IUserDao userDao;

    @Override
    public void insert(User user) {
        userDao.insert(user);
    }

    @Override
    public Map<String, Object> querySingle(Object o) {
        return userDao.querySingle(o);
    }
}
