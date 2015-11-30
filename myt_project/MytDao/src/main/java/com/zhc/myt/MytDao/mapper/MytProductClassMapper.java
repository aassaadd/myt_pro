package com.zhc.myt.MytDao.mapper;

import com.zhc.myt.MytDao.entity.MytProductClass;
import com.zhc.myt.MytDao.entity.MytProductClassExample;
import java.util.List;

public interface MytProductClassMapper {
    int countByExample(MytProductClassExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MytProductClass record);

    int insertSelective(MytProductClass record);

    List<MytProductClass> selectByExample(MytProductClassExample example);

    MytProductClass selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MytProductClass record);

    int updateByPrimaryKey(MytProductClass record);
}