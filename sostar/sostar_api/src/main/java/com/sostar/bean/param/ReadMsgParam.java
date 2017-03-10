package com.sostar.bean.param;

import java.io.Serializable;

/**
 * Created by liuyang on 2017/2/20.
 */
public class ReadMsgParam implements Serializable {
    private int messageId;

    public int getMessageId() {
        return messageId;
    }

    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }
}
