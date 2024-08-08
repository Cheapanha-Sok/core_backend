package com.panha.base;

import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;

public interface ResponseFormat {
    ResponseDTO respondCustomStatus(Object data, HttpStatus status, String message);

    ResponseDTO respondDynamic(Object data, HttpStatus status, String message, Long total);

    ResponseDTO respondID(Object data, HttpStatus status, String message);

    ResponseDTO respondList(java.util.List<Object> data, HttpStatus status, String message);

    ResponseDTO respondObj(Object data, HttpStatus status, String message);

    <T> ResponseDTO respondPage(Page<T> data, HttpStatus status, String message);
}
