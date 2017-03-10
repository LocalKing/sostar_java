package com.sostar.bean.result;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by liuyang on 2017/2/20.
 */
public class AllMsgResult implements Serializable {
    private String messageId;
    @ApiModelProperty(value = "创建时间")
    private Date crtTime;
    @ApiModelProperty(value = "更新时间")
    private Date upTime;
    @ApiModelProperty(value = "消息内容")
    private String message;
    @ApiModelProperty(value = "是否已读 0未读 1 已读")
    private String readFlg;
    @ApiModelProperty(value = "收取消息ids")
    private String receiverIds;
    @ApiModelProperty(value = "消息类型:1,订单消息2,系统消息")
    private String msgType;

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public Date getCrtTime() {
        return crtTime;
    }

    public void setCrtTime(Date crtTime) {
        this.crtTime = crtTime;
    }

    public Date getUpTime() {
        return upTime;
    }

    public void setUpTime(Date upTime) {
        this.upTime = upTime;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getReadFlg() {
        return readFlg;
    }

    public void setReadFlg(String readFlg) {
        this.readFlg = readFlg;
    }

    public String getReceiverIds() {
        return receiverIds;
    }

    public void setReceiverIds(String receiverIds) {
        this.receiverIds = receiverIds;
    }

    public String getMsgType() {
        return msgType;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }
}
