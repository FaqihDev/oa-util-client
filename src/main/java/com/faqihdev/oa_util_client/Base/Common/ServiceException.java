package com.faqihdev.oa_util_client.Base.Common;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ServiceException extends RuntimeException {

    private String message;
    private Integer code;

}
