package com.elastic.entity.po;

import java.util.Date;

public class ProdSku {
    private String skuId;

    private String spuId;

    private Integer brandId;

    private String gomeSkuid;

    private String skuName;

    private Integer skuStatus;

    private String skuStatusName;

    private String defaultState;

    private Integer skuSort;

    private Integer showBrowseNumber;

    private Integer browseNumber;

    private Integer showCollectionNumber;

    private Integer collectionNumber;

    private String creator;

    private Date createDate;

    private String modify;

    private Date modifyDate;

    private String delFlag;

    private Long version;

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public String getSpuId() {
        return spuId;
    }

    public void setSpuId(String spuId) {
        this.spuId = spuId;
    }

    public String getGomeSkuid() {
        return gomeSkuid;
    }

    public void setGomeSkuid(String gomeSkuid) {
        this.gomeSkuid = gomeSkuid;
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public Integer getSkuStatus() {
        return skuStatus;
    }

    public void setSkuStatus(Integer skuStatus) {
        this.skuStatus = skuStatus;
    }

    public String getSkuStatusName() {
        return skuStatusName;
    }

    public void setSkuStatusName(String skuStatusName) {
        this.skuStatusName = skuStatusName;
    }

    public String getDefaultState() {
        return defaultState;
    }

    public void setDefaultState(String defaultState) {
        this.defaultState = defaultState;
    }

    public Integer getSkuSort() {
        return skuSort;
    }

    public void setSkuSort(Integer skuSort) {
        this.skuSort = skuSort;
    }

    public Integer getShowBrowseNumber() {
        return showBrowseNumber;
    }

    public void setShowBrowseNumber(Integer showBrowseNumber) {
        this.showBrowseNumber = showBrowseNumber;
    }

    public Integer getBrowseNumber() {
        return browseNumber;
    }

    public void setBrowseNumber(Integer browseNumber) {
        this.browseNumber = browseNumber;
    }

    public Integer getShowCollectionNumber() {
        return showCollectionNumber;
    }

    public void setShowCollectionNumber(Integer showCollectionNumber) {
        this.showCollectionNumber = showCollectionNumber;
    }

    public Integer getCollectionNumber() {
        return collectionNumber;
    }

    public void setCollectionNumber(Integer collectionNumber) {
        this.collectionNumber = collectionNumber;
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

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }
}