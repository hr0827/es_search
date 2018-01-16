package com.elastic.service.vo;

public class ProductInfo {

    private String spu;
    private String sku;
    private String gomeSku;
    private boolean isStock;
    private boolean isSelf;
    private boolean isVip;
    private boolean isSuit;
    private Integer shopFlag;
    private String proTitle;
    private String adver;
    private String currentPrice;
    private String originalPrice;
    private String commentRate;
    private String promotInfo;
    private String proImgUrl;
    private String countryId;
    private String country;
    private Integer[] promotType;
    private boolean isSku;

    public boolean getIsSku() {
        return isSku;
    }

    public void setIsSku(boolean sku) {
        isSku = sku;
    }

    public String getGomeSku() {
        return gomeSku;
    }

    public void setGomeSku(String gomeSku) {
        this.gomeSku = gomeSku;
    }

    public String getSpu() {
        return spu;
    }

    public void setSpu(String spu) {
        this.spu = spu;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public boolean getIsStock() {
        return isStock;
    }

    public void setIsStock(boolean isStock) {
        this.isStock = isStock;
    }

    public boolean getIsSelf() {
        return isSelf;
    }

    public void setIsSelf(boolean isSelf) {
        this.isSelf = isSelf;
    }

    public boolean getIsVip() {
        return isVip;
    }

    public void setIsVip(boolean isVip) {
        this.isVip = isVip;
    }

    public String getProTitle() {
        return proTitle;
    }

    public void setProTitle(String proTitle) {
        this.proTitle = proTitle;
    }

    public String getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(String currentPrice) {
        this.currentPrice = currentPrice;
    }

    public String getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(String originalPrice) {
        this.originalPrice = originalPrice;
    }

    public String getCommentRate() {
        return commentRate;
    }

    public void setCommentRate(String commentRate) {
        this.commentRate = commentRate;
    }

    public String getProImgUrl() {
        return proImgUrl;
    }

    public void setProImgUrl(String proImgUrl) {
        this.proImgUrl = proImgUrl;
    }

    public Integer[] getPromotType() {
        return promotType;
    }

    public void setPromotType(Integer[] promotType) {
        this.promotType = promotType;
    }

    public String getPromotInfo() {
        return promotInfo;
    }

    public void setPromotInfo(String promotInfo) {
        this.promotInfo = promotInfo;
    }

    public boolean getIsSuit() {
        return isSuit;
    }

    public void setIsSuit(boolean isSuit) {
        this.isSuit = isSuit;
    }

    public Integer getShopFlag() {
        return shopFlag;
    }

    public void setShopFlag(Integer shopFlag) {
        this.shopFlag = shopFlag;
    }

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAdver() {
        return adver;
    }

    public void setAdver(String adver) {
        this.adver = adver;
    }
}
