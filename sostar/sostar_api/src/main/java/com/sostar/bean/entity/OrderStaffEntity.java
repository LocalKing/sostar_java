package com.sostar.bean.entity;

import com.sostar.bean.Pagination;
import com.sostar.bean.PaginationParam;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by mao_yejun on 2017/3/5.
 */
public class OrderStaffEntity implements Serializable {
    private String userId;
    private String minLng;
    private String  maxLat;
    private String minLat;
    private String maxLng;
    private String orderStatus;
    private Date crtTime;

    public Date getCrtTime() {
        return crtTime;
    }

    public void setCrtTime(Date crtTime) {
        this.crtTime = crtTime;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMinLng() {
        return minLng;
    }

    public void setMinLng(String minLng) {
        this.minLng = minLng;
    }

    public String getMaxLat() {
        return maxLat;
    }

    public void setMaxLat(String maxLat) {
        this.maxLat = maxLat;
    }

    public String getMinLat() {
        return minLat;
    }

    public void setMinLat(String minLat) {
        this.minLat = minLat;
    }

    public String getMaxLng() {
        return maxLng;
    }

    public void setMaxLng(String maxLng) {
        this.maxLng = maxLng;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
}
