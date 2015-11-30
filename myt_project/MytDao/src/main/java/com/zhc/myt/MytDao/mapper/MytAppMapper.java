package com.zhc.myt.MytDao.mapper;

import com.zhc.myt.MytDao.entity.MytApp;
import com.zhc.myt.MytDao.entity.MytAppExample;
import java.util.List;

public interface MytAppMapper {
    int countByExample(MytAppExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MytApp record);

    int insertSelective(MytApp record);

    List<MytApp> selectByExample(MytAppExample example);

    MytApp selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MytApp record);

    int updateByPrimaryKey(MytApp record);
}