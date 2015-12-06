package com.zhc.myt.MytDao.mapper;

import com.zhc.myt.MytDao.entity.MytProduct;
import com.zhc.myt.MytDao.entity.MytProductExample;
import java.util.List;

public interface MytProductMapper {
    int countByExample(MytProductExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MytProduct record);

    int insertSelective(MytProduct record);

    List<MytProduct> selectByExample(MytProductExample example);

    MytProduct selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MytProduct record);

    int updateByPrimaryKey(MytProduct record);
}