package com.zhc.myt.MytDao.mapper;

import com.zhc.myt.MytDao.entity.RUserRole;
import com.zhc.myt.MytDao.entity.RUserRoleExample;
import java.util.List;

public interface RUserRoleMapper {
    int countByExample(RUserRoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RUserRole record);

    int insertSelective(RUserRole record);

    List<RUserRole> selectByExample(RUserRoleExample example);

    RUserRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RUserRole record);

    int updateByPrimaryKey(RUserRole record);
}