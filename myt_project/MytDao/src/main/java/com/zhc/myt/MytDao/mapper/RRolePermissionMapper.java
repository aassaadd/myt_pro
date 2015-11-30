package com.zhc.myt.MytDao.mapper;

import com.zhc.myt.MytDao.entity.RRolePermission;
import com.zhc.myt.MytDao.entity.RRolePermissionExample;
import java.util.List;

public interface RRolePermissionMapper {
    int countByExample(RRolePermissionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RRolePermission record);

    int insertSelective(RRolePermission record);

    List<RRolePermission> selectByExample(RRolePermissionExample example);

    RRolePermission selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RRolePermission record);

    int updateByPrimaryKey(RRolePermission record);
}