package com.naeem.springsecurity2.web.repository;

import com.naeem.springsecurity2.web.entity.Cards;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CardRepository extends CrudRepository<Cards, Long> {

    List<Cards> findByCustomerId(int id);
}
