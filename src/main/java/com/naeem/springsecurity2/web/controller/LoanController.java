package com.naeem.springsecurity2.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {
    @GetMapping("/myLoans")
    public String getLoans(){
        return "Here are Loan details from DB";
    }
}
