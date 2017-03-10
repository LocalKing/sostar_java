package com.sostar.bean.result;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by mao_yejun on 2017/1/12.
 */
public class StaffInfoResult implements Serializable {
    private String staffId;
    private String userId;
    @ApiModelProperty(value = "员工姓名")
    private String name;
    @ApiModelProperty(value = "员工电话")
    private String phone;
    @ApiModelProperty(value = "员工性别")
    private String sex;
    @ApiModelProperty(value = "员工年龄")
    private String age;
    @ApiModelProperty(value = "员工星级")
    private String star;
    @ApiModelProperty(value = "员工简介")
    private String introduction;
    @ApiModelProperty(value = "成交率")
    private BigDecimal closeRate;
    @ApiModelProperty(value = "是否认证:0 未认证；1 已认证")
    private String authentication;
    @ApiModelProperty(value = "头像路径")
    private String picPath;
    @ApiModelProperty(value = "经度")
    private double longitude;
    @ApiModelProperty(value = "纬度")
    private double latitude;

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getStar() {
        return star;
    }

    public void setStar(String star) {
        this.star = star;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public BigDecimal getCloseRate() {
        return closeRate;
    }

    public void setCloseRate(BigDecimal closeRate) {
        this.closeRate = closeRate;
    }

    public String getAuthentication() {
        return authentication;
    }

    public void setAuthentication(String authentication) {
        this.authentication = authentication;
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
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
}
