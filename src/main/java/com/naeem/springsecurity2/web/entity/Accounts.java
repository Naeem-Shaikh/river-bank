package com.naeem.springsecurity2.web.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="accounts")
@Data
public class Accounts {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int accountNumber;
    private int customerId;
    private String accountType;
    private String branchAddress;
    private Date createDt;
}
