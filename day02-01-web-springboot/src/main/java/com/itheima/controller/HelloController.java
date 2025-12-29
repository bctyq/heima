package com.itheima.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(String name){
        System.out.println("执行处理请求hello的方法，接收到的数据："+name);
        return "Hello "+name+" ~";
    }
}
