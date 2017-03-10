package com.sostar.bean.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * Created by mao_yejun
 */
@ApiModel
public class CaptchaGetParam implements Serializable {
    @ApiModelProperty(value = "手机号码", required = true)
    private String phone;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
