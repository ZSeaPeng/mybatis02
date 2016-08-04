package com.seapeng.model;

import java.util.Date;

public class TSaleRecord {
    private Integer id;

    private Date recordDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(Date recordDate) {
        this.recordDate = recordDate;
    }
}