package com.sostar.bean.param;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * Created by liuyang on 2017/2/16.
 */
public class EmployerInfoParam implements Serializable {
    private int userId;
    @ApiModelProperty(value = "公司logo", required = false)
    private String logoPath;
    @ApiModelProperty(value = "公司名称", required = true)
    private String companyName;
    @ApiModelProperty(value = "联系电话", required = true)
    private String contactPhone;
    @ApiModelProperty(value = "公司简介", required = false)
    private String introduction;
    @ApiModelProperty(value = "公司地址", required = true)
    private String address;
    @ApiModelProperty(value = "发单范围", required = true)
    private String rangeArea;
    @ApiModelProperty(value = "网址", required = true)
    private String webAddress;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getLogoPath() {
        return logoPath;
    }

    public void setLogoPath(String logoPath) {
        this.logoPath = logoPath;
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

    public String getRangeArea() {
        return rangeArea;
    }

    public void setRangeArea(String rangeArea) {
        this.rangeArea = rangeArea;
    }

    public String getWebAddress() {
        return webAddress;
    }

    public void setWebAddress(String webAddress) {
        this.webAddress = webAddress;
    }
}
