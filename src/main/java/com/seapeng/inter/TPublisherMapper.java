package com.seapeng.inter;

import com.seapeng.model.TPublisher;

public interface TPublisherMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TPublisher record);

    int insertSelective(TPublisher record);

    TPublisher selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TPublisher record);

    int updateByPrimaryKey(TPublisher record);
}