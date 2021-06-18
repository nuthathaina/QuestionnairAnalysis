package com.elevenzon.image;

import java.io.Serializable;

public class TableInfo implements Serializable {

    public String tableNo, tableName, tableAmount;

    public TableInfo() { }

    public TableInfo(String tableNo, String tableName, String tableAmount) {
        this.tableNo = tableNo;
        this.tableName = tableName;
        this.tableAmount = tableAmount;
    }

    public String getTableNo() {
        return tableNo;
    }
    public void setTableNo(String tableNo) { this.tableNo = tableNo; }

    public String getTableName() {
        return tableName;
    }
    public void setTableName(String tableName) { this.tableName = tableName; }

    public String getTableAmount() {
        return tableAmount;
    }
    public void setTableAmount(String tableAmount) { this.tableAmount = tableAmount; }

}
