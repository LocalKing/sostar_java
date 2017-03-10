package com.sostar.bean.result;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by mao_yejun on 2017/1/4.
 */
public class UserLoginResult implements Serializable {
    @ApiModelProperty(value = "用户id")
    private String userId;
    @ApiModelProperty(value = "用户类型")
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
