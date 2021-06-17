package com.naeem.springsecurity2.web.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="account_transactions")
@Data
public class AccountTransactions {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String transactionId;
    private int accountNumber;
    private int customerId;
    private Date transactionDt;
    private String transactionSummary;
    private String transactionType;
    private int transactionAmt;
    private int closingBalance;
    private Date createDt;
}
