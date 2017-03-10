package com.sostar.bean.result;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by mao_yejun on 2017/2/22.
 */
public class SystemSearchResult implements Serializable {

    @ApiModelProperty(value = "消息开关 0 关闭，1打开")
    private String msgFlg;

    public String getMsgFlg() {
        return msgFlg;
    }

    public void setMsgFlg(String msgFlg) {
        this.msgFlg = msgFlg;
    }
}
