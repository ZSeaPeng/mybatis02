package com.seapeng.inter;

import com.seapeng.model.TBookInRecord;

public interface TBookInRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TBookInRecord record);

    int insertSelective(TBookInRecord record);

    TBookInRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TBookInRecord record);

    int updateByPrimaryKey(TBookInRecord record);
}