package com.ikno.ikdata.model.api;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.ikno.ikdata.model.entity.Project;

public interface ProjectCrud extends JpaRepository<Project, Long> {

    List<Project> findAll();

    List<Project> findAllByOrderById();

    List<Project> findByEmailListeningTrue();

    boolean existsByListeningDirectory(String listeningDirectory);

    boolean existsByProjectName(String projectName);

    List<Project> findByPathExportDataIsNotNull();

    Project findByProjectName (String projectName);

    List<Project> findAllByCurrUserIsNull();

    List<Project> findAllByCurrUserIsNotNull();
}
