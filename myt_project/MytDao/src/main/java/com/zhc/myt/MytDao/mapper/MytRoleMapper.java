package com.zhc.myt.MytDao.mapper;

import com.zhc.myt.MytDao.entity.MytRole;
import com.zhc.myt.MytDao.entity.MytRoleExample;
import java.util.List;

public interface MytRoleMapper {
    int countByExample(MytRoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MytRole record);

    int insertSelective(MytRole record);

    List<MytRole> selectByExample(MytRoleExample example);

    MytRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MytRole record);

    int updateByPrimaryKey(MytRole record);
}