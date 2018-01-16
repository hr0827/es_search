package com.elastic.entity.po;

import java.util.Date;

public class CmsSearchFilterCateAttr {
    private Integer filterCateAttrId;

    private Integer filterCateId;

    private String filterCateName;

    private Integer filterAttrId;

    private String filterAttrName;

    private Integer filterAttrScore;

    private String type;

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

    public String getFilterCateName() {
        return filterCateName;
    }

    public void setFilterCateName(String filterCateName) {
        this.filterCateName = filterCateName == null ? null : filterCateName.trim();
    }

    public Integer getFilterAttrId() {
        return filterAttrId;
    }

    public void setFilterAttrId(Integer filterAttrId) {
        this.filterAttrId = filterAttrId;
    }

    public String getFilterAttrName() {
        return filterAttrName;
    }

    public void setFilterAttrName(String filterAttrName) {
        this.filterAttrName = filterAttrName == null ? null : filterAttrName.trim();
    }

    public Integer getFilterAttrScore() {
        return filterAttrScore;
    }

    public void setFilterAttrScore(Integer filterAttrScore) {
        this.filterAttrScore = filterAttrScore;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
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
        this.modfiy = modfiy == null ? null : modfiy.trim();
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }
}