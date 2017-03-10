package com.sostar.rest;

import com.sostar.bean.PaginationResult;
import com.sostar.bean.common.ConstantDef;
import com.sostar.bean.common.Request;
import com.sostar.bean.common.Response;
import com.sostar.bean.param.EmployerMyOrderParam;
import com.sostar.bean.param.SetDraftToOrderParam;
import com.sostar.bean.param.SetEmployerOrderParam;
import com.sostar.bean.param.EmployerCashAvaiableParam;
import com.sostar.bean.result.EmployerCashAvaiableResult;
import com.sostar.bean.result.EmployerMyOrderResult;
import com.sostar.bean.result.SetEmployerOrderResult;
import com.sostar.service.EmployerMyOrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by liuyang on 2017/2/20.
 */
@RestController
@RequestMapping("api")
@Api(value = "EmployerCenterService-Api", description = "雇主-订单相关API")
public class EmployerMyOrderController {
    @Autowired
    private EmployerMyOrderService employerMyOrderService;

    /**
     * 雇主-我的订单
     *
     * @param request 请求参数
     */
    @RequestMapping(value = "/employer/myOrderList", method = RequestMethod.POST)
    @ApiOperation(notes = "雇主-订单列表", httpMethod = "POST", value = "雇主-订单列表")
    public Response<PaginationResult<EmployerMyOrderResult>> getEmployerMyOrderList(@RequestBody Request<EmployerMyOrderParam> request) {
        EmployerMyOrderParam param = request.getParam();
        PaginationResult<EmployerMyOrderResult> result = employerMyOrderService.getEmployerMyOrderList(param);
        Response<PaginationResult<EmployerMyOrderResult>> response = new Response<>();
        response.setData(result);
        response.setMessage("查询成功");
        response.setResult(ConstantDef.RESPONSE.SUCCESS);
        return response;
    }

    /**
     * 雇主-发布订单
     *
     * @param request 请求参数
     */
    @RequestMapping(value = "/employer/setEmployerOrder", method = RequestMethod.POST)
    @ApiOperation(notes = "雇主-发布订单", httpMethod = "POST", value = "雇主-发布订单")
    public Response<HashMap> setEmployerOrder(@RequestBody Request<SetEmployerOrderParam> request) {
        SetEmployerOrderParam param = request.getParam();
        Response<HashMap> response = new Response<>();
        boolean rs = employerMyOrderService.setEmployerOrder(param);
        if (!rs) {
            response.setResult(ConstantDef.RESPONSE.FAIL);
            response.setMessage("发布订单失败！");
            response.setData(new HashMap<>());
        } else {
            response.setResult(ConstantDef.RESPONSE.SUCCESS);
            response.setMessage("发布订单成功！");
            response.setData(new HashMap());
        }

        return response;
    }

    /**
     * 雇主-草稿变订单
     *
     * @param request 请求参数
     */
    @RequestMapping(value = "/employer/setDraftToOrder", method = RequestMethod.POST)
    @ApiOperation(notes = "雇主-草稿变订单", httpMethod = "POST", value = "雇主-草稿变订单")
    public Response<HashMap> setDraftToOrder(@RequestBody Request<SetDraftToOrderParam> request) {
        SetDraftToOrderParam param = request.getParam();
        Response<HashMap> response = new Response<>();
        boolean rs = employerMyOrderService.setDraftToOrder(param);
        if (!rs) {
            response.setResult(ConstantDef.RESPONSE.FAIL);
            response.setMessage("草稿变订单失败！");
            response.setData(new HashMap<>());
        } else {
            response.setResult(ConstantDef.RESPONSE.SUCCESS);
            response.setMessage("草稿变订单成功！");
            response.setData(new HashMap());
        }

        return response;
    }

    /**
     * 雇主-可用余额
     *
     * @param request 请求参数
     */
    @RequestMapping(value = "/employer/getEmployerCashAvaiable", method = RequestMethod.POST)
    @ApiOperation(notes = "雇主-可用余额", httpMethod = "POST", value = "雇主-可用余额")
    public Response<EmployerCashAvaiableResult> getEmployerCashAvaiable(@RequestBody Request<EmployerCashAvaiableParam> request) {
        EmployerCashAvaiableParam param = request.getParam();
        Response<EmployerCashAvaiableResult> response = new Response<>();
        EmployerCashAvaiableResult rs = employerMyOrderService.getEmployerCashAvaiable(param);
        if (null != rs) {
            if (null == rs.getCashAvaiable()) {
                rs.setCashAvaiable(0.0);
                response.setResult(ConstantDef.RESPONSE.FAIL);
                response.setMessage("数据为空！");
                response.setData(rs);
            } else {
                response.setResult(ConstantDef.RESPONSE.SUCCESS);
                response.setMessage("查询成功！");
                response.setData(rs);
            }
        } else {
            EmployerCashAvaiableResult rsnull = new EmployerCashAvaiableResult();
            rsnull.setCashAvaiable(0.0);
            response.setResult(ConstantDef.RESPONSE.FAIL);
            response.setMessage("数据不存在！");
            response.setData(rsnull);
        }

        return response;
    }
}
