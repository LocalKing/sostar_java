package com.sostar.service;

import com.github.pagehelper.Page;
import com.sostar.bean.PaginationResult;
import com.sostar.bean.param.*;
import com.sostar.bean.result.AllMsgResult;
import com.sostar.bean.result.MsgStaffAliasResult;
import com.sostar.dao.AllMsgDao;
import com.sostar.until.SqlUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by liuyang on 2017/2/20.
 */
@Service
public class AllMsgService {
    @Autowired
    private AllMsgDao allMsgDao;
    public PaginationResult<AllMsgResult> getMsgList(AllMsgParam param){
        Page<AllMsgResult> page = SqlUtils.getPage(param);
        allMsgDao.getMsgList(param);
        PaginationResult<AllMsgResult> paginationResult = new PaginationResult();
        paginationResult.setTotal(page.getTotal());
        paginationResult.setData(page.getResult());
        return paginationResult;
    }
    public boolean deleteMsgList(DeleteMsgParam param) {
        return allMsgDao.deleteMsgList(param) != 0;
    }
    public boolean deleteMsg(ReadMsgParam param) {
        return allMsgDao.deleteMsg(param) != 0;
    }
    public boolean readMsgList(ReadMsgParam param) {
        return allMsgDao.readMsgList(param) != 0;
    }
    public boolean setEmployerMsg(EmployerSetMsgParam param) {
        return allMsgDao.setEmployerMsg(param) != 0;
    }
    public List<MsgStaffAliasResult> getStaffAlias(EmployerSetMsgParam param) {
        return allMsgDao.getStaffAlias(param);
    }
    public boolean setSysMsg(SetSysMsgParam param) {
        return allMsgDao.setSysMsg(param) != 0;
    }
    public List<MsgStaffAliasResult> getAllStaffAlias() {
        return allMsgDao.getAllStaffAlias();
    }

}
