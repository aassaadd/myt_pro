package com.zhc.myt.MytDao.mapper;

import com.zhc.myt.MytDao.entity.MytFile;
import com.zhc.myt.MytDao.entity.MytFileExample;
import java.util.List;

public interface MytFileMapper {
    int countByExample(MytFileExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MytFile record);

    int insertSelective(MytFile record);

    List<MytFile> selectByExample(MytFileExample example);

    MytFile selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MytFile record);

    int updateByPrimaryKey(MytFile record);
}