package com.learn.controller;

import com.learn.service.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/demo")
public class comtroller {
    @Autowired
    public com.learn.service.service service;
    @RequestMapping("/test")
    public String test()
    {
        service.serviceTset();
        System.out.println("Controller执行成功！");
        return "test";
    }
}

