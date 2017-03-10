package com.sostar.bean.param;


import java.io.Serializable;

/**
 * Created by mao_yejun on 2017/2/22.
 */
public class SystemSearchParam implements Serializable {
    private String userId;
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
