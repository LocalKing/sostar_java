package com.sostar.service;

import com.sostar.bean.param.SuggestParam;
import com.sostar.dao.SuggestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by liuyang on 2017/2/20.
 */
@Service
public class SuggestService {
    @Autowired
    private SuggestDao suggestDao;

    public boolean setSuggest(SuggestParam param) {
        return suggestDao.setSuggest(param) != 0;
    }

}
