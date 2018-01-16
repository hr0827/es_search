package com.elastic.entity.po;

import java.util.Date;

public class ProdCateAtt {
    private Integer cateAttId;

    private String cateId;

    private Integer attId;

    private String creator;

    private Date createDate;

    private String modfiy;

    private Date modifyDate;

    private Byte delFlag;

    private Long version;

    public Integer getCateAttId() {
        return cateAttId;
    }

    public void setCateAttId(Integer cateAttId) {
        this.cateAttId = cateAttId;
    }

    public String getCateId() {
        return cateId;
    }

    public void setCateId(String cateId) {
        this.cateId = cateId;
    }

    public Integer getAttId() {
        return attId;
    }

    public void setAttId(Integer attId) {
        this.attId = attId;
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