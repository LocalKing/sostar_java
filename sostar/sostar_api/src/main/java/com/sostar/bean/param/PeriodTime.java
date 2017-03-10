package com.sostar.bean.param;

import com.sostar.bean.PaginationParam;

import java.io.Serializable;

/**
 * Created by liuyang on 2017/2/20.
 */
public class PeriodTime implements Serializable {
    private String startTime;
    private String endTime;

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}
