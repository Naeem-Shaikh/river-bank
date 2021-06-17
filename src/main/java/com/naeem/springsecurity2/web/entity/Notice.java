package com.naeem.springsecurity2.web.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="notice_details")
@Data
public class Notice {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int noticeId;
    private String noticeSummary;
    private String noticeDetails;
    private Date noticBegDt;
    private Date noticEndDt;
    private Date createDt;
    private Date updateDt;
}
