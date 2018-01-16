package com.elastic.entity.po;

import java.util.Date;

public class CmsSolrFilterCateAttr {
    private Integer filterCateAttrId;

    private Integer filterCateId;

    private Integer filterAttId;

    private Integer filterAttScore;

    private String creator;

    private Date createDate;

    private String modfiy;

    private Date modifyDate;

    public Integer getFilterCateAttrId() {
        return filterCateAttrId;
    }

    public void setFilterCateAttrId(Integer filterCateAttrId) {
        this.filterCateAttrId = filterCateAttrId;
    }

    public Integer getFilterCateId() {
        return filterCateId;
    }

    public void setFilterCateId(Integer filterCateId) {
        this.filterCateId = filterCateId;
    }

    public Integer getFilterAttId() {
        return filterAttId;
    }

    public void setFilterAttId(Integer filterAttId) {
        this.filterAttId = filterAttId;
    }

    public Integer getFilterAttScore() {
        return filterAttScore;
    }

    public void setFilterAttScore(Integer filterAttScore) {
        this.filterAttScore = filterAttScore;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getModfiy() {
        return modfiy;
    }

    public void setModfiy(String modfiy) {
        this.modfiy = modfiy;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }
}