package com.elastic.entity;


import java.util.Date;
import java.util.Map;

public class GomehigoIndex {


    private String id;
    private String category_first_id;
    private String category_first;
    private String category_second_id;
    private String category_second;
    private String category_third_id;
    private String category_third;
    private Integer brand_id;
    private String brand;
    private String shop;
    private String shop_id;
    private String[] attr_name;
    private String sku;
    private String spu;
    private String gome_sku;
    private String product_ch;
    private String adver;
    private String product_img;
    private double product_proto_price;
    private double product_sale_price;
    private boolean is_sku;
    private boolean is_self;
    private long shop_flag;
    private boolean is_in_store;
    private boolean is_shelves;
    private boolean is_suit;
    private double good_comment_rate;
    private double sale_num;
    private double spu_score;
    private Date create_time;
    private Map<String,Object> dynamicFields;

    public Map<String, Object> getDynamicFields() {
        return dynamicFields;
    }

    public void setDynamicFields(Map<String, Object> dynamicFields) {
        this.dynamicFields = dynamicFields;
    }

    public String getShop_id() {
        return shop_id;
    }

    public void setShop_id(String shop_id) {
        this.shop_id = shop_id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategory_first_id() {
        return category_first_id;
    }

    public void setCategory_first_id(String category_first_id) {
        this.category_first_id = category_first_id;
    }

    public String getCategory_first() {
        return category_first;
    }

    public void setCategory_first(String category_first) {
        this.category_first = category_first;
    }

    public String getCategory_second_id() {
        return category_second_id;
    }

    public void setCategory_second_id(String category_second_id) {
        this.category_second_id = category_second_id;
    }

    public String getCategory_second() {
        return category_second;
    }

    public void setCategory_second(String category_second) {
        this.category_second = category_second;
    }

    public String getCategory_third_id() {
        return category_third_id;
    }

    public void setCategory_third_id(String category_third_id) {
        this.category_third_id = category_third_id;
    }

    public String getCategory_third() {
        return category_third;
    }

    public void setCategory_third(String category_third) {
        this.category_third = category_third;
    }

    public Integer getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(Integer brand_id) {
        this.brand_id = brand_id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }

    public String[] getAttr_name() {
        return attr_name;
    }

    public void setAttr_name(String[] attr_name) {
        this.attr_name = attr_name;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getSpu() {
        return spu;
    }

    public void setSpu(String spu) {
        this.spu = spu;
    }

    public String getGome_sku() {
        return gome_sku;
    }

    public void setGome_sku(String gome_sku) {
        this.gome_sku = gome_sku;
    }

    public String getProduct_ch() {
        return product_ch;
    }

    public void setProduct_ch(String product_ch) {
        this.product_ch = product_ch;
    }

    public String getAdver() {
        return adver;
    }

    public void setAdver(String adver) {
        this.adver = adver;
    }

    public String getProduct_img() {
        return product_img;
    }

    public void setProduct_img(String product_img) {
        this.product_img = product_img;
    }

    public double getProduct_proto_price() {
        return product_proto_price;
    }

    public void setProduct_proto_price(double product_proto_price) {
        this.product_proto_price = product_proto_price;
    }

    public double getProduct_sale_price() {
        return product_sale_price;
    }

    public void setProduct_sale_price(double product_sale_price) {
        this.product_sale_price = product_sale_price;
    }

    public boolean isIs_sku() {
        return is_sku;
    }

    public void setIs_sku(boolean is_sku) {
        this.is_sku = is_sku;
    }

    public boolean isIs_self() {
        return is_self;
    }

    public void setIs_self(boolean is_self) {
        this.is_self = is_self;
    }

    public long getShop_flag() {
        return shop_flag;
    }

    public void setShop_flag(long shop_flag) {
        this.shop_flag = shop_flag;
    }

    public boolean isIs_in_store() {
        return is_in_store;
    }

    public void setIs_in_store(boolean is_in_store) {
        this.is_in_store = is_in_store;
    }

    public boolean isIs_shelves() {
        return is_shelves;
    }

    public void setIs_shelves(boolean is_shelves) {
        this.is_shelves = is_shelves;
    }

    public boolean isIs_suit() {
        return is_suit;
    }

    public void setIs_suit(boolean is_suit) {
        this.is_suit = is_suit;
    }

    public double getGood_comment_rate() {
        return good_comment_rate;
    }

    public void setGood_comment_rate(double good_comment_rate) {
        this.good_comment_rate = good_comment_rate;
    }

    public double getSale_num() {
        return sale_num;
    }

    public void setSale_num(double sale_num) {
        this.sale_num = sale_num;
    }

    public double getSpu_score() {
        return spu_score;
    }

    public void setSpu_score(double spu_score) {
        this.spu_score = spu_score;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }
}
