package com.naeem.springsecurity2.web.controller;

import com.naeem.springsecurity2.web.entity.Customer;
import com.naeem.springsecurity2.web.entity.Notice;
import com.naeem.springsecurity2.web.repository.NoticeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NoticeController {
    @Autowired
    private NoticeRepository noticeRepository;

    @GetMapping("/notices")
    public List<Notice> getNotices() {
        List<Notice> notices = noticeRepository.findAllActiveNotices();
        if (notices != null ) {
            return notices;
        }else {
            return null;
        }
    }
}
