package com.naeem.springsecurity2.web.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="loans")
@Data
public class Loans {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="loan_number")
    private int loanId;
    private int customerId;
    @Column(name="start_dt")
    private Date startDate;
    private String loanType;
    private int totalLoan;
    private int amountPaid;
    private int outstandingAmount;
    @Column(name="create_dt")
    private String createdDate;

}
