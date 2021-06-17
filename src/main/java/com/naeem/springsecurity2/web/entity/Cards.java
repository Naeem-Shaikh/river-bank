package com.naeem.springsecurity2.web.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="cards")
@Data
public class Cards {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cardId;
    private int customerId;
    private String cardNumber;
    private String cardType;
    private int totalLimit;
    private int amountUsed;
    private int availableAmount;
    @Column(name="create_dt")
    private Date createdDate;

}
