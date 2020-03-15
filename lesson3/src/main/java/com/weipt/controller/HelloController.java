package com.weipt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * 利用thymeleaf替代jsp
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/test")
    public String test(Model model){
        model.addAttribute("name","魏平涛");
        return "index";
    }
}
