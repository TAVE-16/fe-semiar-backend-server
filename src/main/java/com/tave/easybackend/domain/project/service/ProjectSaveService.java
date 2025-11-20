package com.tave.easybackend.domain.project.service;

import com.tave.easybackend.domain.project.dto.request.ProjectSaveDto;
import com.tave.easybackend.domain.project.entity.Project;
import com.tave.easybackend.domain.project.repository.ProjectRespository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ProjectSaveService {

    private final ProjectRespository projectRespository;

    @Transactional
    public void saveProject(ProjectSaveDto dto) {
        projectRespository.save(Project.from(dto));
    }

}
