package com.sostar.bean.result;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by mao_yejun on 2017/1/12.
 */
public class EmployerInfoResult implements Serializable {
    private String userId;
    @ApiModelProperty(value = "公司logo")
    private String logoPath;
    @ApiModelProperty(value = "是否认证:0 未认证；1 审核中；2 已认证")
    private String authentication;
    @ApiModelProperty(value = "成交率")
    private String closeRate;
    @ApiModelProperty(value = "公司名称")
    private String companyName;
    @ApiModelProperty(value = "联系电话")
    private String contactPhone;
    @ApiModelProperty(value = "公司简介")
    private String introduction;
    @ApiModelProperty(value = "公司地址")
    private String address;
    @ApiModelProperty(value = "企业识别代号")
    private String companyCode;
    @ApiModelProperty(value = "年检营业执照")
    private String licPath;
    @ApiModelProperty(value = "税务登记证")
    private String rifPath;
    @ApiModelProperty(value = "经度")
    private double longitude;
    @ApiModelProperty(value = "纬度")
    private double latitude;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getLogoPath() {
        return logoPath;
    }

    public void setLogoPath(String logoPath) {
        this.logoPath = logoPath;
    }

    public String getAuthentication() {
        return authentication;
    }

    public void setAuthentication(String authentication) {
        this.authentication = authentication;
    }

    public String getCloseRate() {
        return closeRate;
    }

    public void setCloseRate(String closeRate) {
        this.closeRate = closeRate;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getLicPath() {
        return licPath;
    }

    public void setLicPath(String licPath) {
        this.licPath = licPath;
    }

    public String getRifPath() {
        return rifPath;
    }

    public void setRifPath(String rifPath) {
        this.rifPath = rifPath;
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
