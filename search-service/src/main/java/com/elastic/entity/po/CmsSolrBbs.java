package com.elastic.entity.po;

import java.util.Date;

public class CmsSolrBbs {
    private Integer id;

    private Integer categoryId;

    private String communityName;

    private String communitySummary;

    private String surface;

    private Integer like;

    private Integer collect;

    private Date createTime;

    private Date modifyTime;

    private Byte delFlag;

    private String communityContent;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public String getCommunitySummary() {
        return communitySummary;
    }

    public void setCommunitySummary(String communitySummary) {
        this.communitySummary = communitySummary;
    }

    public String getSurface() {
        return surface;
    }

    public void setSurface(String surface) {
        this.surface = surface;
    }

    public Integer getLike() {
        return like;
    }

    public void setLike(Integer like) {
        this.like = like;
    }

    public Integer getCollect() {
        return collect;
    }

    public void setCollect(Integer collect) {
        this.collect = collect;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Byte getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Byte delFlag) {
        this.delFlag = delFlag;
    }

    public String getCommunityContent() {
        return communityContent;
    }

    public void setCommunityContent(String communityContent) {
        this.communityContent = communityContent;
    }
}