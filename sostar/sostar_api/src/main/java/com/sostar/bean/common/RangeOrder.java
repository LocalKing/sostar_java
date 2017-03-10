package com.sostar.bean.common;

/**
 * Created by mao_yejun on 2017/3/5.
 */
public class RangeOrder {
    private String minLng;
    private String  maxLat;
    private String minLat;
    private String maxLng;

    public String getMinLng() {
        return minLng;
    }

    public void setMinLng(String minLng) {
        this.minLng = minLng;
    }

    public String getMaxLat() {
        return maxLat;
    }

    public void setMaxLat(String maxLat) {
        this.maxLat = maxLat;
    }

    public String getMinLat() {
        return minLat;
    }

    public void setMinLat(String minLat) {
        this.minLat = minLat;
    }

    public String getMaxLng() {
        return maxLng;
    }

    public void setMaxLng(String maxLng) {
        this.maxLng = maxLng;
    }
}
