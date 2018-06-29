package com.example.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @RequestMapping("/hello2")
    public String hello2() {
        return "Hello World 2";
    }

    @RequestMapping("/hello3")
    public String hello3() {
        return "Hello World 3";
    }

    @RequestMapping("/hello4")
    public String hello4() {
        return "Hello World 4";
    }
}