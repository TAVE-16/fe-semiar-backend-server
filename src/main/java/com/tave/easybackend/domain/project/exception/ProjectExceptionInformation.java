package com.tave.easybackend.domain.project.exception;

import com.tave.easybackend.global.common.exception.ExceptionInformation;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ProjectExceptionInformation implements ExceptionInformation {

    PROJECT_PART_NOT_MATCH(HttpStatus.BAD_REQUEST, "PRO-400", "프로젝트 [분야]를 제대로 입력해주세요."),
    PROJECT_NOT_FOUND(HttpStatus.BAD_REQUEST, "PRO-401", "해당 프로젝트를 찾을 수 없습니다."),
    ;

    private final HttpStatus httpStatus;
    private final String code;
    private final String message;

}
