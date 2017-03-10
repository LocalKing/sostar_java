package com.sostar.bean.result;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * Created by mao_yejun on 2017/2/16.
 */
public class EmployerCenterResult implements Serializable {
    @ApiModelProperty(value = "企业识别代号")
    private String companyCode;
    @ApiModelProperty(value = "logo图片路径")
    private String logoPath;
    @ApiModelProperty(value = "是否认证 0 未认证，1已认证")
    private String authentication;
    @ApiModelProperty(value = "成交率")
    private String closeRate;
    @ApiModelProperty(value = "公司名称")
    private String companyName;
    @ApiModelProperty(value = "进行中的订单")
    private String ongoingOrder;
    @ApiModelProperty(value = "联系电话")
    private String contactPhone;
    @ApiModelProperty(value ="简介")
    private String introduction;
    @ApiModelProperty(value ="发单范围")
    private String rangeArea;
    @ApiModelProperty(value ="星级")
    private String star;
    @ApiModelProperty(value ="已发单数")
    private String finishedOrderNum;
    @ApiModelProperty(value ="消息数")
    private String messageNum;
    @ApiModelProperty(value = "年检营业执照")
    private String licPath;
    @ApiModelProperty(value = "税务登记证")
    private String rifPath;
    @ApiModelProperty(value = "证件", required = true)
    private String cerPath;
    @ApiModelProperty(value = "网址", required = true)
    private String webAddress;

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

    public String getCerPath() {
        return cerPath;
    }

    public void setCerPath(String cerPath) {
        this.cerPath = cerPath;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
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

    public String getOngoingOrder() {
        return ongoingOrder;
    }

    public void setOngoingOrder(String ongoingOrder) {
        this.ongoingOrder = ongoingOrder;
    }

    public String getRangeArea() {
        return rangeArea;
    }

    public void setRangeArea(String rangeArea) {
        this.rangeArea = rangeArea;
    }

    public String getStar() {
        return star;
    }

    public void setStar(String star) {
        this.star = star;
    }

    public String getFinishedOrderNum() {
        return finishedOrderNum;
    }

    public void setFinishedOrderNum(String finishedOrderNum) {
        this.finishedOrderNum = finishedOrderNum;
    }

    public String getMessageNum() {
        return messageNum;
    }

    public void setMessageNum(String messageNum) {
        this.messageNum = messageNum;
    }

    public String getWebAddress() {
        return webAddress;
    }

    public void setWebAddress(String webAddress) {
        this.webAddress = webAddress;
    }
}
