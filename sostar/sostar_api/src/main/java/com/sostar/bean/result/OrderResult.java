package com.sostar.bean.result;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by mao_yejun on 2017/2/28.
 */
public class OrderResult implements Serializable {
    private int orderId;
    @ApiModelProperty(value = "创建零工类型:0 其他;1 普工;2 技工时间")
    private String jobType;
    @ApiModelProperty(value = "开始时间")
    private Date startTime;
    @ApiModelProperty(value = "结束时间")
    private Date endTime;
    @ApiModelProperty(value = "工期")
    private double periedTime;
    @ApiModelProperty(value = "招工人数")
    private int woderAccount;
    @ApiModelProperty(value = "价格")
    private double unitPrice;
    @ApiModelProperty(value = "支付形式")
    private String paymentType;
    @ApiModelProperty(value = "性别限制")
    private String sex;
    @ApiModelProperty(value = "简介")
    private String descrebtion;
    @ApiModelProperty(value = "是否确认")
    private String confirnFlg;
    @ApiModelProperty(value = "订单状态")
    private String orderStatus;
    @ApiModelProperty(value = "地址")
    private String address;
    @ApiModelProperty(value = "经度")
    private double longitude;
    @ApiModelProperty(value = "纬度")
    private double latitude;
    @ApiModelProperty(value = "是否删除")
    private String delFlg;
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

    public double getPeriedTime() {
        return periedTime;
    }

    public void setPeriedTime(double periedTime) {
        this.periedTime = periedTime;
    }

    public int getWoderAccount() {
        return woderAccount;
    }

    public void setWoderAccount(int woderAccount) {
        this.woderAccount = woderAccount;
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

    public String getConfirnFlg() {
        return confirnFlg;
    }

    public void setConfirnFlg(String confirnFlg) {
        this.confirnFlg = confirnFlg;
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

    public String getDelFlg() {
        return delFlg;
    }

    public void setDelFlg(String delFlg) {
        this.delFlg = delFlg;
    }

    public int getOrderRange() {
        return orderRange;
    }

    public void setOrderRange(int orderRange) {
        this.orderRange = orderRange;
    }
}
