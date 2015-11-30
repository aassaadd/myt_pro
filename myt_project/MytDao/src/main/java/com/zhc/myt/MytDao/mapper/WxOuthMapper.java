package com.zhc.myt.MytDao.mapper;

import com.zhc.myt.MytDao.entity.WxOuth;
import com.zhc.myt.MytDao.entity.WxOuthExample;
import java.util.List;

public interface WxOuthMapper {
    int countByExample(WxOuthExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WxOuth record);

    int insertSelective(WxOuth record);

    List<WxOuth> selectByExample(WxOuthExample example);

    WxOuth selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WxOuth record);

    int updateByPrimaryKey(WxOuth record);
}