package com.example.springboot_hellword.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    private static final String a = "ss";

    @GetMapping("a")
    public void user () {
        System.out.println(a);
    }
}
