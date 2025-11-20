package com.tave.easybackend.domain.project.entity;

import com.tave.easybackend.domain.project.dto.request.ProjectSaveDto;
import com.tave.easybackend.global.common.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Table
@Getter
@Entity
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Project extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String teamName;

    private String part;

    @Column(columnDefinition = "TEXT")
    private String description;

    public static Project from(ProjectSaveDto dto) {
        return Project.builder()
                .teamName(dto.teamName())
                .part(dto.part())
                .description(dto.description())
                .build();
    }

}
