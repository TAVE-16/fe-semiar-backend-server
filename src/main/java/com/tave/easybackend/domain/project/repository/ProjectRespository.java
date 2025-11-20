package com.tave.easybackend.domain.project.repository;

import com.tave.easybackend.domain.project.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRespository extends JpaRepository<Project, Long> {
}
