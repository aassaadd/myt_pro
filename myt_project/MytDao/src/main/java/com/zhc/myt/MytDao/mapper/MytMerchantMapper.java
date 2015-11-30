package com.zhc.myt.MytDao.mapper;

import com.zhc.myt.MytDao.entity.MytMerchant;
import com.zhc.myt.MytDao.entity.MytMerchantExample;
import java.util.List;

public interface MytMerchantMapper {
    int countByExample(MytMerchantExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MytMerchant record);

    int insertSelective(MytMerchant record);

    List<MytMerchant> selectByExample(MytMerchantExample example);

    MytMerchant selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MytMerchant record);

    int updateByPrimaryKey(MytMerchant record);
}