package com.sostar.bean.result;

import java.io.Serializable;

/**
 * Created by mao_yejun on 2017/3/4.
 */
public class SysUserTypeSet implements Serializable {
    private String userType;
    private String userId;
    private String phoneId;

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(String phoneId) {
        this.phoneId = phoneId;
    }
}
