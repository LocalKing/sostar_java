package com.sostar.bean.param;

import com.sostar.bean.PaginationParam;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * Created by liuyang on 2017/2/20.
 */
public class EmployerSetMsgParam implements Serializable {
    private int userId;
    private String orderId;
    @ApiModelProperty(value = "消息内容", required = true)
    private String msg;
    @ApiModelProperty(value = "接受者id", required = true)
    private String receiverId;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(String receiverId) {
        this.receiverId = receiverId;
    }
}
