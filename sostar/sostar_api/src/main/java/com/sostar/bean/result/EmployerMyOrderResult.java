package com.sostar.bean.result;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by liuyang on 2017/2/16.
 */
public class EmployerMyOrderResult implements Serializable {
    private int orderId;
    @ApiModelProperty(value = "零工类型")
    private String jobType;
    @ApiModelProperty(value = "开始时间")
    private String startTime;
    @ApiModelProperty(value = "结束时间")
    private String endTime;
    @ApiModelProperty(value = "工期")
    private String periodTime;
    @ApiModelProperty(value = "招工人数")
    private int staffAccount;
    @ApiModelProperty(value = "价格")
    private double unitPrice;
    @ApiModelProperty(value = "支付形式")
    private String paymentType;
    @ApiModelProperty(value = "性别限制")
    private String sex;
    @ApiModelProperty(value = "简介")
    private String descrebtion;
    @ApiModelProperty(value = "是否确认")
    private String confirmFlg;
    @ApiModelProperty(value = "地址")
    private String address;
    @ApiModelProperty(value = "经度")
    private double longitude;
    @ApiModelProperty(value = "纬度")
    private double latitude;
    @ApiModelProperty(value = "订单范围")
    private int orderRange;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getPeriodTime() {
        return periodTime;
    }

    public void setPeriodTime(String periodTime) {
        this.periodTime = periodTime;
    }

    public int getStaffAccount() {
        return staffAccount;
    }

    public void setStaffAccount(int staffAccount) {
        this.staffAccount = staffAccount;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDescrebtion() {
        return descrebtion;
    }

    public void setDescrebtion(String descrebtion) {
        this.descrebtion = descrebtion;
    }

    public String getConfirmFlg() {
        return confirmFlg;
    }

    public void setConfirmFlg(String confirmFlg) {
        this.confirmFlg = confirmFlg;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public int getOrderRange() {
        return orderRange;
    }

    public void setOrderRange(int orderRange) {
        this.orderRange = orderRange;
    }
}
