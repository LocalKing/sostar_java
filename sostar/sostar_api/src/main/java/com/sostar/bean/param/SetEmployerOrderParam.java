package com.sostar.bean.param;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by liuyang on 2017/3/6.
 */
public class SetEmployerOrderParam implements Serializable {
    private String userId;
    @ApiModelProperty(value = "零工类型")
    private String jobType;
    @ApiModelProperty(value = "开始时间")
    private String startTime;
    @ApiModelProperty(value = "结束时间")
    private String endTime;
    @ApiModelProperty(value = "用工日期")
    private ArrayList<PeriodTime> periodTimeList;
    @ApiModelProperty(value = "用工人数")
    private int staffAccount;
    @ApiModelProperty(value = "工作报酬")
    private double unitPrice;
    @ApiModelProperty(value = "工作报酬单位:1按日 2按小时")
    private String unitPriceType;
    @ApiModelProperty(value = "结算形式  1日结 2定单结" )
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
    private String[] picListArray;
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

    public ArrayList<PeriodTime> getPeriodTimeList() {
        return periodTimeList;
    }

    public void setPeriodTimeList(ArrayList<PeriodTime> periodTimeList) {
        this.periodTimeList = periodTimeList;
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

    public String[] getPicListArray() {
        return picListArray;
    }

    public void setPicListArray(String[] picListArray) {
        this.picListArray = picListArray;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
}
