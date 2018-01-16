package com.elastic.entity.po;

import java.util.Date;

public class CmsCategory {
    private Integer cmsCateId;

    private String cmsCategoryPagekey;

    private Integer cmsCateParentid;

    private String cmsCateName;

    private Integer cmsCateLevel;

    private String redFlg;

    private String prodCateIds;

    private Integer cmsCateOrder;

    private String cmsCateTargeturl;

    private String creator;

    private Date createDate;

    private String modify;

    private Date modifyDate;

    private Integer delFlag;

    private Long version;

    public Integer getCmsCateId() {
        return cmsCateId;
    }

    public void setCmsCateId(Integer cmsCateId) {
        this.cmsCateId = cmsCateId;
    }

    public String getCmsCategoryPagekey() {
        return cmsCategoryPagekey;
    }

    public void setCmsCategoryPagekey(String cmsCategoryPagekey) {
        this.cmsCategoryPagekey = cmsCategoryPagekey;
    }

    public Integer getCmsCateParentid() {
        return cmsCateParentid;
    }

    public void setCmsCateParentid(Integer cmsCateParentid) {
        this.cmsCateParentid = cmsCateParentid;
    }

    public String getCmsCateName() {
        return cmsCateName;
    }

    public void setCmsCateName(String cmsCateName) {
        this.cmsCateName = cmsCateName;
    }

    public Integer getCmsCateLevel() {
        return cmsCateLevel;
    }

    public void setCmsCateLevel(Integer cmsCateLevel) {
        this.cmsCateLevel = cmsCateLevel;
    }

    public String getRedFlg() {
        return redFlg;
    }

    public void setRedFlg(String redFlg) {
        this.redFlg = redFlg;
    }

    public String getProdCateIds() {
        return prodCateIds;
    }

    public void setProdCateIds(String prodCateIds) {
        this.prodCateIds = prodCateIds;
    }

    public Integer getCmsCateOrder() {
        return cmsCateOrder;
    }

    public void setCmsCateOrder(Integer cmsCateOrder) {
        this.cmsCateOrder = cmsCateOrder;
    }

    public String getCmsCateTargeturl() {
        return cmsCateTargeturl;
    }

    public void setCmsCateTargeturl(String cmsCateTargeturl) {
        this.cmsCateTargeturl = cmsCateTargeturl;
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

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }
}