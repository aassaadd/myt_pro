package com.zhc.myt.MytDao.mapper;

import com.zhc.myt.MytDao.entity.MytUser;
import com.zhc.myt.MytDao.entity.MytUserExample;
import java.util.List;

public interface MytUserMapper {
    int countByExample(MytUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MytUser record);

    int insertSelective(MytUser record);

    List<MytUser> selectByExample(MytUserExample example);

    MytUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MytUser record);

    int updateByPrimaryKey(MytUser record);
}