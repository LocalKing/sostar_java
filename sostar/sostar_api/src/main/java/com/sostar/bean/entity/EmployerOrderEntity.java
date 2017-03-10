package com.sostar.bean.entity;

import java.io.Serializable;

/**
 * Created by liuyang on 2017/3/6.
 */
public class EmployerOrderEntity implements Serializable {
    private String userId;
    private String orderStatus;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
}
