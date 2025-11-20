package com.tave.easybackend.domain.project.exception;

import com.tave.easybackend.global.common.exception.BaseException;
import com.tave.easybackend.global.common.exception.ExceptionInformation;

public class ProjectException extends BaseException {
    public ProjectException(ExceptionInformation information) {
        super(information);
    }
}
