package com.sostar.bean.param;

import com.sostar.bean.PaginationParam;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * Created by liuyang on 2017/2/20.
 */
public class EmployerMyOrderParam extends PaginationParam implements Serializable {
    private String userId;
    @ApiModelProperty(value = "订单类型1.已发单2.已成单3.已完成0.草稿", required = true)
    private String orderType;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }
}
