package com.elastic.entity.po;

import java.util.Date;

public class ProdSkuAttribute {
    private Integer skuAttId;

    private String skuId;

    private Integer attId;

    private Integer attValueId;

    private Integer skuSort;

    private String creator;

    private Date createDate;

    private String modify;

    private Date modifyDate;

    private Byte delFlag;

    private Long version;

    public Integer getSkuAttId() {
        return skuAttId;
    }

    public void setSkuAttId(Integer skuAttId) {
        this.skuAttId = skuAttId;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public Integer getAttId() {
        return attId;
    }

    public void setAttId(Integer attId) {
        this.attId = attId;
    }

    public Integer getAttValueId() {
        return attValueId;
    }

    public void setAttValueId(Integer attValueId) {
        this.attValueId = attValueId;
    }

    public Integer getSkuSort() {
        return skuSort;
    }

    public void setSkuSort(Integer skuSort) {
        this.skuSort = skuSort;
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

    public Byte getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Byte delFlag) {
        this.delFlag = delFlag;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }
}