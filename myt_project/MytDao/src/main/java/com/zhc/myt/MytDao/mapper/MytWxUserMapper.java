package com.zhc.myt.MytDao.mapper;

import com.zhc.myt.MytDao.entity.MytWxUser;
import com.zhc.myt.MytDao.entity.MytWxUserExample;
import java.util.List;

public interface MytWxUserMapper {
    int countByExample(MytWxUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MytWxUser record);

    int insertSelective(MytWxUser record);

    List<MytWxUser> selectByExample(MytWxUserExample example);

    MytWxUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MytWxUser record);

    int updateByPrimaryKey(MytWxUser record);
}