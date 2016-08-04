package com.seapeng.model;

public class TBookInRecord {
    private Integer id;

    private Integer bookIdFk;

    private Integer tInRecordIdFk;

    private Integer inSum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBookIdFk() {
        return bookIdFk;
    }

    public void setBookIdFk(Integer bookIdFk) {
        this.bookIdFk = bookIdFk;
    }

    public Integer gettInRecordIdFk() {
        return tInRecordIdFk;
    }

    public void settInRecordIdFk(Integer tInRecordIdFk) {
        this.tInRecordIdFk = tInRecordIdFk;
    }

    public Integer getInSum() {
        return inSum;
    }

    public void setInSum(Integer inSum) {
        this.inSum = inSum;
    }
}