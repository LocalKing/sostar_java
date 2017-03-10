package com.sostar.bean.result;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by mao_yejun on 2017/2/16.
 */
public class StaffCenterResult implements Serializable {

    @ApiModelProperty(value = "姓名")
    private String name;
    @ApiModelProperty(value = "电话")
    private String phone;
    @ApiModelProperty(value = "昵称")
    private String nickName;
    @ApiModelProperty(value = "性别 1男2女")
    private String sex;
    @ApiModelProperty(value = "年龄")
    private String age;
    @ApiModelProperty(value = "成交率")
    private String closeRate;
    @ApiModelProperty(value = "头像")
    private String picPath;
    @ApiModelProperty(value = "等级")
    private String evaluateLevel;
    @ApiModelProperty(value = "完成的订单")
    private BigInteger finishedOrders;
    @ApiModelProperty(value = "是否认证 0 未认证，1已认证")
    private String authentication;
    @ApiModelProperty(value ="简介")
    private String introduction;
    @ApiModelProperty(value ="接单范围")
    private BigDecimal rangeArea;
    @ApiModelProperty(value = "证件照反面", required = true)
    private String picCerOppo;
    @ApiModelProperty(value = "证件照正面", required = true)
    private String picCerpos;
    @ApiModelProperty(value = "身份证号", required = false)
    private String certificateId;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPicCerOppo() {
        return picCerOppo;
    }

    public void setPicCerOppo(String picCerOppo) {
        this.picCerOppo = picCerOppo;
    }

    public String getPicCerpos() {
        return picCerpos;
    }

    public void setPicCerpos(String picCerpos) {
        this.picCerpos = picCerpos;
    }

    public String getCertificateId() {
        return certificateId;
    }

    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
    }

    public BigDecimal getRangeArea() {
        return rangeArea;
    }

    public void setRangeArea(BigDecimal rangeArea) {
        this.rangeArea = rangeArea;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getAuthentication() {
        return authentication;
    }

    public void setAuthentication(String authentication) {
        this.authentication = authentication;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCloseRate() {
        return closeRate;
    }

    public void setCloseRate(String closeRate) {
        this.closeRate = closeRate;
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    public String getEvaluateLevel() {
        return evaluateLevel;
    }

    public void setEvaluateLevel(String evaluateLevel) {
        this.evaluateLevel = evaluateLevel;
    }

    public BigInteger getFinishedOrders() {
        return finishedOrders;
    }

    public void setFinishedOrders(BigInteger finishedOrders) {
        this.finishedOrders = finishedOrders;
    }
}
