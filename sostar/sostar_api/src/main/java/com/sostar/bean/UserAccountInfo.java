package com.sostar.bean;

import java.io.Serializable;

/**
 * Created by mao_yejun on 2017/1/4.
 */
public class UserAccountInfo implements Serializable {
    private String password;
    private String phone;
    private String userId;
    private String userType;

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
