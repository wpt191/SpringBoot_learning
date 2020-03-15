package com.weipt.controller;

import com.weipt.pojo.User;
import com.weipt.service.IuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("/jdbc")
public class JdbcController {

    @Autowired
    private IuserService iuserService;


    @RequestMapping("/insert")
    public void testJdbcInsert(){
        User user = new User("weipt","123",17);
        iuserService.insert(user);
    }

    @RequestMapping("/query")
    @ResponseBody
    public Map<String, Object> testJdbcQuery(){
        return iuserService.querySingle("weipt");
    }

}
