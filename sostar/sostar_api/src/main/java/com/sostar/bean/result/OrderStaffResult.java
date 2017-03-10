package com.sostar.bean.result;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by mao_yejun on 2017/3/2.
 */
public class OrderStaffResult implements Serializable {
    private String orderId;
    @ApiModelProperty(value = "创建零工类型")
    private String jobType;
    @ApiModelProperty(value = "开始时间")
    private String startTime;
    @ApiModelProperty(value = "结束时间")
    private String endTime;
    @ApiModelProperty(value = "工期")
    private String periodTime;
    @ApiModelProperty(value = "招工人数")
    private int staffAccount;
    @ApiModelProperty(value = "已招工人数")
    private int okStaffAccount;
    @ApiModelProperty(value = "价格")
    private double unitPrice;
    @ApiModelProperty(value = "支付形式  1 日结 2定单结")
    private String paymentType;
    @ApiModelProperty(value = "性别限制 0 男女不限1男2女")
    private String sex;
    @ApiModelProperty(value = "简介")
    private String description;
    @ApiModelProperty(value = "是否需要雇主确认 1 需要，0不需要")
    private String confirmFlg;
    @ApiModelProperty(value = "订单状态 1 雇主已发单员工待接单 2 已成单 3.已完成 9 取消")
    private String orderStatus;
    @ApiModelProperty(value = "地址")
    private String address;
    @ApiModelProperty(value = "订单范围")
    private int orderRange;
    @ApiModelProperty(value = "公司名")
    private String companyName;
    @ApiModelProperty(value = "创建者UserId")
    private String createUserId;
    @ApiModelProperty(value = "经度")
    private String longitude;
    @ApiModelProperty(value = "纬度")
    private String latitude;
    @ApiModelProperty(value = "距离(单位km)")
    private String distance;
    @ApiModelProperty(value = "图片")
    private String[] picListArray;
    @ApiModelProperty(value = "公司logo")
    private String logoPath;
    @ApiModelProperty(value = "发单时间")
    private Date crtTime;

    public Date getCrtTime() {
        return crtTime;
    }

    public void setCrtTime(Date crtTime) {
        this.crtTime = crtTime;
    }

    public String getLogoPath() {
        return logoPath;
    }

    public void setLogoPath(String logoPath) {
        this.logoPath = logoPath;
    }

    public String[] getPicListArray() {
        return picListArray;
    }

    public void setPicListArray(String[] picListArray) {
        this.picListArray = picListArray;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
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

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getOkStaffAccount() {
        return okStaffAccount;
    }

    public void setOkStaffAccount(int okStaffAccount) {
        this.okStaffAccount = okStaffAccount;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
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

    public String getPeriodTime() {
        return periodTime;
    }

    public void setPeriodTime(String periodTime) {
        this.periodTime = periodTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getConfirmFlg() {
        return confirmFlg;
    }

    public void setConfirmFlg(String confirmFlg) {
        this.confirmFlg = confirmFlg;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getOrderRange() {
        return orderRange;
    }

    public void setOrderRange(int orderRange) {
        this.orderRange = orderRange;
    }
}
