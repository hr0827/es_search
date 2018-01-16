package com.elastic.entity.po;

import java.util.Date;

public class ProdAttributeName {
    private Integer attId;

    private String attName;

    private String attShortName;

    private String attDesc;

    private String creator;

    private Date createDate;

    private String modify;

    private Date modifyDate;

    private Byte delFlag;

    private Long version;

    public Integer getAttId() {
        return attId;
    }

    public void setAttId(Integer attId) {
        this.attId = attId;
    }

    public String getAttName() {
        return attName;
    }

    public void setAttName(String attName) {
        this.attName = attName;
    }

    public String getAttShortName() {
        return attShortName;
    }

    public void setAttShortName(String attShortName) {
        this.attShortName = attShortName;
    }

    public String getAttDesc() {
        return attDesc;
    }

    public void setAttDesc(String attDesc) {
        this.attDesc = attDesc;
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