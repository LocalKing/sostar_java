package com.sostar.bean.param;

import java.io.Serializable;

/**
 * Created by liuyang on 2017/3/6.
 */
public class EmployerCashAvaiableParam implements Serializable{
    private int userId;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
