package com.sostar.bean.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by mao_yejun on 2017/3/6.
 */
public class OrderRelationEntity implements Serializable {
    private String orderId;
    private String staffUserId;
    private String confirmFlg;
    private String status;
    private Date crtTime;
    private Date confirmTime;
    private String okFlg;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getStaffUserId() {
        return staffUserId;
    }

    public void setStaffUserId(String staffUserId) {
        this.staffUserId = staffUserId;
    }

    public String getConfirmFlg() {
        return confirmFlg;
    }

    public void setConfirmFlg(String confirmFlg) {
        this.confirmFlg = confirmFlg;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCrtTime() {
        return crtTime;
    }

    public void setCrtTime(Date crtTime) {
        this.crtTime = crtTime;
    }

    public Date getConfirmTime() {
        return confirmTime;
    }

    public void setConfirmTime(Date confirmTime) {
        this.confirmTime = confirmTime;
    }

    public String getOkFlg() {
        return okFlg;
    }

    public void setOkFlg(String okFlg) {
        this.okFlg = okFlg;
    }
}
