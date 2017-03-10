package com.sostar.bean.common;

import java.io.Serializable;

/**
 * Created by mao_yejun on 2017/1/5.
 */
public class Response<T extends Serializable> implements Serializable {
    private String result;
    private T data;
    private String message;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
