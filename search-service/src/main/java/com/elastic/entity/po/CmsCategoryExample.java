package com.elastic.entity.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CmsCategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int count = -1;

    public CmsCategoryExample() {
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

        public Criteria andCmsCateIdIsNull() {
            addCriterion("cms_cate_id is null");
            return (Criteria) this;
        }

        public Criteria andCmsCateIdIsNotNull() {
            addCriterion("cms_cate_id is not null");
            return (Criteria) this;
        }

        public Criteria andCmsCateIdEqualTo(Integer value) {
            addCriterion("cms_cate_id =", value, "cmsCateId");
            return (Criteria) this;
        }

        public Criteria andCmsCateIdNotEqualTo(Integer value) {
            addCriterion("cms_cate_id <>", value, "cmsCateId");
            return (Criteria) this;
        }

        public Criteria andCmsCateIdGreaterThan(Integer value) {
            addCriterion("cms_cate_id >", value, "cmsCateId");
            return (Criteria) this;
        }

        public Criteria andCmsCateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cms_cate_id >=", value, "cmsCateId");
            return (Criteria) this;
        }

        public Criteria andCmsCateIdLessThan(Integer value) {
            addCriterion("cms_cate_id <", value, "cmsCateId");
            return (Criteria) this;
        }

        public Criteria andCmsCateIdLessThanOrEqualTo(Integer value) {
            addCriterion("cms_cate_id <=", value, "cmsCateId");
            return (Criteria) this;
        }

        public Criteria andCmsCateIdIn(List<Integer> values) {
            addCriterion("cms_cate_id in", values, "cmsCateId");
            return (Criteria) this;
        }

        public Criteria andCmsCateIdNotIn(List<Integer> values) {
            addCriterion("cms_cate_id not in", values, "cmsCateId");
            return (Criteria) this;
        }

        public Criteria andCmsCateIdBetween(Integer value1, Integer value2) {
            addCriterion("cms_cate_id between", value1, value2, "cmsCateId");
            return (Criteria) this;
        }

        public Criteria andCmsCateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cms_cate_id not between", value1, value2, "cmsCateId");
            return (Criteria) this;
        }

        public Criteria andCmsCategoryPagekeyIsNull() {
            addCriterion("cms_category_pagekey is null");
            return (Criteria) this;
        }

        public Criteria andCmsCategoryPagekeyIsNotNull() {
            addCriterion("cms_category_pagekey is not null");
            return (Criteria) this;
        }

        public Criteria andCmsCategoryPagekeyEqualTo(String value) {
            addCriterion("cms_category_pagekey =", value, "cmsCategoryPagekey");
            return (Criteria) this;
        }

        public Criteria andCmsCategoryPagekeyNotEqualTo(String value) {
            addCriterion("cms_category_pagekey <>", value, "cmsCategoryPagekey");
            return (Criteria) this;
        }

        public Criteria andCmsCategoryPagekeyGreaterThan(String value) {
            addCriterion("cms_category_pagekey >", value, "cmsCategoryPagekey");
            return (Criteria) this;
        }

        public Criteria andCmsCategoryPagekeyGreaterThanOrEqualTo(String value) {
            addCriterion("cms_category_pagekey >=", value, "cmsCategoryPagekey");
            return (Criteria) this;
        }

        public Criteria andCmsCategoryPagekeyLessThan(String value) {
            addCriterion("cms_category_pagekey <", value, "cmsCategoryPagekey");
            return (Criteria) this;
        }

        public Criteria andCmsCategoryPagekeyLessThanOrEqualTo(String value) {
            addCriterion("cms_category_pagekey <=", value, "cmsCategoryPagekey");
            return (Criteria) this;
        }

        public Criteria andCmsCategoryPagekeyLike(String value) {
            addCriterion("cms_category_pagekey like", value, "cmsCategoryPagekey");
            return (Criteria) this;
        }

        public Criteria andCmsCategoryPagekeyNotLike(String value) {
            addCriterion("cms_category_pagekey not like", value, "cmsCategoryPagekey");
            return (Criteria) this;
        }

        public Criteria andCmsCategoryPagekeyIn(List<String> values) {
            addCriterion("cms_category_pagekey in", values, "cmsCategoryPagekey");
            return (Criteria) this;
        }

        public Criteria andCmsCategoryPagekeyNotIn(List<String> values) {
            addCriterion("cms_category_pagekey not in", values, "cmsCategoryPagekey");
            return (Criteria) this;
        }

        public Criteria andCmsCategoryPagekeyBetween(String value1, String value2) {
            addCriterion("cms_category_pagekey between", value1, value2, "cmsCategoryPagekey");
            return (Criteria) this;
        }

        public Criteria andCmsCategoryPagekeyNotBetween(String value1, String value2) {
            addCriterion("cms_category_pagekey not between", value1, value2, "cmsCategoryPagekey");
            return (Criteria) this;
        }

        public Criteria andCmsCateParentidIsNull() {
            addCriterion("cms_cate_parentid is null");
            return (Criteria) this;
        }

        public Criteria andCmsCateParentidIsNotNull() {
            addCriterion("cms_cate_parentid is not null");
            return (Criteria) this;
        }

        public Criteria andCmsCateParentidEqualTo(Integer value) {
            addCriterion("cms_cate_parentid =", value, "cmsCateParentid");
            return (Criteria) this;
        }

        public Criteria andCmsCateParentidNotEqualTo(Integer value) {
            addCriterion("cms_cate_parentid <>", value, "cmsCateParentid");
            return (Criteria) this;
        }

        public Criteria andCmsCateParentidGreaterThan(Integer value) {
            addCriterion("cms_cate_parentid >", value, "cmsCateParentid");
            return (Criteria) this;
        }

        public Criteria andCmsCateParentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cms_cate_parentid >=", value, "cmsCateParentid");
            return (Criteria) this;
        }

        public Criteria andCmsCateParentidLessThan(Integer value) {
            addCriterion("cms_cate_parentid <", value, "cmsCateParentid");
            return (Criteria) this;
        }

        public Criteria andCmsCateParentidLessThanOrEqualTo(Integer value) {
            addCriterion("cms_cate_parentid <=", value, "cmsCateParentid");
            return (Criteria) this;
        }

        public Criteria andCmsCateParentidIn(List<Integer> values) {
            addCriterion("cms_cate_parentid in", values, "cmsCateParentid");
            return (Criteria) this;
        }

        public Criteria andCmsCateParentidNotIn(List<Integer> values) {
            addCriterion("cms_cate_parentid not in", values, "cmsCateParentid");
            return (Criteria) this;
        }

        public Criteria andCmsCateParentidBetween(Integer value1, Integer value2) {
            addCriterion("cms_cate_parentid between", value1, value2, "cmsCateParentid");
            return (Criteria) this;
        }

        public Criteria andCmsCateParentidNotBetween(Integer value1, Integer value2) {
            addCriterion("cms_cate_parentid not between", value1, value2, "cmsCateParentid");
            return (Criteria) this;
        }

        public Criteria andCmsCateNameIsNull() {
            addCriterion("cms_cate_name is null");
            return (Criteria) this;
        }

        public Criteria andCmsCateNameIsNotNull() {
            addCriterion("cms_cate_name is not null");
            return (Criteria) this;
        }

        public Criteria andCmsCateNameEqualTo(String value) {
            addCriterion("cms_cate_name =", value, "cmsCateName");
            return (Criteria) this;
        }

        public Criteria andCmsCateNameNotEqualTo(String value) {
            addCriterion("cms_cate_name <>", value, "cmsCateName");
            return (Criteria) this;
        }

        public Criteria andCmsCateNameGreaterThan(String value) {
            addCriterion("cms_cate_name >", value, "cmsCateName");
            return (Criteria) this;
        }

        public Criteria andCmsCateNameGreaterThanOrEqualTo(String value) {
            addCriterion("cms_cate_name >=", value, "cmsCateName");
            return (Criteria) this;
        }

        public Criteria andCmsCateNameLessThan(String value) {
            addCriterion("cms_cate_name <", value, "cmsCateName");
            return (Criteria) this;
        }

        public Criteria andCmsCateNameLessThanOrEqualTo(String value) {
            addCriterion("cms_cate_name <=", value, "cmsCateName");
            return (Criteria) this;
        }

        public Criteria andCmsCateNameLike(String value) {
            addCriterion("cms_cate_name like", value, "cmsCateName");
            return (Criteria) this;
        }

        public Criteria andCmsCateNameNotLike(String value) {
            addCriterion("cms_cate_name not like", value, "cmsCateName");
            return (Criteria) this;
        }

        public Criteria andCmsCateNameIn(List<String> values) {
            addCriterion("cms_cate_name in", values, "cmsCateName");
            return (Criteria) this;
        }

        public Criteria andCmsCateNameNotIn(List<String> values) {
            addCriterion("cms_cate_name not in", values, "cmsCateName");
            return (Criteria) this;
        }

        public Criteria andCmsCateNameBetween(String value1, String value2) {
            addCriterion("cms_cate_name between", value1, value2, "cmsCateName");
            return (Criteria) this;
        }

        public Criteria andCmsCateNameNotBetween(String value1, String value2) {
            addCriterion("cms_cate_name not between", value1, value2, "cmsCateName");
            return (Criteria) this;
        }

        public Criteria andCmsCateLevelIsNull() {
            addCriterion("cms_cate_level is null");
            return (Criteria) this;
        }

        public Criteria andCmsCateLevelIsNotNull() {
            addCriterion("cms_cate_level is not null");
            return (Criteria) this;
        }

        public Criteria andCmsCateLevelEqualTo(Integer value) {
            addCriterion("cms_cate_level =", value, "cmsCateLevel");
            return (Criteria) this;
        }

        public Criteria andCmsCateLevelNotEqualTo(Integer value) {
            addCriterion("cms_cate_level <>", value, "cmsCateLevel");
            return (Criteria) this;
        }

        public Criteria andCmsCateLevelGreaterThan(Integer value) {
            addCriterion("cms_cate_level >", value, "cmsCateLevel");
            return (Criteria) this;
        }

        public Criteria andCmsCateLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("cms_cate_level >=", value, "cmsCateLevel");
            return (Criteria) this;
        }

        public Criteria andCmsCateLevelLessThan(Integer value) {
            addCriterion("cms_cate_level <", value, "cmsCateLevel");
            return (Criteria) this;
        }

        public Criteria andCmsCateLevelLessThanOrEqualTo(Integer value) {
            addCriterion("cms_cate_level <=", value, "cmsCateLevel");
            return (Criteria) this;
        }

        public Criteria andCmsCateLevelIn(List<Integer> values) {
            addCriterion("cms_cate_level in", values, "cmsCateLevel");
            return (Criteria) this;
        }

        public Criteria andCmsCateLevelNotIn(List<Integer> values) {
            addCriterion("cms_cate_level not in", values, "cmsCateLevel");
            return (Criteria) this;
        }

        public Criteria andCmsCateLevelBetween(Integer value1, Integer value2) {
            addCriterion("cms_cate_level between", value1, value2, "cmsCateLevel");
            return (Criteria) this;
        }

        public Criteria andCmsCateLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("cms_cate_level not between", value1, value2, "cmsCateLevel");
            return (Criteria) this;
        }

        public Criteria andRedFlgIsNull() {
            addCriterion("red_flg is null");
            return (Criteria) this;
        }

        public Criteria andRedFlgIsNotNull() {
            addCriterion("red_flg is not null");
            return (Criteria) this;
        }

        public Criteria andRedFlgEqualTo(String value) {
            addCriterion("red_flg =", value, "redFlg");
            return (Criteria) this;
        }

        public Criteria andRedFlgNotEqualTo(String value) {
            addCriterion("red_flg <>", value, "redFlg");
            return (Criteria) this;
        }

        public Criteria andRedFlgGreaterThan(String value) {
            addCriterion("red_flg >", value, "redFlg");
            return (Criteria) this;
        }

        public Criteria andRedFlgGreaterThanOrEqualTo(String value) {
            addCriterion("red_flg >=", value, "redFlg");
            return (Criteria) this;
        }

        public Criteria andRedFlgLessThan(String value) {
            addCriterion("red_flg <", value, "redFlg");
            return (Criteria) this;
        }

        public Criteria andRedFlgLessThanOrEqualTo(String value) {
            addCriterion("red_flg <=", value, "redFlg");
            return (Criteria) this;
        }

        public Criteria andRedFlgLike(String value) {
            addCriterion("red_flg like", value, "redFlg");
            return (Criteria) this;
        }

        public Criteria andRedFlgNotLike(String value) {
            addCriterion("red_flg not like", value, "redFlg");
            return (Criteria) this;
        }

        public Criteria andRedFlgIn(List<String> values) {
            addCriterion("red_flg in", values, "redFlg");
            return (Criteria) this;
        }

        public Criteria andRedFlgNotIn(List<String> values) {
            addCriterion("red_flg not in", values, "redFlg");
            return (Criteria) this;
        }

        public Criteria andRedFlgBetween(String value1, String value2) {
            addCriterion("red_flg between", value1, value2, "redFlg");
            return (Criteria) this;
        }

        public Criteria andRedFlgNotBetween(String value1, String value2) {
            addCriterion("red_flg not between", value1, value2, "redFlg");
            return (Criteria) this;
        }

        public Criteria andProdCateIdsIsNull() {
            addCriterion("prod_cate_ids is null");
            return (Criteria) this;
        }

        public Criteria andProdCateIdsIsNotNull() {
            addCriterion("prod_cate_ids is not null");
            return (Criteria) this;
        }

        public Criteria andProdCateIdsEqualTo(String value) {
            addCriterion("prod_cate_ids =", value, "prodCateIds");
            return (Criteria) this;
        }

        public Criteria andProdCateIdsNotEqualTo(String value) {
            addCriterion("prod_cate_ids <>", value, "prodCateIds");
            return (Criteria) this;
        }

        public Criteria andProdCateIdsGreaterThan(String value) {
            addCriterion("prod_cate_ids >", value, "prodCateIds");
            return (Criteria) this;
        }

        public Criteria andProdCateIdsGreaterThanOrEqualTo(String value) {
            addCriterion("prod_cate_ids >=", value, "prodCateIds");
            return (Criteria) this;
        }

        public Criteria andProdCateIdsLessThan(String value) {
            addCriterion("prod_cate_ids <", value, "prodCateIds");
            return (Criteria) this;
        }

        public Criteria andProdCateIdsLessThanOrEqualTo(String value) {
            addCriterion("prod_cate_ids <=", value, "prodCateIds");
            return (Criteria) this;
        }

        public Criteria andProdCateIdsLike(String value) {
            addCriterion("prod_cate_ids like", value, "prodCateIds");
            return (Criteria) this;
        }

        public Criteria andProdCateIdsNotLike(String value) {
            addCriterion("prod_cate_ids not like", value, "prodCateIds");
            return (Criteria) this;
        }

        public Criteria andProdCateIdsIn(List<String> values) {
            addCriterion("prod_cate_ids in", values, "prodCateIds");
            return (Criteria) this;
        }

        public Criteria andProdCateIdsNotIn(List<String> values) {
            addCriterion("prod_cate_ids not in", values, "prodCateIds");
            return (Criteria) this;
        }

        public Criteria andProdCateIdsBetween(String value1, String value2) {
            addCriterion("prod_cate_ids between", value1, value2, "prodCateIds");
            return (Criteria) this;
        }

        public Criteria andProdCateIdsNotBetween(String value1, String value2) {
            addCriterion("prod_cate_ids not between", value1, value2, "prodCateIds");
            return (Criteria) this;
        }

        public Criteria andCmsCateOrderIsNull() {
            addCriterion("cms_cate_order is null");
            return (Criteria) this;
        }

        public Criteria andCmsCateOrderIsNotNull() {
            addCriterion("cms_cate_order is not null");
            return (Criteria) this;
        }

        public Criteria andCmsCateOrderEqualTo(Integer value) {
            addCriterion("cms_cate_order =", value, "cmsCateOrder");
            return (Criteria) this;
        }

        public Criteria andCmsCateOrderNotEqualTo(Integer value) {
            addCriterion("cms_cate_order <>", value, "cmsCateOrder");
            return (Criteria) this;
        }

        public Criteria andCmsCateOrderGreaterThan(Integer value) {
            addCriterion("cms_cate_order >", value, "cmsCateOrder");
            return (Criteria) this;
        }

        public Criteria andCmsCateOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("cms_cate_order >=", value, "cmsCateOrder");
            return (Criteria) this;
        }

        public Criteria andCmsCateOrderLessThan(Integer value) {
            addCriterion("cms_cate_order <", value, "cmsCateOrder");
            return (Criteria) this;
        }

        public Criteria andCmsCateOrderLessThanOrEqualTo(Integer value) {
            addCriterion("cms_cate_order <=", value, "cmsCateOrder");
            return (Criteria) this;
        }

        public Criteria andCmsCateOrderIn(List<Integer> values) {
            addCriterion("cms_cate_order in", values, "cmsCateOrder");
            return (Criteria) this;
        }

        public Criteria andCmsCateOrderNotIn(List<Integer> values) {
            addCriterion("cms_cate_order not in", values, "cmsCateOrder");
            return (Criteria) this;
        }

        public Criteria andCmsCateOrderBetween(Integer value1, Integer value2) {
            addCriterion("cms_cate_order between", value1, value2, "cmsCateOrder");
            return (Criteria) this;
        }

        public Criteria andCmsCateOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("cms_cate_order not between", value1, value2, "cmsCateOrder");
            return (Criteria) this;
        }

        public Criteria andCmsCateTargeturlIsNull() {
            addCriterion("cms_cate_targeturl is null");
            return (Criteria) this;
        }

        public Criteria andCmsCateTargeturlIsNotNull() {
            addCriterion("cms_cate_targeturl is not null");
            return (Criteria) this;
        }

        public Criteria andCmsCateTargeturlEqualTo(String value) {
            addCriterion("cms_cate_targeturl =", value, "cmsCateTargeturl");
            return (Criteria) this;
        }

        public Criteria andCmsCateTargeturlNotEqualTo(String value) {
            addCriterion("cms_cate_targeturl <>", value, "cmsCateTargeturl");
            return (Criteria) this;
        }

        public Criteria andCmsCateTargeturlGreaterThan(String value) {
            addCriterion("cms_cate_targeturl >", value, "cmsCateTargeturl");
            return (Criteria) this;
        }

        public Criteria andCmsCateTargeturlGreaterThanOrEqualTo(String value) {
            addCriterion("cms_cate_targeturl >=", value, "cmsCateTargeturl");
            return (Criteria) this;
        }

        public Criteria andCmsCateTargeturlLessThan(String value) {
            addCriterion("cms_cate_targeturl <", value, "cmsCateTargeturl");
            return (Criteria) this;
        }

        public Criteria andCmsCateTargeturlLessThanOrEqualTo(String value) {
            addCriterion("cms_cate_targeturl <=", value, "cmsCateTargeturl");
            return (Criteria) this;
        }

        public Criteria andCmsCateTargeturlLike(String value) {
            addCriterion("cms_cate_targeturl like", value, "cmsCateTargeturl");
            return (Criteria) this;
        }

        public Criteria andCmsCateTargeturlNotLike(String value) {
            addCriterion("cms_cate_targeturl not like", value, "cmsCateTargeturl");
            return (Criteria) this;
        }

        public Criteria andCmsCateTargeturlIn(List<String> values) {
            addCriterion("cms_cate_targeturl in", values, "cmsCateTargeturl");
            return (Criteria) this;
        }

        public Criteria andCmsCateTargeturlNotIn(List<String> values) {
            addCriterion("cms_cate_targeturl not in", values, "cmsCateTargeturl");
            return (Criteria) this;
        }

        public Criteria andCmsCateTargeturlBetween(String value1, String value2) {
            addCriterion("cms_cate_targeturl between", value1, value2, "cmsCateTargeturl");
            return (Criteria) this;
        }

        public Criteria andCmsCateTargeturlNotBetween(String value1, String value2) {
            addCriterion("cms_cate_targeturl not between", value1, value2, "cmsCateTargeturl");
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

        public Criteria andDelFlagEqualTo(Integer value) {
            addCriterion("del_flag =", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotEqualTo(Integer value) {
            addCriterion("del_flag <>", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThan(Integer value) {
            addCriterion("del_flag >", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("del_flag >=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThan(Integer value) {
            addCriterion("del_flag <", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThanOrEqualTo(Integer value) {
            addCriterion("del_flag <=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagIn(List<Integer> values) {
            addCriterion("del_flag in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotIn(List<Integer> values) {
            addCriterion("del_flag not in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagBetween(Integer value1, Integer value2) {
            addCriterion("del_flag between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotBetween(Integer value1, Integer value2) {
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