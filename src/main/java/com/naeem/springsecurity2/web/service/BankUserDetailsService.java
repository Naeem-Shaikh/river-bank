package com.naeem.springsecurity2.web.service;

import com.naeem.springsecurity2.web.config.CustomerDetails;
import com.naeem.springsecurity2.web.entity.Customer;
import com.naeem.springsecurity2.web.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BankUserDetailsService implements UserDetailsService {

@Autowired
    private CustomerRepository customerRepository;

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        List<Customer> customers = customerRepository.findByEmail( username);
        if(customers.size()==0){
            throw  new UsernameNotFoundException("User Not Found "+username);
        }
        return new CustomerDetails(customers.get(0));
    }
}
