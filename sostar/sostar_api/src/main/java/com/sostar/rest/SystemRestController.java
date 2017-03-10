package com.sostar.rest;

import com.sostar.bean.common.ConstantDef;
import com.sostar.bean.common.Request;
import com.sostar.bean.common.Response;
import com.sostar.bean.param.SysUserTypeSetParam;
import com.sostar.bean.param.SystemParam;
import com.sostar.bean.param.SystemSearchParam;
import com.sostar.bean.result.SysUserTypeSetResult;
import com.sostar.bean.result.SystemSearchResult;
import com.sostar.bean.result.UserLoginResult;
import com.sostar.service.SystemService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * Created by mao_yejun on 2017/2/22.
 */
@RestController
@RequestMapping("api")
@Api(value = "SystemRestController-Api", description = "系统设置API")
public class SystemRestController {
    @Autowired
    private SystemService systemService;

    @RequestMapping(value = "/sys/set", method = RequestMethod.POST)
    @ApiOperation(notes = "接收消息开关设置", httpMethod = "POST", value = "意见反馈")
    public Response<HashMap> restMsgFlg(@RequestBody Request<SystemParam> request) {
        Response<HashMap> response = new Response<>();
        SystemParam param = request.getParam();
        boolean rs = systemService.restSystemRange(param);
        if (rs) {
            response.setResult(ConstantDef.RESPONSE.SUCCESS);
            response.setMessage("重置成功！");
            response.setData(new HashMap());
        } else {
            response.setResult(ConstantDef.RESPONSE.FAIL);
            response.setMessage("重置失败！");
            response.setData(new HashMap());
        }
        return response;
    }

    @RequestMapping(value = "/sys/search", method = RequestMethod.POST)
    @ApiOperation(notes = "系统设置查询接口", httpMethod = "POST", value = "系统设置查询接口")
    public Response<SystemSearchResult> searchSystem(@RequestBody Request<SystemSearchParam> request) {
        SystemSearchParam param = request.getParam();
        Response<SystemSearchResult> response = new Response<>();
        SystemSearchResult rs = systemService.searchSystem(param);
        response.setData(rs);
        response.setMessage("查询系统设置成功！");
        response.setResult(ConstantDef.RESPONSE.SUCCESS);
        return response;
    }

    @RequestMapping(value = "/sys/userType/set", method = RequestMethod.POST)
    @ApiOperation(notes = "系统设置用户类型切换", httpMethod = "POST", value = "系统设置用户类型切换")
    public Response<SysUserTypeSetResult> restSysUserType(@RequestBody Request<SysUserTypeSetParam> request) {
        Response<SysUserTypeSetResult> response = new Response<>();
        SysUserTypeSetResult rs = systemService.restSysUserType(request);
        response.setData(rs);
        response.setMessage("切换成功！");
        response.setResult(ConstantDef.RESPONSE.SUCCESS);
        return response;

    }
}