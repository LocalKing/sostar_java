package com.sostar.bean.param;

import com.sostar.bean.PaginationParam;

import java.io.Serializable;

/**
 * Created by liuyang on 2017/2/20.
 */
public class AllMsgParam extends PaginationParam implements Serializable {
    private int userId;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
