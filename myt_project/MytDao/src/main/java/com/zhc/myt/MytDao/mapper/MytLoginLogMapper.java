package com.zhc.myt.MytDao.mapper;

import com.zhc.myt.MytDao.entity.MytLoginLog;
import com.zhc.myt.MytDao.entity.MytLoginLogExample;
import java.util.List;

public interface MytLoginLogMapper {
    int countByExample(MytLoginLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MytLoginLog record);

    int insertSelective(MytLoginLog record);

    List<MytLoginLog> selectByExample(MytLoginLogExample example);

    MytLoginLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MytLoginLog record);

    int updateByPrimaryKey(MytLoginLog record);
}