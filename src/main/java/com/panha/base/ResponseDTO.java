package com.panha.base;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class ResponseDTO {
    private Integer code;
    private Object data;
    private Object dataList;
    private Object error;
    private String message;
    private Date timestamp;
    private Long total;

    public ResponseDTO() {
    }

    public ResponseDTO(Integer code, String message, Date timestamp, Object data, Object dataList, Long total, Object error) {
        this.code = code;
        this.message = message;
        this.timestamp = timestamp;
        this.data = data;
        this.dataList = dataList;
        this.total = total;
        this.error = error;
    }

    // Getters and Setters
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Object getDataList() {
        return dataList;
    }

    public void setDataList(Object dataList) {
        this.dataList = dataList;
    }

    public Object getError() {
        return error;
    }

    public void setError(Object error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }
}
