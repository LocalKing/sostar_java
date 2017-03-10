package com.sostar.rest;

import com.sostar.bean.common.ConstantDef;
import com.sostar.bean.common.Request;
import com.sostar.bean.common.Response;
import com.sostar.bean.param.SuggestParam;
import com.sostar.service.SuggestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * Created by liuyang on 2017/2/20.
 */
@RestController
@RequestMapping("api")
@Api(value = "SuggestService-Api", description = "意见反馈API")
public class SuggestController {
    @Autowired
    private SuggestService suggestService;

    /**
     * 意见反馈
     *
     * @param request 请求参数
     */
    @RequestMapping(value = "/employer/setSuggest", method = RequestMethod.POST)
    @ApiOperation(notes = "意见反馈", httpMethod = "POST", value = "意见反馈")
    public Response<HashMap> setSuggest(@RequestBody Request<SuggestParam> request) {
        SuggestParam param = request.getParam();
        Response<HashMap> response = new Response<>();
        if (0 == param.getUserId()) {
            response.setResult(ConstantDef.RESPONSE.FAIL);
            response.setMessage("参数异常！");
            response.setData(new HashMap());
        } else {
            boolean rs = suggestService.setSuggest(param);
            if (rs) {
                response.setResult(ConstantDef.RESPONSE.SUCCESS);
                response.setMessage("反馈意见成功！");
                response.setData(new HashMap<>());
            } else {
                response.setResult(ConstantDef.RESPONSE.FAIL);
                response.setMessage("反馈意见失败！");
                response.setData(new HashMap<>());
            }
        }
        return response;
    }
}
