package com.zhc.myt.MytDao.mapper;

import com.zhc.myt.MytDao.entity.MytQuestionnaire;
import com.zhc.myt.MytDao.entity.MytQuestionnaireExample;
import java.util.List;

public interface MytQuestionnaireMapper {
    int countByExample(MytQuestionnaireExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MytQuestionnaire record);

    int insertSelective(MytQuestionnaire record);

    List<MytQuestionnaire> selectByExample(MytQuestionnaireExample example);

    MytQuestionnaire selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MytQuestionnaire record);

    int updateByPrimaryKey(MytQuestionnaire record);
}