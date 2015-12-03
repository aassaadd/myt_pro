package com.zhc.myt.MytDao.mapper;

import com.zhc.myt.MytDao.entity.RFileEnt;
import com.zhc.myt.MytDao.entity.RFileEntExample;
import java.util.List;

public interface RFileEntMapper {
    int countByExample(RFileEntExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RFileEnt record);

    int insertSelective(RFileEnt record);

    List<RFileEnt> selectByExample(RFileEntExample example);

    RFileEnt selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RFileEnt record);

    int updateByPrimaryKey(RFileEnt record);
}