package com.sostar.bean.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by mao_yejun on 2017/3/6.
 */
public class OrderEntity implements Serializable {
    private String companyName;
    private int staffAccount;
    private int okStaffAccount;
    private String confirmFlg;
    private String orderId;
    private String createUserId;
    private String jobType;
    private String startTime;
    private String endTime;
    private String periodTime;
    private double unitPrice;
    private String paymentType;
    private String sex;
    private String address;
    private String description;
    private String orderRange;
    private String longitude;
    private String latitude;
    private String picList;
    private String orderStatus;
    private String logoPath;
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

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getConfirmFlg() {
        return confirmFlg;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public void setConfirmFlg(String confirmFlg) {
        this.confirmFlg = confirmFlg;
    }

    public int getStaffAccount() {
        return staffAccount;
    }

    public void setStaffAccount(int staffAccount) {
        this.staffAccount = staffAccount;
    }

    public int getOkStaffAccount() {
        return okStaffAccount;
    }

    public void setOkStaffAccount(int okStaffAccount) {
        this.okStaffAccount = okStaffAccount;
    }
}
