package com.sostar.bean.entity;

import java.io.Serializable;

/**
 * Created by mao_yejun on 2017/3/4.
 */
public class UserAccountEntity implements Serializable {
    private String phoneId;
    private String userId;
    private String password;
    private String phone;

    public String getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(String phoneId) {
        this.phoneId = phoneId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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
}
