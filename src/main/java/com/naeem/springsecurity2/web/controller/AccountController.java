package com.naeem.springsecurity2.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @GetMapping("/notices")
    public String getNotices(){
        return "Hera are the notices deatials from the DB";
    }
}
