package com.weipt.dao;

import com.weipt.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IUserDao {

    int insert(User user);

    List<User> selectByName(String name);


    /**
     * 可利用mubatis注解进行sql编写
     * 不推荐，因为sql复杂的情况下，可读性很差
     * @param name
     * @return
     */
    @Select("select * from user_test where user_name = #{name}")
    User selectOneByName(@Param("name") String name);
}
