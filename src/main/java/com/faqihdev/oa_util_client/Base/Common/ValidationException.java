package com.faqihdev.oa_util_client.Base.Common;

import jakarta.servlet.http.HttpServletRequest;
import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.util.Strings;
import org.springframework.http.HttpStatus;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Slf4j
@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ValidationException extends RuntimeException {

    private String message;
    private Integer code;

}
