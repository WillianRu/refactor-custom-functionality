package com.ikno.ikdata.model.api;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.ikno.ikdata.model.entity.BatchInstance;

public interface BatchInstanceCrud extends JpaRepository<BatchInstance, Long> {

    List<BatchInstance> findByModifiedDateGreaterThanEqualAndModifiedDateLessThanEqual(LocalDateTime startDate, LocalDateTime lastDate);

    // Custom select implementation
    List<BatchInstance> findByPages(int pages);

    BatchInstance findById(long id);

    BatchInstance findByIdIknoPlus(String idIknoPlus);

    List<BatchInstance> findByIdIknoPlusIn(List<String> IdIknoPlus);

    // Custom deletion returning the amount of rows affected
    Long deleteByName(String name);

    int countByProjectId(long projectId);

    int countByStatusContaining(String status);

    BatchInstance findTopByStatusOrderById(String status);

    List<BatchInstance> findByStatusIn(String[] status);

    BatchInstance findTopByStatusInOrderByIdDesc(String[] status);

    List<BatchInstance> findByProjectIdAndStatusIn(long projectId, String[] status);

    List<BatchInstance> findByNameLike(String name);

    BatchInstance findTopByStatusOrderByPriorityAscModifiedDate(String status);

    BatchInstance findTopByStatusOrderByPriorityAscId(String status);

}