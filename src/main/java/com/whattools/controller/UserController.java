package com.whattools.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/test/user")
    public String  testUser() {
        System.out.println("test user");
        return "{'info':'springmvc'}";
    }
}
