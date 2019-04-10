package com.ymstars.microservice.common.response;

import java.io.Serializable;

/**
 * Container For MicroServices Transfer
 *
 * @param <T>
 */
public class ResultResponse<T extends Serializable> implements Serializable {


    private static final int SUCCESS_CODE = 0;
    private static final String SUCCESS_MESSAGE = "SUCCESS";
    private static final int ERROR_CODE_UNKNOWN = 999999;
    private static final String ERROR_MESSAGE_UNKNOWN = "UNKOWN ERROR";
    private static final long serialVersionUID = -1558569760866186534L;

    private Integer code;

    private String message;

    private T data;

    public ResultResponse() {
    }

    public ResultResponse(T data) {
        this.data = data;
        this.code = SUCCESS_CODE;
        this.message = SUCCESS_MESSAGE;
    }

    public ResultResponse(Integer code, String message) {
        this.code = code;
        this.message = message;
        this.data = null;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static ResultResponse SUCCESS() {
        return new ResultResponse(SUCCESS_CODE, SUCCESS_MESSAGE);
    }

    public static <T extends Serializable> ResultResponse<T> SUCCESS(T data) {
        return new ResultResponse<T>(data);
    }

    public static <T extends Serializable> ResultResponse<T> ERROR(Integer code, String message) {
        return new ResultResponse<T>(code, message);
    }

    public static <T extends Serializable> ResultResponse<T> ERROR() {
        return new ResultResponse<T>(ERROR_CODE_UNKNOWN, ERROR_MESSAGE_UNKNOWN);
    }
}
