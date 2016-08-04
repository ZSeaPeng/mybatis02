package com.seapeng.inter;

import com.seapeng.model.TBookType;

public interface TBookTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TBookType record);

    int insertSelective(TBookType record);

    TBookType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TBookType record);

    int updateByPrimaryKey(TBookType record);
}