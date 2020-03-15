package com.weipt.dao.impl;

import com.weipt.dao.IUserDao;
import com.weipt.pojo.User;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class UserDao implements IUserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void insert(User user) {
        Object[] objects = new Object[]{user.getUser_name(),user.getUser_pwd(),user.getUser_age()};
        int insertNum = jdbcTemplate.update("insert into user_test values (?,?,?)", objects);
        System.out.println("当前共插入："+insertNum);
    }

    @Override
    public Map<String, Object> querySingle(Object o) {
        Map<String, Object> stringObjectMap = jdbcTemplate.queryForMap(
                "select * from user_test where user_name = ?", o);
        return stringObjectMap;
    }
}
