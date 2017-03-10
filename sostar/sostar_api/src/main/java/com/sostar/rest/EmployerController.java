package com.sostar.rest;

import com.sostar.bean.common.ConstantDef;
import com.sostar.bean.common.Request;
import com.sostar.bean.common.Response;
import com.sostar.bean.param.EmployerAuthParam;
import com.sostar.bean.param.EmployerHomeParam;
import com.sostar.bean.result.EmployerInfoResult;
import com.sostar.bean.result.StaffInfoResult;
import com.sostar.service.EmployerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liuyang on 2017/2/16.
 */
@RestController
@RequestMapping(value = "api")
@Api(value = "employer-api",
        description = "雇主操作API")
public class EmployerController {
    @Autowired
    private EmployerService employerService;

    @RequestMapping(value = "/employer/searchStaffOnline",
            method = RequestMethod.POST)
    @ApiOperation(notes = "雇主-在线员工", httpMethod = "POST", value = "雇主-在线员工")
    @ResponseBody
    public Response<ArrayList<StaffInfoResult>> searchStaffOnline(@RequestBody Request<EmployerHomeParam> request) {
        EmployerHomeParam param = request.getParam();
        List<StaffInfoResult> staffInfoResultList = employerService.searchStaffOnline(param).getData();
        ArrayList<StaffInfoResult> resList = new ArrayList<>();
        resList.addAll(staffInfoResultList);
        Response<ArrayList<StaffInfoResult>> response = new Response<>();
        response.setResult(ConstantDef.RESPONSE.SUCCESS);
        response.setMessage("获取数据成功！");
        response.setData(resList);
        return response;
    }

    @RequestMapping(value = "/employer/searchEmployer",
            method = RequestMethod.POST)
    @ApiOperation(notes = "周边公司", httpMethod = "POST", value = "周边公司")
    @ResponseBody
    public Response<ArrayList<EmployerInfoResult>> searchEmployer(@RequestBody Request<EmployerHomeParam> request) {
        EmployerHomeParam param = request.getParam();
        List<EmployerInfoResult> employerInfoResultList = employerService.searchEmployer(param).getData();
        ArrayList<EmployerInfoResult> resList = new ArrayList<>();
        resList.addAll(employerInfoResultList);
        Response<ArrayList<EmployerInfoResult>> response = new Response<>();
        response.setResult(ConstantDef.RESPONSE.SUCCESS);
        response.setMessage("获取数据成功！");
        response.setData(resList);
        return response;
    }

}