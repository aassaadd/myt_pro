package com.zhc.myt.MytDao.mapper;

import com.zhc.myt.MytDao.entity.MytProductApply;
import com.zhc.myt.MytDao.entity.MytProductApplyExample;
import java.util.List;

public interface MytProductApplyMapper {
    int countByExample(MytProductApplyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MytProductApply record);

    int insertSelective(MytProductApply record);

    List<MytProductApply> selectByExample(MytProductApplyExample example);

    MytProductApply selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MytProductApply record);

    int updateByPrimaryKey(MytProductApply record);
}