package com.sostar.bean.param;

import com.sostar.bean.PaginationParam;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * Created by liuyang on 2017/2/20.
 */
public class SuggestParam implements Serializable {
    private int userId;
    @ApiModelProperty(value = "意见内容", required = true)
    private String suggest;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getSuggest() {
        return suggest;
    }

    public void setSuggest(String suggest) {
        this.suggest = suggest;
    }
}
