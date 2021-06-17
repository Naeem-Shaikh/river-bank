package com.naeem.springsecurity2.web.controller;

import com.naeem.springsecurity2.web.entity.Customer;
import com.naeem.springsecurity2.web.entity.Loans;
import com.naeem.springsecurity2.web.repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LoanController {
    @Autowired
    private LoanRepository loanRepository;

    @PostMapping("/myLoans")
    public List<Loans> getLoanDetails(@RequestBody Customer customer) {
        List<Loans> loans = loanRepository.findByCustomerId(customer.getId());
        if (loans != null ) {
            return loans;
        }else {
            return null;
        }
    }
}
