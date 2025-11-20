package com.tave.easybackend.domain.project.facade;

import ch.qos.logback.core.model.processor.ProcessorException;
import com.tave.easybackend.domain.project.dto.request.ProjectSaveDto;
import com.tave.easybackend.domain.project.dto.response.ProjectDetailDto;
import com.tave.easybackend.domain.project.entity.Project;
import com.tave.easybackend.domain.project.exception.ProjectException;
import com.tave.easybackend.domain.project.service.ProjectGetService;
import com.tave.easybackend.domain.project.service.ProjectSaveService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

import static com.tave.easybackend.domain.project.exception.ProjectExceptionInformation.PROJECT_PART_NOT_MATCH;

@Service
@RequiredArgsConstructor
public class ProjectFacade {

    private final ProjectGetService projectGetService;
    private final ProjectSaveService projectSaveService;

    public void save(ProjectSaveDto dto) {
        validateProjectPart(dto.part());
        projectSaveService.saveProject(dto);
    }

    public List<ProjectDetailDto> readAllProject() {
        return projectGetService.findAll()
                .stream()
                .map(ProjectDetailDto::from)
                .toList();
    }

    public ProjectDetailDto readProject(Long id) {
        Project project = projectGetService.findById(id);
        return ProjectDetailDto.from(project);
    }

    private void validateProjectPart(String part) {
        if (!(part.equals("심화") || part.equals("연합"))) {
            throw new ProjectException(PROJECT_PART_NOT_MATCH);
        }
    }

}
