package com.panha.base.response;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.data.domain.Page;

import java.util.List;

@Component
public class JSONFormat implements ResponseFormat {

    @Override
    public <T> ResponseDTO respondCustomStatus(T data, HttpStatus status, String message) {
        return new ResponseDTO(status.value(), message, new java.util.Date(), data, null, null, null);
    }

    @Override
    public <T> ResponseDTO respondDynamic(T data, HttpStatus status, String message, Long total) {
        return new ResponseDTO(status.value(), message, new java.util.Date(), data, null, total, null);
    }

    @Override
    public <T> ResponseDTO respondID(T data, HttpStatus status, String message) {
        return new ResponseDTO(status.value(), message, new java.util.Date(), data, null, null, null);
    }

    @Override
    public <T> ResponseDTO respondList(List<T> data, HttpStatus status, String message) {
        return new ResponseDTO(status.value(), message, new java.util.Date(), null, data, null, null);
    }

    @Override
    public <T> ResponseDTO respondObj(T data, HttpStatus status, String message) {
        return new ResponseDTO(status.value(), message, new java.util.Date(), data, null, null, null);
    }

    @Override
    public <T> ResponseDTO respondPage(Page<T> data, HttpStatus status, String message) {
        return new ResponseDTO(status.value(), message, new java.util.Date(), null, data.getContent(), data.getTotalElements(), null);
    }
}
