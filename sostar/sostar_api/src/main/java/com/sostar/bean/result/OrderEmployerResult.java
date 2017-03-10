package com.sostar.bean.result;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by liuyang on 2017/3/6.
 */
public class OrderEmployerResult implements Serializable {
    private int orderId;
    @ApiModelProperty(value = "创建零工类型:0 其他;1 普工;2 技工时间")
    private String jobType;
    @ApiModelProperty(value = "开始时间")
    private Date startTime;
    @ApiModelProperty(value = "结束时间")
    private Date endTime;
    @ApiModelProperty(value = "工期")
    private double periodTime;
    @ApiModelProperty(value = "招工人数")
    private int staffAccount;
    @ApiModelProperty(value = "价格")
    private double unitPrice;
    @ApiModelProperty(value = "支付形式  1 日结 2定单结" )
    private String paymentType;
    @ApiModelProperty(value = "性别限制 0 男女不限1男2女")
    private String sex;
    @ApiModelProperty(value = "简介")
    private String description;
    @ApiModelProperty(value = "是否需要雇主确认 1 需要，0不需要")
    private String confirmFlg;
    @ApiModelProperty(value = "订单状态")
    private String orderStatus;
    @ApiModelProperty(value = "地址")
    private String address;
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

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
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

    public double getPeriodTime() {
        return periodTime;
    }

    public void setPeriodTime(double periodTime) {
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
