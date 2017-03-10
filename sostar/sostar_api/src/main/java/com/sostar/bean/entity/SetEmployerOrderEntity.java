package com.sostar.bean.entity;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by liuyang on 2017/3/6.
 */
public class SetEmployerOrderEntity implements Serializable {
    private String userId;
    @ApiModelProperty(value = "零工类型")
    private String jobType;
    @ApiModelProperty(value = "开始时间")
    private String startTime;
    @ApiModelProperty(value = "结束时间")
    private String endTime;
    @ApiModelProperty(value = "用工时间")
    private String periodTime;
    @ApiModelProperty(value = "用工人数")
    private int staffAccount;
    @ApiModelProperty(value = "工作报酬")
    private double unitPrice;
    @ApiModelProperty(value = "工作报酬单位:1按日 2按小时")
    private String unitPriceType;
    @ApiModelProperty(value = "结算形式  1 日结 2定单结" )
    private String paymentType;
    @ApiModelProperty(value = "性别要求 0 男女不限1男2女")
    private String sex;
    @ApiModelProperty(value = "工作地点")
    private String address;
    @ApiModelProperty(value = "是否需要雇主确认 1 需要，0不需要")
    private String confirmFlg;
    @ApiModelProperty(value = "详细描述")
    private String description;
    @ApiModelProperty(value = "订单范围")
    private String orderRange;
    @ApiModelProperty(value = "经度")
    private String longitude;
    @ApiModelProperty(value = "纬度")
    private String latitude;
    @ApiModelProperty(value = "图片")
    private String picList;
    @ApiModelProperty(value = "订单起始时间")
    private Date leastTime;
    @ApiModelProperty(value = "订单结束时间")
    private Date laggestTime;
    @ApiModelProperty(value = "订单类型1.已发单2.已成单3.已完成0.草稿")
    private String orderStatus;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

    public String getUnitPriceType() {
        return unitPriceType;
    }

    public void setUnitPriceType(String unitPriceType) {
        this.unitPriceType = unitPriceType;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getConfirmFlg() {
        return confirmFlg;
    }

    public void setConfirmFlg(String confirmFlg) {
        this.confirmFlg = confirmFlg;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOrderRange() {
        return orderRange;
    }

    public void setOrderRange(String orderRange) {
        this.orderRange = orderRange;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getPicList() {
        return picList;
    }

    public void setPicList(String picList) {
        this.picList = picList;
    }

    public Date getLeastTime() {
        return leastTime;
    }

    public void setLeastTime(Date leastTime) {
        this.leastTime = leastTime;
    }

    public Date getLaggestTime() {
        return laggestTime;
    }

    public void setLaggestTime(Date laggestTime) {
        this.laggestTime = laggestTime;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
}
