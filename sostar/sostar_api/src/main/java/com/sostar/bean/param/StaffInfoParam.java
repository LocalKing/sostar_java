package com.sostar.bean.param;

import com.sostar.bean.PaginationParam;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * Created by liuyang on 2017/2/16.
 */
public class StaffInfoParam implements Serializable {
    @ApiModelProperty(value = "员工姓名", required = true)
    private int userId;
    @ApiModelProperty(value = "员工昵称", required = false)
    private String nickName;
    @ApiModelProperty(value = "性别", required = false)
    private String sex;
    @ApiModelProperty(value = "年龄", required = false)
    private String age;
    @ApiModelProperty(value = "是否认证 0 未认证，1已认证，2认证中", required = false)
    private String authentication;
    @ApiModelProperty(value = "简介", required = false)
    private String introduction;
    @ApiModelProperty(value = "头像路劲", required = false)
    private String picPath;
    @ApiModelProperty(value = "发单范围", required = true)
    private String rangeArea;

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
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

    public String getAuthentication() {
        return authentication;
    }

    public void setAuthentication(String authentication) {
        this.authentication = authentication;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getRangeArea() {
        return rangeArea;
    }

    public void setRangeArea(String rangeArea) {
        this.rangeArea = rangeArea;
    }
}
