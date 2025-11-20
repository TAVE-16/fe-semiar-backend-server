package com.tave.easybackend.domain.project.dto.response;

import com.tave.easybackend.domain.project.entity.Project;
import lombok.Builder;

@Builder
public record ProjectDetailDto(
        Long projectId,
        String teamName,
        String part,
        String description
) {
    public static ProjectDetailDto from(Project project) {
        return ProjectDetailDto.builder()
                .projectId(project.getId())
                .teamName(project.getTeamName())
                .part(project.getPart())
                .description(project.getDescription())
                .build();
    }
}
