package com.sostar.bean.param;

import java.io.Serializable;

/**
 * Created by mao_yejun on 2017/1/4.
 */
public class UserLoginParam implements Serializable {
    private String phone;
    private String password;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
