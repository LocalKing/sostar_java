package com.sostar.bean.entity;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

/**
 * Created by mao_yejun on 2017/3/3.
 */
public class UserEntity implements Serializable {
    private BigInteger userId;
    private String userType;
    private Date crtTime;
    private String msgFlg;
    private String phoneId;
    private String rangeArea;
    private String longitude;
    private String latitude;
    private String deviceId;
    private String ver;
    private String platform;
    private String sysversion;

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

    public String getRangeArea() {
        return rangeArea;
    }

    public void setRangeArea(String rangeArea) {
        this.rangeArea = rangeArea;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(String phoneId) {
        this.phoneId = phoneId;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public Date getCrtTime() {
        return crtTime;
    }

    public void setCrtTime(Date crtTime) {
        this.crtTime = crtTime;
    }

    public String getMsgFlg() {
        return msgFlg;
    }

    public void setMsgFlg(String msgFlg) {
        this.msgFlg = msgFlg;
    }

    public BigInteger getUserId() {
        return userId;
    }

    public void setUserId(BigInteger userId) {
        this.userId = userId;
    }
}
