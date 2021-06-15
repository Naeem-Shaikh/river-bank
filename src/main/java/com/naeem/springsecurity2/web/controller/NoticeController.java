package com.naeem.springsecurity2.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticeController {

    @GetMapping("/notices")
    public String getAccount(){
        return "Here are Notices details from DB";
    }
}
