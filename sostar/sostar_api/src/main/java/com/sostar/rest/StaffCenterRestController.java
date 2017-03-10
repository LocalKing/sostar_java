package com.sostar.rest;

import com.sostar.bean.common.ConstantDef;
import com.sostar.bean.common.Request;
import com.sostar.bean.common.Response;
import com.sostar.bean.param.*;
import com.sostar.bean.result.StaffCenterResult;
import com.sostar.bean.result.StaffDetailResult;
import com.sostar.service.StaffCenterService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

/**
 * Created by mao_yejun on 2017/2/16.
 */
@RestController
@RequestMapping("api")
@Api(value = "staffCenter-Api", description = "员工-我的中心相关APi")
public class StaffCenterRestController {
    @Autowired
    private StaffCenterService staffCenterService;

    /**
     * 员工-我的中心
     *
     * @param request 请求参数
     */
    @RequestMapping(value = "/staff/center", method = RequestMethod.POST)
    @ApiOperation(notes = "员工-我的中心", httpMethod = "POST", value = "员工-我的中心")
    public Response<StaffCenterResult> getStaffCenter(@RequestBody Request<StaffCenterParam> request) {
        StaffCenterParam param = request.getParam();
        Response<StaffCenterResult> response = new Response<>();
        StaffCenterResult result = staffCenterService.getStaffCenter(param);
        response.setMessage("查询成功！");
        response.setResult(ConstantDef.RESPONSE.SUCCESS);
        response.setData(result);
        return response;
    }
//    /**
//     * 员工-个人详情
//     *
//     * @param request 请求参数
//     */
//    @RequestMapping(value = "/staff/detail", method = RequestMethod.POST)
//    @ApiOperation(notes = "员工-我的中心", httpMethod = "POST", value = "员工-个人详情")
//    public Response<StaffDetailResult> getStaffDetail(@RequestBody Request<StaffDetailParam> request) {
//        StaffDetailParam param = request.getParam();
//        Response<StaffDetailResult> response = new Response<>();
//        StaffDetailResult result = staffCenterService.getStaffDetail(param);
//        response.setMessage("查询成功！");
//        response.setResult(ConstantDef.RESPONSE.SUCCESS);
//        response.setData(result);
//        return response;
//    }

    @ApiOperation(value = "员工-设置个人信息")
    @RequestMapping(value = "/staff/setStaffInfo",
            method = RequestMethod.POST,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public Response<HashMap> setStaffInfo(@RequestBody Request<StaffInfoParam> request) {
        StaffInfoParam param = request.getParam();
        boolean rs = staffCenterService.setStaffInfo(param);
        String msg = rs ? "员工信息数据提交成功！" : "员工信息数据提交失败！";
        Response<HashMap> response = new Response<>();
        response.setResult(ConstantDef.RESPONSE.SUCCESS);
        response.setMessage(msg);
        response.setData(new HashMap());
        return response;
    }

    @ApiOperation(value = "员工-信息认证")
    @RequestMapping(value = "/staff/setStaffAuthentica",
            method = RequestMethod.POST,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public Response<HashMap> setStaffAuthentica(@RequestBody Request<StaffAuthParam> request) {
        StaffAuthParam param = request.getParam();
        boolean rs = staffCenterService.setStaffAuthentica(param);
        String msg = rs ? "员工认证数据提交成功！" : "员工认证数据提交失败！";
        Response<HashMap> response = new Response<>();
        response.setResult(ConstantDef.RESPONSE.SUCCESS);
        response.setMessage(msg);
        response.setData(new HashMap());
        return response;
    }
}
