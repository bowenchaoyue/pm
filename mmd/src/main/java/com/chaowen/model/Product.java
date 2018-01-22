package com.chaowen.model;

import java.util.List;

public class Product extends BaseModel{

    /**
     * 产品名称
     */
    private String name;
    /**
     * 简介
     */
    private String introduction;
    /**
     * 图片地址
     */
    private List<String> picurls;
    /**
     * 价格
     */
    private Double price;
    /**
     * 详情
     */
    private String detail;

    private Byte series;

    private Byte lang;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public List<String> getPicurls() {
        return picurls;
    }

    public void setPicurls(List<String> picurls) {
        this.picurls = picurls;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Byte getSeries() {
        return series;
    }

    public void setSeries(Byte series) {
        this.series = series;
    }

    public Byte getLang() {
        return lang;
    }

    public void setLang(Byte lang) {
        this.lang = lang;
    }
}
