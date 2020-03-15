package com.weipt.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GolbeExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody  //以json返回数据
    public Map<String,Object> handleException(Exception e){
        Map<String,Object> map = new HashMap<>();
        map.put("error_code", 400);
        map.put("error_msg", e.toString());
        return map;
    }
}
