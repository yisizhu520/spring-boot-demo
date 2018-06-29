package com.example.springbootdemo.controller;

import com.example.springbootdemo.repository.UserRepository;
import com.example.springbootdemo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/getUser")
    public User getUser() {
        User user=new User();
        user.setEmail("191473@qq.com");
        user.setUserName("191473@qq.com");
        user.setNickName("小明");
        user.setPassWord("123456");
        userRepository.save(user);
        return user;
    }
}