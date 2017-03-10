package com.sostar.dao;

import com.sostar.bean.param.*;
import com.sostar.bean.result.AllMsgResult;
import com.sostar.bean.result.MsgStaffAliasResult;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by liuyang on 2017/2/16.
 */
@Mapper
public interface AllMsgDao {
    List<AllMsgResult> getMsgList(AllMsgParam param);
    int deleteMsgList(DeleteMsgParam param);
    int deleteMsg(ReadMsgParam param);
    int readMsgList(ReadMsgParam param);
    int setEmployerMsg(EmployerSetMsgParam param);
    List<MsgStaffAliasResult> getStaffAlias(EmployerSetMsgParam param);
    int setSysMsg(SetSysMsgParam param);
    List<MsgStaffAliasResult> getAllStaffAlias();
}
