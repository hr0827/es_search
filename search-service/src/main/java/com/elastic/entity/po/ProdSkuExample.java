package com.elastic.entity.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProdSkuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int count = -1;

    public ProdSkuExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimitStart(int limitStart) {
        this.limitStart=limitStart;
    }

    public int getLimitStart() {
        return limitStart;
    }

    public void setCount(int count) {
        this.count=count;
    }

    public int getCount() {
        return count;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andSkuIdIsNull() {
            addCriterion("sku_id is null");
            return (Criteria) this;
        }

        public Criteria andSkuIdIsNotNull() {
            addCriterion("sku_id is not null");
            return (Criteria) this;
        }

        public Criteria andSkuIdEqualTo(String value) {
            addCriterion("sku_id =", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotEqualTo(String value) {
            addCriterion("sku_id <>", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThan(String value) {
            addCriterion("sku_id >", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThanOrEqualTo(String value) {
            addCriterion("sku_id >=", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThan(String value) {
            addCriterion("sku_id <", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThanOrEqualTo(String value) {
            addCriterion("sku_id <=", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLike(String value) {
            addCriterion("sku_id like", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotLike(String value) {
            addCriterion("sku_id not like", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdIn(List<String> values) {
            addCriterion("sku_id in", values, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotIn(List<String> values) {
            addCriterion("sku_id not in", values, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdBetween(String value1, String value2) {
            addCriterion("sku_id between", value1, value2, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotBetween(String value1, String value2) {
            addCriterion("sku_id not between", value1, value2, "skuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdIsNull() {
            addCriterion("spu_id is null");
            return (Criteria) this;
        }

        public Criteria andSpuIdIsNotNull() {
            addCriterion("spu_id is not null");
            return (Criteria) this;
        }

        public Criteria andSpuIdEqualTo(String value) {
            addCriterion("spu_id =", value, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdNotEqualTo(String value) {
            addCriterion("spu_id <>", value, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdGreaterThan(String value) {
            addCriterion("spu_id >", value, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdGreaterThanOrEqualTo(String value) {
            addCriterion("spu_id >=", value, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdLessThan(String value) {
            addCriterion("spu_id <", value, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdLessThanOrEqualTo(String value) {
            addCriterion("spu_id <=", value, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdLike(String value) {
            addCriterion("spu_id like", value, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdNotLike(String value) {
            addCriterion("spu_id not like", value, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdIn(List<String> values) {
            addCriterion("spu_id in", values, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdNotIn(List<String> values) {
            addCriterion("spu_id not in", values, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdBetween(String value1, String value2) {
            addCriterion("spu_id between", value1, value2, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdNotBetween(String value1, String value2) {
            addCriterion("spu_id not between", value1, value2, "spuId");
            return (Criteria) this;
        }

        public Criteria andGomeSkuidIsNull() {
            addCriterion("gome_skuid is null");
            return (Criteria) this;
        }

        public Criteria andGomeSkuidIsNotNull() {
            addCriterion("gome_skuid is not null");
            return (Criteria) this;
        }

        public Criteria andGomeSkuidEqualTo(String value) {
            addCriterion("gome_skuid =", value, "gomeSkuid");
            return (Criteria) this;
        }

        public Criteria andGomeSkuidNotEqualTo(String value) {
            addCriterion("gome_skuid <>", value, "gomeSkuid");
            return (Criteria) this;
        }

        public Criteria andGomeSkuidGreaterThan(String value) {
            addCriterion("gome_skuid >", value, "gomeSkuid");
            return (Criteria) this;
        }

        public Criteria andGomeSkuidGreaterThanOrEqualTo(String value) {
            addCriterion("gome_skuid >=", value, "gomeSkuid");
            return (Criteria) this;
        }

        public Criteria andGomeSkuidLessThan(String value) {
            addCriterion("gome_skuid <", value, "gomeSkuid");
            return (Criteria) this;
        }

        public Criteria andGomeSkuidLessThanOrEqualTo(String value) {
            addCriterion("gome_skuid <=", value, "gomeSkuid");
            return (Criteria) this;
        }

        public Criteria andGomeSkuidLike(String value) {
            addCriterion("gome_skuid like", value, "gomeSkuid");
            return (Criteria) this;
        }

        public Criteria andGomeSkuidNotLike(String value) {
            addCriterion("gome_skuid not like", value, "gomeSkuid");
            return (Criteria) this;
        }

        public Criteria andGomeSkuidIn(List<String> values) {
            addCriterion("gome_skuid in", values, "gomeSkuid");
            return (Criteria) this;
        }

        public Criteria andGomeSkuidNotIn(List<String> values) {
            addCriterion("gome_skuid not in", values, "gomeSkuid");
            return (Criteria) this;
        }

        public Criteria andGomeSkuidBetween(String value1, String value2) {
            addCriterion("gome_skuid between", value1, value2, "gomeSkuid");
            return (Criteria) this;
        }

        public Criteria andGomeSkuidNotBetween(String value1, String value2) {
            addCriterion("gome_skuid not between", value1, value2, "gomeSkuid");
            return (Criteria) this;
        }

        public Criteria andSkuNameIsNull() {
            addCriterion("sku_name is null");
            return (Criteria) this;
        }

        public Criteria andSkuNameIsNotNull() {
            addCriterion("sku_name is not null");
            return (Criteria) this;
        }

        public Criteria andSkuNameEqualTo(String value) {
            addCriterion("sku_name =", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameNotEqualTo(String value) {
            addCriterion("sku_name <>", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameGreaterThan(String value) {
            addCriterion("sku_name >", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameGreaterThanOrEqualTo(String value) {
            addCriterion("sku_name >=", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameLessThan(String value) {
            addCriterion("sku_name <", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameLessThanOrEqualTo(String value) {
            addCriterion("sku_name <=", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameLike(String value) {
            addCriterion("sku_name like", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameNotLike(String value) {
            addCriterion("sku_name not like", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameIn(List<String> values) {
            addCriterion("sku_name in", values, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameNotIn(List<String> values) {
            addCriterion("sku_name not in", values, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameBetween(String value1, String value2) {
            addCriterion("sku_name between", value1, value2, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameNotBetween(String value1, String value2) {
            addCriterion("sku_name not between", value1, value2, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuStatusIsNull() {
            addCriterion("sku_status is null");
            return (Criteria) this;
        }

        public Criteria andSkuStatusIsNotNull() {
            addCriterion("sku_status is not null");
            return (Criteria) this;
        }

        public Criteria andSkuStatusEqualTo(Integer value) {
            addCriterion("sku_status =", value, "skuStatus");
            return (Criteria) this;
        }

        public Criteria andSkuStatusNotEqualTo(Integer value) {
            addCriterion("sku_status <>", value, "skuStatus");
            return (Criteria) this;
        }

        public Criteria andSkuStatusGreaterThan(Integer value) {
            addCriterion("sku_status >", value, "skuStatus");
            return (Criteria) this;
        }

        public Criteria andSkuStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("sku_status >=", value, "skuStatus");
            return (Criteria) this;
        }

        public Criteria andSkuStatusLessThan(Integer value) {
            addCriterion("sku_status <", value, "skuStatus");
            return (Criteria) this;
        }

        public Criteria andSkuStatusLessThanOrEqualTo(Integer value) {
            addCriterion("sku_status <=", value, "skuStatus");
            return (Criteria) this;
        }

        public Criteria andSkuStatusIn(List<Integer> values) {
            addCriterion("sku_status in", values, "skuStatus");
            return (Criteria) this;
        }

        public Criteria andSkuStatusNotIn(List<Integer> values) {
            addCriterion("sku_status not in", values, "skuStatus");
            return (Criteria) this;
        }

        public Criteria andSkuStatusBetween(Integer value1, Integer value2) {
            addCriterion("sku_status between", value1, value2, "skuStatus");
            return (Criteria) this;
        }

        public Criteria andSkuStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("sku_status not between", value1, value2, "skuStatus");
            return (Criteria) this;
        }

        public Criteria andSkuStatusNameIsNull() {
            addCriterion("sku_status_name is null");
            return (Criteria) this;
        }

        public Criteria andSkuStatusNameIsNotNull() {
            addCriterion("sku_status_name is not null");
            return (Criteria) this;
        }

        public Criteria andSkuStatusNameEqualTo(String value) {
            addCriterion("sku_status_name =", value, "skuStatusName");
            return (Criteria) this;
        }

        public Criteria andSkuStatusNameNotEqualTo(String value) {
            addCriterion("sku_status_name <>", value, "skuStatusName");
            return (Criteria) this;
        }

        public Criteria andSkuStatusNameGreaterThan(String value) {
            addCriterion("sku_status_name >", value, "skuStatusName");
            return (Criteria) this;
        }

        public Criteria andSkuStatusNameGreaterThanOrEqualTo(String value) {
            addCriterion("sku_status_name >=", value, "skuStatusName");
            return (Criteria) this;
        }

        public Criteria andSkuStatusNameLessThan(String value) {
            addCriterion("sku_status_name <", value, "skuStatusName");
            return (Criteria) this;
        }

        public Criteria andSkuStatusNameLessThanOrEqualTo(String value) {
            addCriterion("sku_status_name <=", value, "skuStatusName");
            return (Criteria) this;
        }

        public Criteria andSkuStatusNameLike(String value) {
            addCriterion("sku_status_name like", value, "skuStatusName");
            return (Criteria) this;
        }

        public Criteria andSkuStatusNameNotLike(String value) {
            addCriterion("sku_status_name not like", value, "skuStatusName");
            return (Criteria) this;
        }

        public Criteria andSkuStatusNameIn(List<String> values) {
            addCriterion("sku_status_name in", values, "skuStatusName");
            return (Criteria) this;
        }

        public Criteria andSkuStatusNameNotIn(List<String> values) {
            addCriterion("sku_status_name not in", values, "skuStatusName");
            return (Criteria) this;
        }

        public Criteria andSkuStatusNameBetween(String value1, String value2) {
            addCriterion("sku_status_name between", value1, value2, "skuStatusName");
            return (Criteria) this;
        }

        public Criteria andSkuStatusNameNotBetween(String value1, String value2) {
            addCriterion("sku_status_name not between", value1, value2, "skuStatusName");
            return (Criteria) this;
        }

        public Criteria andDefaultStateIsNull() {
            addCriterion("default_state is null");
            return (Criteria) this;
        }

        public Criteria andDefaultStateIsNotNull() {
            addCriterion("default_state is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultStateEqualTo(String value) {
            addCriterion("default_state =", value, "defaultState");
            return (Criteria) this;
        }

        public Criteria andDefaultStateNotEqualTo(String value) {
            addCriterion("default_state <>", value, "defaultState");
            return (Criteria) this;
        }

        public Criteria andDefaultStateGreaterThan(String value) {
            addCriterion("default_state >", value, "defaultState");
            return (Criteria) this;
        }

        public Criteria andDefaultStateGreaterThanOrEqualTo(String value) {
            addCriterion("default_state >=", value, "defaultState");
            return (Criteria) this;
        }

        public Criteria andDefaultStateLessThan(String value) {
            addCriterion("default_state <", value, "defaultState");
            return (Criteria) this;
        }

        public Criteria andDefaultStateLessThanOrEqualTo(String value) {
            addCriterion("default_state <=", value, "defaultState");
            return (Criteria) this;
        }

        public Criteria andDefaultStateLike(String value) {
            addCriterion("default_state like", value, "defaultState");
            return (Criteria) this;
        }

        public Criteria andDefaultStateNotLike(String value) {
            addCriterion("default_state not like", value, "defaultState");
            return (Criteria) this;
        }

        public Criteria andDefaultStateIn(List<String> values) {
            addCriterion("default_state in", values, "defaultState");
            return (Criteria) this;
        }

        public Criteria andDefaultStateNotIn(List<String> values) {
            addCriterion("default_state not in", values, "defaultState");
            return (Criteria) this;
        }

        public Criteria andDefaultStateBetween(String value1, String value2) {
            addCriterion("default_state between", value1, value2, "defaultState");
            return (Criteria) this;
        }

        public Criteria andDefaultStateNotBetween(String value1, String value2) {
            addCriterion("default_state not between", value1, value2, "defaultState");
            return (Criteria) this;
        }

        public Criteria andSkuSortIsNull() {
            addCriterion("sku_sort is null");
            return (Criteria) this;
        }

        public Criteria andSkuSortIsNotNull() {
            addCriterion("sku_sort is not null");
            return (Criteria) this;
        }

        public Criteria andSkuSortEqualTo(Integer value) {
            addCriterion("sku_sort =", value, "skuSort");
            return (Criteria) this;
        }

        public Criteria andSkuSortNotEqualTo(Integer value) {
            addCriterion("sku_sort <>", value, "skuSort");
            return (Criteria) this;
        }

        public Criteria andSkuSortGreaterThan(Integer value) {
            addCriterion("sku_sort >", value, "skuSort");
            return (Criteria) this;
        }

        public Criteria andSkuSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sku_sort >=", value, "skuSort");
            return (Criteria) this;
        }

        public Criteria andSkuSortLessThan(Integer value) {
            addCriterion("sku_sort <", value, "skuSort");
            return (Criteria) this;
        }

        public Criteria andSkuSortLessThanOrEqualTo(Integer value) {
            addCriterion("sku_sort <=", value, "skuSort");
            return (Criteria) this;
        }

        public Criteria andSkuSortIn(List<Integer> values) {
            addCriterion("sku_sort in", values, "skuSort");
            return (Criteria) this;
        }

        public Criteria andSkuSortNotIn(List<Integer> values) {
            addCriterion("sku_sort not in", values, "skuSort");
            return (Criteria) this;
        }

        public Criteria andSkuSortBetween(Integer value1, Integer value2) {
            addCriterion("sku_sort between", value1, value2, "skuSort");
            return (Criteria) this;
        }

        public Criteria andSkuSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sku_sort not between", value1, value2, "skuSort");
            return (Criteria) this;
        }

        public Criteria andShowBrowseNumberIsNull() {
            addCriterion("show_browse_number is null");
            return (Criteria) this;
        }

        public Criteria andShowBrowseNumberIsNotNull() {
            addCriterion("show_browse_number is not null");
            return (Criteria) this;
        }

        public Criteria andShowBrowseNumberEqualTo(Integer value) {
            addCriterion("show_browse_number =", value, "showBrowseNumber");
            return (Criteria) this;
        }

        public Criteria andShowBrowseNumberNotEqualTo(Integer value) {
            addCriterion("show_browse_number <>", value, "showBrowseNumber");
            return (Criteria) this;
        }

        public Criteria andShowBrowseNumberGreaterThan(Integer value) {
            addCriterion("show_browse_number >", value, "showBrowseNumber");
            return (Criteria) this;
        }

        public Criteria andShowBrowseNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("show_browse_number >=", value, "showBrowseNumber");
            return (Criteria) this;
        }

        public Criteria andShowBrowseNumberLessThan(Integer value) {
            addCriterion("show_browse_number <", value, "showBrowseNumber");
            return (Criteria) this;
        }

        public Criteria andShowBrowseNumberLessThanOrEqualTo(Integer value) {
            addCriterion("show_browse_number <=", value, "showBrowseNumber");
            return (Criteria) this;
        }

        public Criteria andShowBrowseNumberIn(List<Integer> values) {
            addCriterion("show_browse_number in", values, "showBrowseNumber");
            return (Criteria) this;
        }

        public Criteria andShowBrowseNumberNotIn(List<Integer> values) {
            addCriterion("show_browse_number not in", values, "showBrowseNumber");
            return (Criteria) this;
        }

        public Criteria andShowBrowseNumberBetween(Integer value1, Integer value2) {
            addCriterion("show_browse_number between", value1, value2, "showBrowseNumber");
            return (Criteria) this;
        }

        public Criteria andShowBrowseNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("show_browse_number not between", value1, value2, "showBrowseNumber");
            return (Criteria) this;
        }

        public Criteria andBrowseNumberIsNull() {
            addCriterion("browse_number is null");
            return (Criteria) this;
        }

        public Criteria andBrowseNumberIsNotNull() {
            addCriterion("browse_number is not null");
            return (Criteria) this;
        }

        public Criteria andBrowseNumberEqualTo(Integer value) {
            addCriterion("browse_number =", value, "browseNumber");
            return (Criteria) this;
        }

        public Criteria andBrowseNumberNotEqualTo(Integer value) {
            addCriterion("browse_number <>", value, "browseNumber");
            return (Criteria) this;
        }

        public Criteria andBrowseNumberGreaterThan(Integer value) {
            addCriterion("browse_number >", value, "browseNumber");
            return (Criteria) this;
        }

        public Criteria andBrowseNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("browse_number >=", value, "browseNumber");
            return (Criteria) this;
        }

        public Criteria andBrowseNumberLessThan(Integer value) {
            addCriterion("browse_number <", value, "browseNumber");
            return (Criteria) this;
        }

        public Criteria andBrowseNumberLessThanOrEqualTo(Integer value) {
            addCriterion("browse_number <=", value, "browseNumber");
            return (Criteria) this;
        }

        public Criteria andBrowseNumberIn(List<Integer> values) {
            addCriterion("browse_number in", values, "browseNumber");
            return (Criteria) this;
        }

        public Criteria andBrowseNumberNotIn(List<Integer> values) {
            addCriterion("browse_number not in", values, "browseNumber");
            return (Criteria) this;
        }

        public Criteria andBrowseNumberBetween(Integer value1, Integer value2) {
            addCriterion("browse_number between", value1, value2, "browseNumber");
            return (Criteria) this;
        }

        public Criteria andBrowseNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("browse_number not between", value1, value2, "browseNumber");
            return (Criteria) this;
        }

        public Criteria andShowCollectionNumberIsNull() {
            addCriterion("show_collection_number is null");
            return (Criteria) this;
        }

        public Criteria andShowCollectionNumberIsNotNull() {
            addCriterion("show_collection_number is not null");
            return (Criteria) this;
        }

        public Criteria andShowCollectionNumberEqualTo(Integer value) {
            addCriterion("show_collection_number =", value, "showCollectionNumber");
            return (Criteria) this;
        }

        public Criteria andShowCollectionNumberNotEqualTo(Integer value) {
            addCriterion("show_collection_number <>", value, "showCollectionNumber");
            return (Criteria) this;
        }

        public Criteria andShowCollectionNumberGreaterThan(Integer value) {
            addCriterion("show_collection_number >", value, "showCollectionNumber");
            return (Criteria) this;
        }

        public Criteria andShowCollectionNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("show_collection_number >=", value, "showCollectionNumber");
            return (Criteria) this;
        }

        public Criteria andShowCollectionNumberLessThan(Integer value) {
            addCriterion("show_collection_number <", value, "showCollectionNumber");
            return (Criteria) this;
        }

        public Criteria andShowCollectionNumberLessThanOrEqualTo(Integer value) {
            addCriterion("show_collection_number <=", value, "showCollectionNumber");
            return (Criteria) this;
        }

        public Criteria andShowCollectionNumberIn(List<Integer> values) {
            addCriterion("show_collection_number in", values, "showCollectionNumber");
            return (Criteria) this;
        }

        public Criteria andShowCollectionNumberNotIn(List<Integer> values) {
            addCriterion("show_collection_number not in", values, "showCollectionNumber");
            return (Criteria) this;
        }

        public Criteria andShowCollectionNumberBetween(Integer value1, Integer value2) {
            addCriterion("show_collection_number between", value1, value2, "showCollectionNumber");
            return (Criteria) this;
        }

        public Criteria andShowCollectionNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("show_collection_number not between", value1, value2, "showCollectionNumber");
            return (Criteria) this;
        }

        public Criteria andCollectionNumberIsNull() {
            addCriterion("collection_number is null");
            return (Criteria) this;
        }

        public Criteria andCollectionNumberIsNotNull() {
            addCriterion("collection_number is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionNumberEqualTo(Integer value) {
            addCriterion("collection_number =", value, "collectionNumber");
            return (Criteria) this;
        }

        public Criteria andCollectionNumberNotEqualTo(Integer value) {
            addCriterion("collection_number <>", value, "collectionNumber");
            return (Criteria) this;
        }

        public Criteria andCollectionNumberGreaterThan(Integer value) {
            addCriterion("collection_number >", value, "collectionNumber");
            return (Criteria) this;
        }

        public Criteria andCollectionNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("collection_number >=", value, "collectionNumber");
            return (Criteria) this;
        }

        public Criteria andCollectionNumberLessThan(Integer value) {
            addCriterion("collection_number <", value, "collectionNumber");
            return (Criteria) this;
        }

        public Criteria andCollectionNumberLessThanOrEqualTo(Integer value) {
            addCriterion("collection_number <=", value, "collectionNumber");
            return (Criteria) this;
        }

        public Criteria andCollectionNumberIn(List<Integer> values) {
            addCriterion("collection_number in", values, "collectionNumber");
            return (Criteria) this;
        }

        public Criteria andCollectionNumberNotIn(List<Integer> values) {
            addCriterion("collection_number not in", values, "collectionNumber");
            return (Criteria) this;
        }

        public Criteria andCollectionNumberBetween(Integer value1, Integer value2) {
            addCriterion("collection_number between", value1, value2, "collectionNumber");
            return (Criteria) this;
        }

        public Criteria andCollectionNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("collection_number not between", value1, value2, "collectionNumber");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("creator like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("creator not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("creator not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andModifyIsNull() {
            addCriterion("modify is null");
            return (Criteria) this;
        }

        public Criteria andModifyIsNotNull() {
            addCriterion("modify is not null");
            return (Criteria) this;
        }

        public Criteria andModifyEqualTo(String value) {
            addCriterion("modify =", value, "modify");
            return (Criteria) this;
        }

        public Criteria andModifyNotEqualTo(String value) {
            addCriterion("modify <>", value, "modify");
            return (Criteria) this;
        }

        public Criteria andModifyGreaterThan(String value) {
            addCriterion("modify >", value, "modify");
            return (Criteria) this;
        }

        public Criteria andModifyGreaterThanOrEqualTo(String value) {
            addCriterion("modify >=", value, "modify");
            return (Criteria) this;
        }

        public Criteria andModifyLessThan(String value) {
            addCriterion("modify <", value, "modify");
            return (Criteria) this;
        }

        public Criteria andModifyLessThanOrEqualTo(String value) {
            addCriterion("modify <=", value, "modify");
            return (Criteria) this;
        }

        public Criteria andModifyLike(String value) {
            addCriterion("modify like", value, "modify");
            return (Criteria) this;
        }

        public Criteria andModifyNotLike(String value) {
            addCriterion("modify not like", value, "modify");
            return (Criteria) this;
        }

        public Criteria andModifyIn(List<String> values) {
            addCriterion("modify in", values, "modify");
            return (Criteria) this;
        }

        public Criteria andModifyNotIn(List<String> values) {
            addCriterion("modify not in", values, "modify");
            return (Criteria) this;
        }

        public Criteria andModifyBetween(String value1, String value2) {
            addCriterion("modify between", value1, value2, "modify");
            return (Criteria) this;
        }

        public Criteria andModifyNotBetween(String value1, String value2) {
            addCriterion("modify not between", value1, value2, "modify");
            return (Criteria) this;
        }

        public Criteria andModifyDateIsNull() {
            addCriterion("modify_date is null");
            return (Criteria) this;
        }

        public Criteria andModifyDateIsNotNull() {
            addCriterion("modify_date is not null");
            return (Criteria) this;
        }

        public Criteria andModifyDateEqualTo(Date value) {
            addCriterion("modify_date =", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotEqualTo(Date value) {
            addCriterion("modify_date <>", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateGreaterThan(Date value) {
            addCriterion("modify_date >", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_date >=", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateLessThan(Date value) {
            addCriterion("modify_date <", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateLessThanOrEqualTo(Date value) {
            addCriterion("modify_date <=", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateIn(List<Date> values) {
            addCriterion("modify_date in", values, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotIn(List<Date> values) {
            addCriterion("modify_date not in", values, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateBetween(Date value1, Date value2) {
            addCriterion("modify_date between", value1, value2, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotBetween(Date value1, Date value2) {
            addCriterion("modify_date not between", value1, value2, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNull() {
            addCriterion("del_flag is null");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNotNull() {
            addCriterion("del_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDelFlagEqualTo(String value) {
            addCriterion("del_flag =", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotEqualTo(String value) {
            addCriterion("del_flag <>", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThan(String value) {
            addCriterion("del_flag >", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThanOrEqualTo(String value) {
            addCriterion("del_flag >=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThan(String value) {
            addCriterion("del_flag <", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThanOrEqualTo(String value) {
            addCriterion("del_flag <=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLike(String value) {
            addCriterion("del_flag like", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotLike(String value) {
            addCriterion("del_flag not like", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagIn(List<String> values) {
            addCriterion("del_flag in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotIn(List<String> values) {
            addCriterion("del_flag not in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagBetween(String value1, String value2) {
            addCriterion("del_flag between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotBetween(String value1, String value2) {
            addCriterion("del_flag not between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Long value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Long value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Long value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Long value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Long value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Long value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Long> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Long> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Long value1, Long value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Long value1, Long value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}