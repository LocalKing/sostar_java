package com.sostar.bean.param;

import com.sostar.bean.PaginationParam;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * Created by liuyang on 2017/2/16.
 */
public class StaffAuthParam implements Serializable {
    private int userId;
    @ApiModelProperty(value = "员工姓名", required = true)
    private String name;
    @ApiModelProperty(value = "联系电话", required = true)
    private String phone;
    @ApiModelProperty(value = "头像", required = false)
    private String picPath;
    @ApiModelProperty(value = "身份证号", required = false)
    private String certificateId;
    @ApiModelProperty(value = "简介", required = false)
    private String introduction;
    @ApiModelProperty(value = "地址", required = false)
    private String address;
    @ApiModelProperty(value = "证件照反面", required = true)
    private String picCerOppo;
    @ApiModelProperty(value = "证件照正面", required = true)
    private String picCerpos;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
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

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    public String getCertificateId() {
        return certificateId;
    }

    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
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
}
