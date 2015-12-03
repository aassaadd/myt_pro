package com.zhc.myt.MytDao.mapper;

import com.zhc.myt.MytDao.entity.MytFeedback;
import com.zhc.myt.MytDao.entity.MytFeedbackExample;
import java.util.List;

public interface MytFeedbackMapper {
    int countByExample(MytFeedbackExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MytFeedback record);

    int insertSelective(MytFeedback record);

    List<MytFeedback> selectByExample(MytFeedbackExample example);

    MytFeedback selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MytFeedback record);

    int updateByPrimaryKey(MytFeedback record);
}