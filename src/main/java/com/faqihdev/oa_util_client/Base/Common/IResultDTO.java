package com.faqihdev.oa_util_client.Base.Common;

import java.util.Map;

public interface IResultDTO <T>{

    T getResult();

    AResponseDataDTO getResponseData();

    Map<String, String> getMetadata();

}
