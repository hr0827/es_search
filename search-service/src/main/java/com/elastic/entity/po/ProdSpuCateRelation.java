package com.elastic.entity.po;

import java.util.Date;

public class ProdSpuCateRelation extends ProdSpuCateRelationKey {
    private String firstLevelCateId;

    private String secondLevelCateId;

    private String thirdLevelCateId;

    private String creator;

    private Date createDate;

    private String modify;

    private Date modifyDate;

    public String getFirstLevelCateId() {
        return firstLevelCateId;
    }

    public void setFirstLevelCateId(String firstLevelCateId) {
        this.firstLevelCateId = firstLevelCateId;
    }

    public String getSecondLevelCateId() {
        return secondLevelCateId;
    }

    public void setSecondLevelCateId(String secondLevelCateId) {
        this.secondLevelCateId = secondLevelCateId;
    }

    public String getThirdLevelCateId() {
        return thirdLevelCateId;
    }

    public void setThirdLevelCateId(String thirdLevelCateId) {
        this.thirdLevelCateId = thirdLevelCateId;
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

    public String getModify() {
        return modify;
    }

    public void setModify(String modify) {
        this.modify = modify;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }
}