package com.zhc.myt.MytDao.mapper;

import com.zhc.myt.MytDao.entity.MytQuestionnaireFill;
import com.zhc.myt.MytDao.entity.MytQuestionnaireFillExample;
import java.util.List;

public interface MytQuestionnaireFillMapper {
    int countByExample(MytQuestionnaireFillExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MytQuestionnaireFill record);

    int insertSelective(MytQuestionnaireFill record);

    List<MytQuestionnaireFill> selectByExample(MytQuestionnaireFillExample example);

    MytQuestionnaireFill selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MytQuestionnaireFill record);

    int updateByPrimaryKey(MytQuestionnaireFill record);
}