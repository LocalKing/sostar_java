package com.sostar.bean.param;

import java.io.Serializable;

/**
 * Created by mao_yejun on 2017/2/16.
 */
public class StaffCenterParam implements Serializable {
    private String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
