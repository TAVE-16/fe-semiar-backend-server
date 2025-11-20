package com.tave.easybackend.domain.project.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResponseMessage {

    PROJECT_CREATED("PRO-200", "[프로젝트]를 추가했습니다."),
    PROJECT_LIST("PRO-201", "[프로젝트 목록]을 조회합니다."),
    PROJECT_DETAIL("PRO-201", "[프로젝트]를 단건 조회합니다."),
    ;

    private final String code;
    private final String message;

}
