package com.sostar.rest;

import com.sostar.bean.common.ConstantDef;
import com.sostar.bean.common.Request;
import com.sostar.bean.common.Response;
import com.sostar.bean.param.EmployerAuthParam;
import com.sostar.bean.param.EmployerCenterParam;
import com.sostar.bean.param.EmployerInfoParam;
import com.sostar.bean.result.EmployerCenterResult;
import com.sostar.service.EmployerCenterService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

/**
 * Created by mao_yeju,liuyangon 2017/2/16.
 */
@RestController
@RequestMapping("api")
@Api(value = "EmployerCenterService-Api", description = "雇主中心相关API")
public class EmployerCenterRestController {
    @Autowired
    private EmployerCenterService employerCenterService;

    /**
     * 雇主-我的中心
     *
     * @param request 请求参数
     */
    @RequestMapping(value = "/employer/center", method = RequestMethod.POST)
    @ApiOperation(notes = "雇主-我的中心", httpMethod = "POST", value = "雇主-我的中心")
    public Response<EmployerCenterResult> getEmployerCenter(@RequestBody Request<EmployerCenterParam> request) {
        EmployerCenterParam param = request.getParam();
        EmployerCenterResult result = employerCenterService.getEmployerCenter(param);
        Response<EmployerCenterResult> response = new Response<>();
        response.setData(result);
        response.setMessage("查询成功");
        response.setResult(ConstantDef.RESPONSE.SUCCESS);
        return response;
    }

    @RequestMapping(value = "/employer/setEmployerInfo",
            method = RequestMethod.POST)
    @ApiOperation(notes = "雇主-设置公司信息", httpMethod = "POST", value = "雇主-设置公司信息")
    @ResponseBody
    public Response<HashMap> setEmployerInfo(@RequestBody Request<EmployerInfoParam> request) {
        EmployerInfoParam param = request.getParam();
        boolean rs = employerCenterService.setEmployerInfo(param);
        String msg = rs ? "企业数据提交成功！" : "企业数据提交失败！";
        Response<HashMap> response = new Response<>();
        response.setResult(ConstantDef.RESPONSE.SUCCESS);
        response.setMessage(msg);
        response.setData(new HashMap());
        return response;
    }

    @RequestMapping(value = "/employer/setEmployerAuthentica",
            method = RequestMethod.POST)
    @ApiOperation(notes = "雇主-公司认证", httpMethod = "POST", value = "雇主-公司认证")
    @ResponseBody
    public Response<HashMap> setEmployerAuthentica(@RequestBody Request<EmployerAuthParam> request) {
        EmployerAuthParam param = request.getParam();
        boolean rs = employerCenterService.setEmployerAuthentica(param);
        String msg = rs ? "企业认证数据提交成功！" : "企业认证数据提交失败！";
        Response<HashMap> response = new Response<>();
        response.setResult(ConstantDef.RESPONSE.SUCCESS);
        response.setMessage(msg);
        response.setData(new HashMap());
        return response;
    }
}
