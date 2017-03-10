package com.sostar.service;

import com.github.pagehelper.Page;
import com.sostar.bean.PaginationResult;
import com.sostar.bean.common.ConstantDef;
import com.sostar.bean.common.RangeOrder;
import com.sostar.bean.entity.OrderEntity;
import com.sostar.bean.entity.OrderRelationEntity;
import com.sostar.bean.entity.OrderStaffEntity;
import com.sostar.bean.entity.UserEntity;
import com.sostar.bean.param.OrderReceiveParam;
import com.sostar.bean.param.OrderSearchParam;
import com.sostar.bean.result.OrderStaffResult;
import com.sostar.dao.OrderStaffDao;
import com.sostar.until.DistanceUtil;
import com.sostar.until.SqlUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by mao_yejun on 2017/3/5.
 */
@Service
public class OrderStaffService {
    @Autowired
    private OrderStaffDao orderStaffDao;

    @Transactional
    public PaginationResult<OrderStaffResult> searchOrderStaff(OrderSearchParam param) {
        if (ConstantDef.RECEIVE_ORDER_SEARCH_STATUS.RECENT.equals(param.getType())) {
            return this.getRecentOrders(param);
        }
        return this.getHotOrders(param);
    }

    @Transactional
    public int receiveOrder(OrderReceiveParam orderReceiveParam) {
        //check order是否已经成单
        OrderEntity orderEntity = orderStaffDao.getOrderByOrderId(orderReceiveParam.getOrderId());
        if (orderEntity == null) {
            return 0;
        }
        //已接单人数
        int receivedCount = orderEntity.getOkStaffAccount();
        //需求人数
        int needStaff = orderEntity.getStaffAccount();
        if (receivedCount >= needStaff) {
            return 1;
        }
        // 未成单开始创建定单
        String confirmFlg = orderEntity.getConfirmFlg();
        OrderRelationEntity orderRelationEntity = new OrderRelationEntity();
        if (ConstantDef.ORDER_CONFIRMFLG.NONEED.equals(confirmFlg)) {
            orderRelationEntity.setConfirmFlg(ConstantDef.ORDER_RELATION_CONFIRMFLG.CONFIRMED);
        } else {
            orderRelationEntity.setConfirmFlg(ConstantDef.ORDER_RELATION_CONFIRMFLG.NOCONFIRM);
        }
        orderRelationEntity.setCrtTime(new Date());
        orderRelationEntity.setStatus(ConstantDef.ORDER_RELATION_STATUS.OK);
        orderRelationEntity.setStaffUserId(orderReceiveParam.getUserId());
        orderStaffDao.createOrderRelation(orderRelationEntity);
        //定单创建后查看是否所有定单已经被确认了
        int confirmedAccount = orderStaffDao.getConfirmedOrderNumber(orderReceiveParam.getOrderId(), ConstantDef.ORDER_RELATION_CONFIRMFLG.CONFIRMED);
        //当确认人数达到数量时，更新定单为已成单,接单人数
        if (confirmedAccount == needStaff) {
            orderStaffDao.updateOrderStatus(orderReceiveParam.getOrderId(), (receivedCount + 1), ConstantDef.ORDER_STATUS.OK);
        }

        return 2;
    }

    /**
     * 获得最新定单
     *
     * @param param
     * @return
     */
    protected PaginationResult<OrderStaffResult> getRecentOrders(OrderSearchParam param) {
        //或得当前用户的精度纬度，以及接单范围设置
        UserEntity userEntity = orderStaffDao.getUserDistance(param.getUserId());
        String latitude = userEntity.getLatitude();
        String longitude = userEntity.getLongitude();
        //计算接单范围内的经纬度
        RangeOrder map = DistanceUtil.getAround(latitude, longitude, userEntity.getRangeArea());
        OrderStaffEntity orderStaffEntity = new OrderStaffEntity();
        orderStaffEntity.setUserId(param.getUserId());
        orderStaffEntity.setMaxLat(map.getMaxLat());
        orderStaffEntity.setMaxLng(map.getMaxLng());
        orderStaffEntity.setMinLng(map.getMinLng());
        orderStaffEntity.setMinLat(map.getMinLat());
        //设置查询三天以内发布的定单
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, -3);
        orderStaffEntity.setCrtTime(calendar.getTime());
        Page<OrderEntity> page = SqlUtils.getPage(param);
        //待接单查询
        orderStaffEntity.setOrderStatus(ConstantDef.ORDER_STATUS.SENDED);
        orderStaffDao.searchOrderStaff(orderStaffEntity);
        PaginationResult<OrderStaffResult> rs = new PaginationResult();
        List<OrderEntity> data = page.getResult();
        List<OrderStaffResult> rsData = new ArrayList<>();

        for (OrderEntity i : data) {
            OrderStaffResult orderStaffResult = new OrderStaffResult();
            String orderLatitude = i.getLatitude();
            String orderLongitude = i.getLongitude();
            BeanUtils.copyProperties(i, orderStaffResult);
            orderStaffResult.setDistance(DistanceUtil.getDistance(latitude, longitude, orderLatitude, orderLongitude));
           String pictList =i.getPicList();
            if(!StringUtils.isEmpty(pictList)){
               orderStaffResult.setPicListArray(pictList.split("#"));
           }
            rsData.add(orderStaffResult);
        }
        rs.setData(rsData);
        rs.setTotal(page.getTotal());
        return rs;
    }

    protected PaginationResult<OrderStaffResult> getHotOrders(OrderSearchParam param) {


        return null;
    }
}
