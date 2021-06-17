package com.naeem.springsecurity2.web.repository;

import com.naeem.springsecurity2.web.entity.Notice;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface NoticeRepository extends CrudRepository<Notice,Long> {

   // @Query(value = "from Notice n where CURDATE() BETWEEN noticBegDt AND noticEndDt")
    @Query(value = "from Notice t where CURDATE() BETWEEN noticBegDt AND noticEndDt")
    List<Notice> findAllActiveNotices();
}
