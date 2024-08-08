package com.panha.base.response;

import org.springframework.http.HttpStatus;
import java.util.List;
import org.springframework.data.domain.Page;

public interface ResponseFormat {
    <T> ResponseDTO respondCustomStatus(T data, HttpStatus status, String message);

    <T> ResponseDTO respondDynamic(T data, HttpStatus status, String message, Long total);

    <T> ResponseDTO respondID(T data, HttpStatus status, String message);

    <T> ResponseDTO respondList(List<T> data, HttpStatus status, String message);

    <T> ResponseDTO respondObj(T data, HttpStatus status, String message);

    <T> ResponseDTO respondPage(Page<T> data, HttpStatus status, String message);
}
