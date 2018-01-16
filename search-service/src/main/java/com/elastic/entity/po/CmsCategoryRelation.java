package com.elastic.entity.po;

import java.util.Date;

public class CmsCategoryRelation {
    private Integer relationId;

    private Integer cmsCategoryId;

    private Integer prodCategoryId;

    private String creator;

    private Date createDate;

    private String modfiy;

    private Date modifyDate;

    private String delFlag;

    private Long version;

    public Integer getRelationId() {
        return relationId;
    }

    public void setRelationId(Integer relationId) {
        this.relationId = relationId;
    }

    public Integer getCmsCategoryId() {
        return cmsCategoryId;
    }

    public void setCmsCategoryId(Integer cmsCategoryId) {
        this.cmsCategoryId = cmsCategoryId;
    }

    public Integer getProdCategoryId() {
        return prodCategoryId;
    }

    public void setProdCategoryId(Integer prodCategoryId) {
        this.prodCategoryId = prodCategoryId;
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

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }
}