package com.sostar.bean.param;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * Created by mao_yejun on 2017/3/4.
 */
public class SysUserTypeSetParam implements Serializable {
    @ApiModelProperty(value = "用户id")
    private String userId;
    @ApiModelProperty(value = "用户类型 员工 0 雇主 1")
    private String userType;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
}
