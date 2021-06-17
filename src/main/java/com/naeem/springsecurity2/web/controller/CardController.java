package com.naeem.springsecurity2.web.controller;

import com.naeem.springsecurity2.web.entity.Cards;
import com.naeem.springsecurity2.web.entity.Customer;
import com.naeem.springsecurity2.web.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CardController {

    @Autowired
    private CardRepository cardRepository;

    @PostMapping("/myCards")
    public List<Cards> getCards(@RequestBody Customer customer){
        List<Cards> cards = cardRepository.findByCustomerId(customer.getId());
        if(cards != null){
            return cards;
        }else{
            return null;
        }
    }
}
