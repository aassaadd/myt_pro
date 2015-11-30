package com.zhc.myt.MytDao.mapper;

import com.zhc.myt.MytDao.entity.MytOrders;
import com.zhc.myt.MytDao.entity.MytOrdersExample;
import java.util.List;

public interface MytOrdersMapper {
    int countByExample(MytOrdersExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MytOrders record);

    int insertSelective(MytOrders record);

    List<MytOrders> selectByExample(MytOrdersExample example);

    MytOrders selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MytOrders record);

    int updateByPrimaryKey(MytOrders record);
}