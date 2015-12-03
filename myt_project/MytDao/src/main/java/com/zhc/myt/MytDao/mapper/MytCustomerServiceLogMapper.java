package com.zhc.myt.MytDao.mapper;

import com.zhc.myt.MytDao.entity.MytCustomerServiceLog;
import com.zhc.myt.MytDao.entity.MytCustomerServiceLogExample;
import java.util.List;

public interface MytCustomerServiceLogMapper {
    int countByExample(MytCustomerServiceLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MytCustomerServiceLog record);

    int insertSelective(MytCustomerServiceLog record);

    List<MytCustomerServiceLog> selectByExample(MytCustomerServiceLogExample example);

    MytCustomerServiceLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MytCustomerServiceLog record);

    int updateByPrimaryKey(MytCustomerServiceLog record);
}