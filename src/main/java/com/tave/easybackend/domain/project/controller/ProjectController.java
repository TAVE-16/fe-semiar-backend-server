package com.tave.easybackend.domain.project.controller;

import com.tave.easybackend.domain.project.dto.request.ProjectSaveDto;
import com.tave.easybackend.domain.project.dto.response.ProjectDetailDto;
import com.tave.easybackend.domain.project.entity.Project;
import com.tave.easybackend.domain.project.facade.ProjectFacade;
import com.tave.easybackend.global.common.response.ApiResponse;
import io.swagger.v3.oas.annotations.Operation;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.tave.easybackend.domain.project.controller.ResponseMessage.*;

@RestController
@RequiredArgsConstructor
public class ProjectController {

    private final ProjectFacade facade;

    @Operation(description = "프로젝트 추가 API", summary = "프로젝트 추가 API")
    @PostMapping("/v1/projects")
    public ApiResponse<Void> createProject(@RequestBody @Validated ProjectSaveDto dto) {
        facade.save(dto);
        return ApiResponse.response(HttpStatus.OK, PROJECT_CREATED.getCode(), PROJECT_CREATED.getMessage(), null);
    }

    @Operation(description = "프로젝트 목록 조회 API", summary = "프로젝트 목록 조회 API")
    @GetMapping("/v1/projects")
    public ApiResponse<List<ProjectDetailDto>> readAllProjects() {
        List<ProjectDetailDto> data = facade.readAllProject();
        return ApiResponse.response(HttpStatus.OK, PROJECT_LIST.getCode(), PROJECT_LIST.getMessage(), data);
    }

    @Operation(description = "프로젝트 단건 조회 API", summary = "프로젝트 단건 조회 API")
    @GetMapping("/v1/projects/{projectId}")
    public ApiResponse<ProjectDetailDto> readProject(
            @PathVariable Long projectId
    ) {
        ProjectDetailDto data = facade.readProject(projectId);
        return ApiResponse.response(HttpStatus.OK, PROJECT_DETAIL.getCode(), PROJECT_DETAIL.getMessage(), data);
    }

}
