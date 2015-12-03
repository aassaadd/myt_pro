package com.zhc.myt.MytDao.mapper;

import com.zhc.myt.MytDao.entity.WxUserAddress;
import com.zhc.myt.MytDao.entity.WxUserAddressExample;
import java.util.List;

public interface WxUserAddressMapper {
    int countByExample(WxUserAddressExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WxUserAddress record);

    int insertSelective(WxUserAddress record);

    List<WxUserAddress> selectByExample(WxUserAddressExample example);

    WxUserAddress selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WxUserAddress record);

    int updateByPrimaryKey(WxUserAddress record);
}