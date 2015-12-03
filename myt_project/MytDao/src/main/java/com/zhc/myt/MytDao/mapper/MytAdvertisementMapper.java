package com.zhc.myt.MytDao.mapper;

import com.zhc.myt.MytDao.entity.MytAdvertisement;
import com.zhc.myt.MytDao.entity.MytAdvertisementExample;
import java.util.List;

public interface MytAdvertisementMapper {
    int countByExample(MytAdvertisementExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MytAdvertisement record);

    int insertSelective(MytAdvertisement record);

    List<MytAdvertisement> selectByExample(MytAdvertisementExample example);

    MytAdvertisement selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MytAdvertisement record);

    int updateByPrimaryKey(MytAdvertisement record);
}