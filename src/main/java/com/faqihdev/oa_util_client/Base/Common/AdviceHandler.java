package com.faqihdev.oa_util_client.Base.Common;

import jakarta.servlet.http.HttpServletRequest;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;


@RestControllerAdvice
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class AdviceHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(ValidationException.class)
    public IResultDTO<?> handleValidationException(ValidationException e, HttpServletRequest request) {
        return APIResponseBuilder.badRequest(null,e,e.getMessage(),request);
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(ServiceException.class)
    public IResultDTO<?> handleServiceException(ServiceException e, HttpServletRequest request) {
        return APIResponseBuilder.badRequest(null,e,e.getMessage(),request);
    }


}
