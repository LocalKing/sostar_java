package com.sostar.bean.result;

import java.io.Serializable;

/**
 * Created by liuyang on 2017/3/6.
 */
public class SetEmployerOrderResult implements Serializable {
   private String orderId;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
}
