package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author:小枫
 * date:2024/8/13
 * description:
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        System.out.println("Hello Spring!");
        return "Hello Spring!";
    }
}
