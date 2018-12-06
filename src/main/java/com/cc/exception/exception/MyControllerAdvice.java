package com.cc.exception.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: cc
 * @Date: 2018-12-06 15:15
 * @Description: TODO
 */
@ControllerAdvice
public class MyControllerAdvice {

    @ResponseBody
    @ExceptionHandler(value = MyException.class)
    public Map<String,Object> exceptionHandler(MyException myex){
        Map<String,Object> map  = new HashMap<String,Object>();
        map.put("code",myex.getCode());
        map.put("message",myex.getMessage());
        map.put("method",myex.getMethod());
        map.put("descinfo",myex.getDescinfo());
        //发生异常进行日志记录，写入数据库或者其他处理，此处省略
        System.out.println("哈哈哈哈哈，异常被我捕获了，我要对她处理了");


        return map;
    }
}
