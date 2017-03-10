package com.sostar.bean.param;

import java.io.Serializable;

/**
 * Created by mao_yejun on 2017/3/6.
 */
public class OrderReceiveParam implements Serializable {
    private String userId;
    private String orderId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
}
