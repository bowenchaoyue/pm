package com.chaowen.model.dto;


import com.chaowen.model.BaseModel;

import java.util.Date;

public class InfomationDTO extends BaseModel {

    private Long categoryId;
    /**
     * 作者
     */
    private String author;
    /**
     * 标题
     */
    private String title;
    /**
     * 来源
     */
    private String source;
    /**
     * 摘要
     */
    private String introduction;
    /**
     * 发布时间
     */
    private Date publishTime;

    private Byte publish;
    /**
     *内容
     */
    private String content;

    private Byte lang;

    private String picurl;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public Byte getPublish() {
        return publish;
    }

    public void setPublish(Byte publish) {
        this.publish = publish;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Byte getLang() {
        return lang;
    }

    public void setLang(Byte lang) {
        this.lang = lang;
    }

    public String getPicurl() {
        return picurl;
    }

    public void setPicurl(String picurl) {
        this.picurl = picurl;
    }
}
