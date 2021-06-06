package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * 作者：zsy  创建日期：2021/6/6 11:15
 */
public class Province extends DataSupport {

    private int id;

    private String provinceName;

    private int getProvinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getGetProvinceCode() {
        return getProvinceCode;
    }

    public void setGetProvinceCode(int getProvinceCode) {
        this.getProvinceCode = getProvinceCode;
    }
}
