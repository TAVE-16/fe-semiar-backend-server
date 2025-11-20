package com.tave.easybackend.domain.project.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;

public record ProjectSaveDto(

        @NotBlank
        @Schema(description = "산책방 제목", example = "스프링글스")
        String teamName,

        @NotBlank
        @Schema(description = "프로젝트 분야", example = "심화, 연합")
        String part,

        @NotBlank
        @Schema(description = "프로젝트 설명", example = " ~ 프로젝트 입니다!")
        String description
) {
}
