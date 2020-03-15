package com.weipt.controller;

import com.weipt.pojo.User;
import com.weipt.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/mybatis")
public class MybatisController {

    @Autowired
    private IUserService iUserService;

    @RequestMapping("/insert")
    public int testInsert(){
        User user = new User("lijiao","123",22);
        return iUserService.insert(user);
    }

    @RequestMapping("/select")
    public List<User> testSelect(){
        return iUserService.selectByName("lijiao");
    }
}
