package com.zhc.myt.MytDao.mapper;

import com.zhc.myt.MytDao.entity.MytAppModule;
import com.zhc.myt.MytDao.entity.MytAppModuleExample;
import java.util.List;

public interface MytAppModuleMapper {
    int countByExample(MytAppModuleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MytAppModule record);

    int insertSelective(MytAppModule record);

    List<MytAppModule> selectByExample(MytAppModuleExample example);

    MytAppModule selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MytAppModule record);

    int updateByPrimaryKey(MytAppModule record);
}