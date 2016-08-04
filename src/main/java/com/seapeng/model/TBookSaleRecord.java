package com.seapeng.model;

public class TBookSaleRecord {
    private Integer id;

    private Integer bookIdFk;

    private Integer tSaleRecordIdFk;

    private Integer tradeSum;

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

    public Integer gettSaleRecordIdFk() {
        return tSaleRecordIdFk;
    }

    public void settSaleRecordIdFk(Integer tSaleRecordIdFk) {
        this.tSaleRecordIdFk = tSaleRecordIdFk;
    }

    public Integer getTradeSum() {
        return tradeSum;
    }

    public void setTradeSum(Integer tradeSum) {
        this.tradeSum = tradeSum;
    }
}