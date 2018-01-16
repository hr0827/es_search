package com.elastic.entity.po;

import java.util.Date;

public class ProdSpuAttribute {
    private Integer spuAttId;

    private String spuId;

    private Integer attId;

    private Integer attValueId;

    private Integer spuSort;

    private String creator;

    private Date createDate;

    private String modify;

    private Date modifyDate;

    private Byte delFlag;

    private Long version;

    public Integer getSpuAttId() {
        return spuAttId;
    }

    public void setSpuAttId(Integer spuAttId) {
        this.spuAttId = spuAttId;
    }

    public String getSpuId() {
        return spuId;
    }

    public void setSpuId(String spuId) {
        this.spuId = spuId;
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

    public Integer getSpuSort() {
        return spuSort;
    }

    public void setSpuSort(Integer spuSort) {
        this.spuSort = spuSort;
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