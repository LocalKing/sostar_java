package com.sostar.bean.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * Created by mao_yejun on 2017/2/13.
 */
@ApiModel
public class Request<T extends Serializable> {
    @ApiModelProperty(value = "设备号", required = true)
    private String deviceId;
    @ApiModelProperty(value = "版本号", required = true)
    private String ver;
    @ApiModelProperty(value = "平台：android,ios", required = true)
    private String platform;
    @ApiModelProperty(value = "系统版本号", required = true)
    private String sysversion;
    private T param;

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getSysversion() {
        return sysversion;
    }

    public void setSysversion(String sysversion) {
        this.sysversion = sysversion;
    }

    public T getParam() {
        return param;
    }

    public void setParam(T param) {
        this.param = param;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getVer() {
        return ver;
    }

    public void setVer(String ver) {
        this.ver = ver;
    }
}
