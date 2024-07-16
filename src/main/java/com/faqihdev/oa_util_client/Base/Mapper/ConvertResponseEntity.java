package com.faqihdev.oa_util_client.Base.Mapper;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.ResponseEntity;

@Getter
@Setter
public class ConvertResponseEntity<TARGET> {

    private TARGET target;
    private ResponseEntity<?> responseEntity;

}
