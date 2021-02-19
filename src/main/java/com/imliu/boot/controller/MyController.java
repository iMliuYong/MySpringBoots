package com.imliu.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @RequestMapping("/Hello")
    public String HelloSpringBoot(){
        return "Hello SpringBoot 2";
    }
}
