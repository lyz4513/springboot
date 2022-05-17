package com.example.springboot_hellword.controller;

import com.example.springboot_hellword.dao.UserDao;
import com.example.springboot_hellword.entity.po.UserPo;
import com.example.springboot_hellword.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    private static final String a = "ss";
    @Autowired
    private UserService userService;

    @Autowired
    private UserDao userDao;

    @GetMapping("/add")
    public void user (@Param("user") UserPo user) {
        userService.save(user);
    }

    @PostMapping("/update")
    public void update(@RequestBody UserPo user) {

    }

}
