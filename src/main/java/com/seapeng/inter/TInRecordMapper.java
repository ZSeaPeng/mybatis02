package com.seapeng.inter;

import com.seapeng.model.TInRecord;

public interface TInRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TInRecord record);

    int insertSelective(TInRecord record);

    TInRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TInRecord record);

    int updateByPrimaryKey(TInRecord record);
}