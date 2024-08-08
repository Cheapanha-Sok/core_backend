package com.panha.base;

import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component
public class JSONFormat implements ResponseFormat {

    private static final HttpStatus DefaultHttpStatus = HttpStatus.OK;

    @Override
    public ResponseDTO respondCustomStatus(Object data, HttpStatus status, String message) {
        return new ResponseDTO(status.value(), message, new java.util.Date(), data, null, null, null);
    }

    @Override
    public ResponseDTO respondDynamic(Object data, HttpStatus status, String message, Long total) {
        return new ResponseDTO(status.value(), message, new java.util.Date(), data, null, total, null);
    }

    @Override
    public ResponseDTO respondID(Object data, HttpStatus status, String message) {
        return new ResponseDTO(status.value(), message, new java.util.Date(), data, null, null, null);
    }

    @Override
    public ResponseDTO respondList(java.util.List<Object> data, HttpStatus status, String message) {
        return new ResponseDTO(status.value(), message, new java.util.Date(), null, data, null, null);
    }

    @Override
    public ResponseDTO respondObj(Object data, HttpStatus status, String message) {
        return new ResponseDTO(status.value(), message, new java.util.Date(), data, null, null, null);
    }

    @Override
    public <T> ResponseDTO respondPage(Page<T> data, HttpStatus status, String message) {
        return new ResponseDTO(status.value(), message, new java.util.Date(), null, data.getContent(), data.getTotalElements(), null);
    }
}
