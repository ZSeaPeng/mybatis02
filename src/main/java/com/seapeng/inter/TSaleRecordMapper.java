package com.seapeng.inter;

import com.seapeng.model.TSaleRecord;

public interface TSaleRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TSaleRecord record);

    int insertSelective(TSaleRecord record);

    TSaleRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TSaleRecord record);

    int updateByPrimaryKey(TSaleRecord record);
}