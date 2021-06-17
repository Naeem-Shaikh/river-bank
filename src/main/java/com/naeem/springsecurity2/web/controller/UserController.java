package com.naeem.springsecurity2.web.controller;

import com.naeem.springsecurity2.web.entity.Customer;
import com.naeem.springsecurity2.web.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/user")
    public Customer getUserDetailsAfterLogin(Principal user){
        List<Customer> customers = customerRepository.findByEmail(user.getName());
        if(customers.size()>0){
            return customers.get(0);
        }else{
            return  null;
        }
    }
}
