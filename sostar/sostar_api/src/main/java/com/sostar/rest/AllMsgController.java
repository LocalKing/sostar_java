package com.sostar.rest;

import com.sostar.bean.PaginationResult;
import com.sostar.bean.common.ConstantDef;
import com.sostar.bean.common.Request;
import com.sostar.bean.common.Response;
import com.sostar.bean.param.*;
import com.sostar.bean.result.AllMsgResult;
import com.sostar.bean.result.MsgStaffAliasResult;
import com.sostar.service.AllMsgService;
import com.sostar.until.JpushUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by liuyang on 2017/2/20.
 */
@RestController
@RequestMapping("api")
@Api(value = "AllMsgController-Api", description = "消息相关API")
public class AllMsgController {
    @Autowired
    private AllMsgService allMsgService;

    private static final String JPUSH_TYPE_ORDER = "1";//订单推送
    private static final String JPUSH_TYPE_SYS = "2";//系统推送


    /**
     * 消息列表
     *
     * @param request 请求参数
     */
    @RequestMapping(value = "/all/msgList", method = RequestMethod.POST)
    @ApiOperation(notes = "消息列表", httpMethod = "POST", value = "消息列表")
    public Response<PaginationResult<AllMsgResult>> getMsgList(@RequestBody Request<AllMsgParam> request) {
        AllMsgParam param = request.getParam();
        PaginationResult<AllMsgResult> result = allMsgService.getMsgList(param);
        Response<PaginationResult<AllMsgResult>> response = new Response<>();
        response.setData(result);
        response.setMessage("查询成功");
        response.setResult(ConstantDef.RESPONSE.SUCCESS);
        return response;
    }

    /**
     * 清空消息列表
     *
     * @param request 请求参数
     */
    @RequestMapping(value = "/all/deleteMsgList", method = RequestMethod.POST)
    @ApiOperation(notes = "清空消息列表", httpMethod = "POST", value = "清空消息列表")
    public Response<HashMap> deleteMsgList(@RequestBody Request<DeleteMsgParam> request) {
        DeleteMsgParam param = request.getParam();
        Response<HashMap> response = new Response<>();
        if (0 == param.getUserId()) {
            response.setResult(ConstantDef.RESPONSE.FAIL);
            response.setMessage("参数异常！");
            response.setData(new HashMap());
        } else {
            boolean rs = allMsgService.deleteMsgList(param);
            if (rs) {
                response.setResult(ConstantDef.RESPONSE.SUCCESS);
                response.setMessage("清空消息列表成功！");
                response.setData(new HashMap<>());
            } else {
                response.setResult(ConstantDef.RESPONSE.FAIL);
                response.setMessage("清空消息列表失败！");
                response.setData(new HashMap<>());
            }
        }
        return response;
    }

    /**
     * 单条消息删除
     *
     * @param request 请求参数
     */
    @RequestMapping(value = "/all/deleteMsg", method = RequestMethod.POST)
    @ApiOperation(notes = "单条消息删除", httpMethod = "POST", value = "单条消息删除")
    public Response<HashMap> deleteMsg(@RequestBody Request<ReadMsgParam> request) {
        ReadMsgParam param = request.getParam();
        Response<HashMap> response = new Response<>();
        if (0 == param.getMessageId()) {
            response.setResult(ConstantDef.RESPONSE.FAIL);
            response.setMessage("参数异常！");
            response.setData(new HashMap());
        } else {
            boolean rs = allMsgService.deleteMsg(param);
            if (rs) {
                response.setResult(ConstantDef.RESPONSE.SUCCESS);
                response.setMessage("消息删除成功！");
                response.setData(new HashMap<>());
            } else {
                response.setResult(ConstantDef.RESPONSE.FAIL);
                response.setMessage("消息删除失败！");
                response.setData(new HashMap<>());
            }
        }
        return response;
    }

    /**
     * 标记消息已读
     *
     * @param request 请求参数
     */
    @RequestMapping(value = "/all/readMsg", method = RequestMethod.POST)
    @ApiOperation(notes = "标记消息已读", httpMethod = "POST", value = "标记消息已读")
    public Response<HashMap> readMsg(@RequestBody Request<ReadMsgParam> request) {
        ReadMsgParam param = request.getParam();
        Response<HashMap> response = new Response<>();
        if (0 == param.getMessageId()) {
            response.setResult(ConstantDef.RESPONSE.FAIL);
            response.setMessage("参数异常！");
            response.setData(new HashMap());
        } else {
            boolean rs = allMsgService.readMsgList(param);
            if (rs) {
                response.setResult(ConstantDef.RESPONSE.SUCCESS);
                response.setMessage("标记消息已读成功！");
                response.setData(new HashMap<>());
            } else {
                response.setResult(ConstantDef.RESPONSE.FAIL);
                response.setMessage("标记消息已读失败！");
                response.setData(new HashMap<>());
            }
        }
        return response;
    }

    /**
     * 雇主-发送订单消息
     *
     * @param request 请求参数
     */
    @RequestMapping(value = "/employer/setMsg", method = RequestMethod.POST)
    @ApiOperation(notes = "雇主-发送订单消息", httpMethod = "POST", value = "雇主-发送订单消息")
    public Response<HashMap> setEmployerMsg(@RequestBody Request<EmployerSetMsgParam> request) {
        EmployerSetMsgParam param = request.getParam();
        Response<HashMap> response = new Response<>();
        if (null == param.getOrderId() || "" == param.getOrderId()) {
            response.setResult(ConstantDef.RESPONSE.FAIL);
            response.setMessage("参数异常！");
            response.setData(new HashMap());
        } else {
            //TODO 推送
            List<MsgStaffAliasResult> rsList = allMsgService.getStaffAlias(param);
            List<String> aliasListAndroid = new ArrayList<>();
            List<String> aliasListIos = new ArrayList<>();
            int successNum = 0;
            int falseNum = 0;
            for (MsgStaffAliasResult alias : rsList) {
                if (null != alias.getUserId() && "" != alias.getUserId()) {
                    if (alias.getPlatForm().equals("android")) {
                        aliasListAndroid.add(alias.getUserId());
                    } else if (alias.getPlatForm().equals("ios")) {
                        aliasListIos.add(alias.getUserId());
                    }
                    param.setReceiverId(alias.getUserId());
                    boolean rs = allMsgService.setEmployerMsg(param);
                    if (rs) {
                        successNum++;
                    } else {
                        falseNum++;
                    }
                }
            }
            JpushUtils.sendJpushMsg(param.getMsg(), aliasListAndroid, JPUSH_TYPE_ORDER, "android", param.getOrderId());
            JpushUtils.sendJpushMsg(param.getMsg(), aliasListIos, JPUSH_TYPE_ORDER, "ios", null);

            response.setResult(ConstantDef.RESPONSE.SUCCESS);
            response.setMessage(successNum + "条发送消息成功;" + falseNum + "条发送消息失败");
            response.setData(new HashMap<>());
        }
        return response;
    }

    /**
     * 发送系统消息
     *
     * @param request 请求参数
     */
    @RequestMapping(value = "/sys/setSysMsg", method = RequestMethod.POST)
    @ApiOperation(notes = "发送系统消息", httpMethod = "POST", value = "发送系统消息")
    public Response<HashMap> setSysMsg(@RequestBody Request<SetSysMsgParam> request) {
        SetSysMsgParam param = request.getParam();
        Response<HashMap> response = new Response<>();
        if (0 == param.getUserId()) {
            response.setResult(ConstantDef.RESPONSE.FAIL);
            response.setMessage("参数异常！");
            response.setData(new HashMap());
        } else {
            //TODO 推送 android 透传 ios 推送；要分开推
            List<MsgStaffAliasResult> rsList = allMsgService.getAllStaffAlias();
            List<String> aliasListAndroid = new ArrayList<>();
            List<String> aliasListIos = new ArrayList<>();
            int successNum = 0;
            int falseNum = 0;
            for (MsgStaffAliasResult alias : rsList) {
                if (null != alias.getUserId() && "" != alias.getUserId()) {
                    if (null != alias.getPlatForm()) {
                        if (alias.getPlatForm().equals("android")) {
                            aliasListAndroid.add(alias.getUserId());
                        } else if (alias.getPlatForm().equals("ios")) {
                            aliasListIos.add(alias.getUserId());
                        }
                        param.setReceiverId(alias.getUserId());
                        boolean rs = allMsgService.setSysMsg(param);
                        if (rs) {
                            successNum++;
                        } else {
                            falseNum++;
                        }
                    }
                }
            }

            JpushUtils.sendJpushMsg(param.getMsg(), aliasListAndroid, JPUSH_TYPE_SYS, "android", null);
            JpushUtils.sendJpushMsg(param.getMsg(), aliasListIos, JPUSH_TYPE_SYS, "ios", null);

            response.setResult(ConstantDef.RESPONSE.SUCCESS);
            response.setMessage(successNum + "条发送消息成功;" + falseNum + "条发送消息失败");
            response.setData(new HashMap<>());
        }
        return response;
    }
}
