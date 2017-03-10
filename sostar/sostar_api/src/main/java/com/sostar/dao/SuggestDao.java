package com.sostar.dao;

import com.sostar.bean.param.SuggestParam;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by liuyang on 2017/2/16.
 */
@Mapper
public interface SuggestDao {
    int setSuggest(SuggestParam param);
}
