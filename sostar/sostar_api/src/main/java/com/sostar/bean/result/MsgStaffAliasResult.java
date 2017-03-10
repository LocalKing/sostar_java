package com.sostar.bean.result;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by liuyang on 2017/2/20.
 */
public class MsgStaffAliasResult implements Serializable {
    @ApiModelProperty(value = "userId")
    private String userId;
    @ApiModelProperty(value = "设备类型")
    private String platForm;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPlatForm() {
        return platForm;
    }

    public void setPlatForm(String platForm) {
        this.platForm = platForm;
    }
}
