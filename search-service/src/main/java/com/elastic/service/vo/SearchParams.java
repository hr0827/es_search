package com.elastic.service.vo;

public class SearchParams {

    private String keyword;

    private String[] catFirst;

    private String[] catSecond;

    private String[] catThird;

    private String[] fgCatFirst;

    private String[] fgCatSecond;

    private String[] fgCatThird;

    private String[] whiteShopIds;

    private String[] blackShopIds;

    private String[] whiteCateIds;

    private String[] blackCateIds;

    private String[] whiteBrandIds;

    private String[] blackBrandIds;

    private String[] whiteProdIds;

    private String[] blackProdIds;

    private Integer[] brand;

    private Integer[] country;

    private  String[] activityIds;

    public String[] getActivityIds() {
        return activityIds;
    }

    public void setActivityIds(String[] activityIds) {
        this.activityIds = activityIds;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String[] getCatFirst() {
        return catFirst;
    }

    public void setCatFirst(String[] catFirst) {
        this.catFirst = catFirst;
    }

    public String[] getCatSecond() {
        return catSecond;
    }

    public void setCatSecond(String[] catSecond) {
        this.catSecond = catSecond;
    }

    public String[] getCatThird() {
        return catThird;
    }

    public void setCatThird(String[] catThird) {
        this.catThird = catThird;
    }

    public Integer[] getBrand() {
        return brand;
    }

    public void setBrand(Integer[] brand) {
        this.brand = brand;
    }

    public Integer[] getCountry() {
        return country;
    }

    public void setCountry(Integer[] country) {
        this.country = country;
    }

    public String[] getFgCatFirst() {
        return fgCatFirst;
    }

    public void setFgCatFirst(String[] fgCatFirst) {
        this.fgCatFirst = fgCatFirst;
    }

    public String[] getFgCatSecond() {
        return fgCatSecond;
    }

    public void setFgCatSecond(String[] fgCatSecond) {
        this.fgCatSecond = fgCatSecond;
    }

    public String[] getFgCatThird() {
        return fgCatThird;
    }

    public void setFgCatThird(String[] fgCatThird) {
        this.fgCatThird = fgCatThird;
    }

    public String[] getWhiteShopIds() {
        return whiteShopIds;
    }

    public void setWhiteShopIds(String[] whiteShopIds) {
        this.whiteShopIds = whiteShopIds;
    }

    public String[] getBlackShopIds() {
        return blackShopIds;
    }

    public void setBlackShopIds(String[] blackShopIds) {
        this.blackShopIds = blackShopIds;
    }

    public String[] getWhiteCateIds() {
        return whiteCateIds;
    }

    public void setWhiteCateIds(String[] whiteCateIds) {
        this.whiteCateIds = whiteCateIds;
    }

    public String[] getBlackCateIds() {
        return blackCateIds;
    }

    public void setBlackCateIds(String[] blackCateIds) {
        this.blackCateIds = blackCateIds;
    }

    public String[] getWhiteBrandIds() {
        return whiteBrandIds;
    }

    public void setWhiteBrandIds(String[] whiteBrandIds) {
        this.whiteBrandIds = whiteBrandIds;
    }

    public String[] getBlackBrandIds() {
        return blackBrandIds;
    }

    public void setBlackBrandIds(String[] blackBrandIds) {
        this.blackBrandIds = blackBrandIds;
    }

    public String[] getWhiteProdIds() {
        return whiteProdIds;
    }

    public void setWhiteProdIds(String[] whiteProdIds) {
        this.whiteProdIds = whiteProdIds;
    }

    public String[] getBlackProdIds() {
        return blackProdIds;
    }

    public void setBlackProdIds(String[] blackProdIds) {
        this.blackProdIds = blackProdIds;
    }
}
