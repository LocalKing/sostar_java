package com.sostar.bean.param;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * Created by mao_yejun on 2017/1/17.
 */
public class UserTypeParam implements Serializable {
    private String userId;
    @ApiModelProperty(value = "用户类型:0 员工 1 雇主", required = true)
    private String userType;
    private String phone;
    private int count;//sql中需用

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
