package com.naeem.springsecurity2.web.repository;

import com.naeem.springsecurity2.web.entity.Loans;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LoanRepository extends CrudRepository<Loans,Long> {
    public List<Loans> findByCustomerId(int id);
}
