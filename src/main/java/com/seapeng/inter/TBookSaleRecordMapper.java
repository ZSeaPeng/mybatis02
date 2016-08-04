package com.seapeng.inter;

import com.seapeng.model.TBookSaleRecord;

public interface TBookSaleRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TBookSaleRecord record);

    int insertSelective(TBookSaleRecord record);

    TBookSaleRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TBookSaleRecord record);

    int updateByPrimaryKey(TBookSaleRecord record);
}