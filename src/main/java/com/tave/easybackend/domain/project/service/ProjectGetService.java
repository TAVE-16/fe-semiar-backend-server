package com.tave.easybackend.domain.project.service;

import com.tave.easybackend.domain.project.entity.Project;
import com.tave.easybackend.domain.project.exception.ProjectException;
import com.tave.easybackend.domain.project.repository.ProjectRespository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.tave.easybackend.domain.project.exception.ProjectExceptionInformation.PROJECT_NOT_FOUND;

@Service
@RequiredArgsConstructor
public class ProjectGetService {

    private final ProjectRespository projectRespository;

    public List<Project> findAll() {
        return projectRespository.findAll();
    }

    public Project findById(Long id) {
        return projectRespository.findById(id)
                .orElseThrow(() -> new ProjectException(PROJECT_NOT_FOUND));
    }

}
