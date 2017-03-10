package com.sostar.dao;

import com.sostar.bean.entity.OrderEntity;
import com.sostar.bean.entity.OrderRelationEntity;
import com.sostar.bean.entity.OrderStaffEntity;
import com.sostar.bean.entity.UserEntity;
import com.sostar.bean.result.OrderStaffResult;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

/**
 * Created by mao_yejun on 2017/3/5.
 */
@Mapper
public interface OrderStaffDao {
   UserEntity getUserDistance(String userId);
    ArrayList<OrderEntity> searchOrderStaff(OrderStaffEntity orderStaffEntity);
    OrderEntity getOrderByOrderId(String orderId);
    int createOrderRelation(OrderRelationEntity orderRelationEntity);
    int getConfirmedOrderNumber(String orderId,String confirmFlg);
    int updateOrderStatus(String orderId,int receivedCount,String status);
}
