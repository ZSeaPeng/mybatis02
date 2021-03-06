package com.seapeng.inter;

import com.seapeng.model.TBook;

public interface TBookMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TBook record);

    int insertSelective(TBook record);

    TBook selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TBook record);

    int updateByPrimaryKey(TBook record);
}