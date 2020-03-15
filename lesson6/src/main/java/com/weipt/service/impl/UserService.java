package com.weipt.service.impl;

import com.weipt.dao.IUserDao;
import com.weipt.pojo.User;
import com.weipt.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService implements IUserService {

    @Autowired
    private IUserDao iUserDao;

    @Override
    @Transactional
    public int insert(User user) {
        int returnNum = iUserDao.insert(user);
        //当我们先调用数据库操作，然后进行一个异常操作，那么数据库会执行成功，但service层失败
        //为了保持一致性，我们需要加上事务注解.一旦方法失败，就会回滚
        int i = 6/0;
        return returnNum;
    }

    @Override
    public List<User> selectByName(String name) {
        //iUserDao.selectByName(name)  可以调用到mybatis进行执行sql语句
        return iUserDao.selectByName(name);
    }
}
