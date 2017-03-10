package com.sostar.rest;

import com.sostar.bean.PaginationResult;
import com.sostar.bean.common.ConstantDef;
import com.sostar.bean.common.Request;
import com.sostar.bean.common.Response;
import com.sostar.bean.param.OrderReceiveParam;
import com.sostar.bean.param.OrderSearchParam;
import com.sostar.bean.result.OrderStaffResult;
import com.sostar.service.OrderStaffService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * Created by mao_yejun on 2017/3/5.
 */
@RestController
@RequestMapping("api")
@Api(value = "order-Api", description = "员工-订单相关APi")
public class OrderStaffRestController {
    @Autowired
    private OrderStaffService orderStaffService;

    @RequestMapping(value = "/staff/myOrderList", method = RequestMethod.POST)
    @ApiOperation(notes = "员工-待接单列表", httpMethod = "POST", value = "员工-待接单列表")
    public Response<PaginationResult<OrderStaffResult>> orderSearch(@RequestBody Request<OrderSearchParam> request) {

        Response<PaginationResult<OrderStaffResult>> response = new Response<>();
        PaginationResult<OrderStaffResult> data = orderStaffService.searchOrderStaff(request.getParam());
        response.setData(data);
        response.setMessage("查询成功");
        response.setResult(ConstantDef.RESPONSE.SUCCESS);
        return response;
    }

    @RequestMapping(value = "/staff/receiveOrder", method = RequestMethod.POST)
    @ApiOperation(notes = "员工接单", httpMethod = "POST", value = "员工接单")
    public Response<HashMap> orderReceive(@RequestBody Request<OrderReceiveParam> request) {
        Response<HashMap> response = new Response();
        int rs =orderStaffService.receiveOrder(request.getParam());
        if(rs == 2){
            response.setResult(ConstantDef.RESPONSE.SUCCESS);
            response.setData(new HashMap());
            response.setMessage("接单成功");
        }else if (rs == 0){
            response.setResult(ConstantDef.RESPONSE.FAIL);
            response.setData(new HashMap());
            response.setMessage("定单已被删除");
        }else if (rs == 1){
            response.setResult(ConstantDef.RESPONSE.FAIL);
            response.setData(new HashMap());
            response.setMessage("定单需求人数已经足够");
        }
        return response;
    }
}
