package com.elastic.entity.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CmsSearchFilterCateAttrExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int count = -1;

    public CmsSearchFilterCateAttrExample() {
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

        public Criteria andFilterCateAttrIdIsNull() {
            addCriterion("filter_cate_attr_id is null");
            return (Criteria) this;
        }

        public Criteria andFilterCateAttrIdIsNotNull() {
            addCriterion("filter_cate_attr_id is not null");
            return (Criteria) this;
        }

        public Criteria andFilterCateAttrIdEqualTo(Integer value) {
            addCriterion("filter_cate_attr_id =", value, "filterCateAttrId");
            return (Criteria) this;
        }

        public Criteria andFilterCateAttrIdNotEqualTo(Integer value) {
            addCriterion("filter_cate_attr_id <>", value, "filterCateAttrId");
            return (Criteria) this;
        }

        public Criteria andFilterCateAttrIdGreaterThan(Integer value) {
            addCriterion("filter_cate_attr_id >", value, "filterCateAttrId");
            return (Criteria) this;
        }

        public Criteria andFilterCateAttrIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("filter_cate_attr_id >=", value, "filterCateAttrId");
            return (Criteria) this;
        }

        public Criteria andFilterCateAttrIdLessThan(Integer value) {
            addCriterion("filter_cate_attr_id <", value, "filterCateAttrId");
            return (Criteria) this;
        }

        public Criteria andFilterCateAttrIdLessThanOrEqualTo(Integer value) {
            addCriterion("filter_cate_attr_id <=", value, "filterCateAttrId");
            return (Criteria) this;
        }

        public Criteria andFilterCateAttrIdIn(List<Integer> values) {
            addCriterion("filter_cate_attr_id in", values, "filterCateAttrId");
            return (Criteria) this;
        }

        public Criteria andFilterCateAttrIdNotIn(List<Integer> values) {
            addCriterion("filter_cate_attr_id not in", values, "filterCateAttrId");
            return (Criteria) this;
        }

        public Criteria andFilterCateAttrIdBetween(Integer value1, Integer value2) {
            addCriterion("filter_cate_attr_id between", value1, value2, "filterCateAttrId");
            return (Criteria) this;
        }

        public Criteria andFilterCateAttrIdNotBetween(Integer value1, Integer value2) {
            addCriterion("filter_cate_attr_id not between", value1, value2, "filterCateAttrId");
            return (Criteria) this;
        }

        public Criteria andFilterCateIdIsNull() {
            addCriterion("filter_cate_id is null");
            return (Criteria) this;
        }

        public Criteria andFilterCateIdIsNotNull() {
            addCriterion("filter_cate_id is not null");
            return (Criteria) this;
        }

        public Criteria andFilterCateIdEqualTo(Integer value) {
            addCriterion("filter_cate_id =", value, "filterCateId");
            return (Criteria) this;
        }

        public Criteria andFilterCateIdNotEqualTo(Integer value) {
            addCriterion("filter_cate_id <>", value, "filterCateId");
            return (Criteria) this;
        }

        public Criteria andFilterCateIdGreaterThan(Integer value) {
            addCriterion("filter_cate_id >", value, "filterCateId");
            return (Criteria) this;
        }

        public Criteria andFilterCateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("filter_cate_id >=", value, "filterCateId");
            return (Criteria) this;
        }

        public Criteria andFilterCateIdLessThan(Integer value) {
            addCriterion("filter_cate_id <", value, "filterCateId");
            return (Criteria) this;
        }

        public Criteria andFilterCateIdLessThanOrEqualTo(Integer value) {
            addCriterion("filter_cate_id <=", value, "filterCateId");
            return (Criteria) this;
        }

        public Criteria andFilterCateIdIn(List<Integer> values) {
            addCriterion("filter_cate_id in", values, "filterCateId");
            return (Criteria) this;
        }

        public Criteria andFilterCateIdNotIn(List<Integer> values) {
            addCriterion("filter_cate_id not in", values, "filterCateId");
            return (Criteria) this;
        }

        public Criteria andFilterCateIdBetween(Integer value1, Integer value2) {
            addCriterion("filter_cate_id between", value1, value2, "filterCateId");
            return (Criteria) this;
        }

        public Criteria andFilterCateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("filter_cate_id not between", value1, value2, "filterCateId");
            return (Criteria) this;
        }

        public Criteria andFilterCateNameIsNull() {
            addCriterion("filter_cate_name is null");
            return (Criteria) this;
        }

        public Criteria andFilterCateNameIsNotNull() {
            addCriterion("filter_cate_name is not null");
            return (Criteria) this;
        }

        public Criteria andFilterCateNameEqualTo(String value) {
            addCriterion("filter_cate_name =", value, "filterCateName");
            return (Criteria) this;
        }

        public Criteria andFilterCateNameNotEqualTo(String value) {
            addCriterion("filter_cate_name <>", value, "filterCateName");
            return (Criteria) this;
        }

        public Criteria andFilterCateNameGreaterThan(String value) {
            addCriterion("filter_cate_name >", value, "filterCateName");
            return (Criteria) this;
        }

        public Criteria andFilterCateNameGreaterThanOrEqualTo(String value) {
            addCriterion("filter_cate_name >=", value, "filterCateName");
            return (Criteria) this;
        }

        public Criteria andFilterCateNameLessThan(String value) {
            addCriterion("filter_cate_name <", value, "filterCateName");
            return (Criteria) this;
        }

        public Criteria andFilterCateNameLessThanOrEqualTo(String value) {
            addCriterion("filter_cate_name <=", value, "filterCateName");
            return (Criteria) this;
        }

        public Criteria andFilterCateNameLike(String value) {
            addCriterion("filter_cate_name like", value, "filterCateName");
            return (Criteria) this;
        }

        public Criteria andFilterCateNameNotLike(String value) {
            addCriterion("filter_cate_name not like", value, "filterCateName");
            return (Criteria) this;
        }

        public Criteria andFilterCateNameIn(List<String> values) {
            addCriterion("filter_cate_name in", values, "filterCateName");
            return (Criteria) this;
        }

        public Criteria andFilterCateNameNotIn(List<String> values) {
            addCriterion("filter_cate_name not in", values, "filterCateName");
            return (Criteria) this;
        }

        public Criteria andFilterCateNameBetween(String value1, String value2) {
            addCriterion("filter_cate_name between", value1, value2, "filterCateName");
            return (Criteria) this;
        }

        public Criteria andFilterCateNameNotBetween(String value1, String value2) {
            addCriterion("filter_cate_name not between", value1, value2, "filterCateName");
            return (Criteria) this;
        }

        public Criteria andFilterAttrIdIsNull() {
            addCriterion("filter_attr_id is null");
            return (Criteria) this;
        }

        public Criteria andFilterAttrIdIsNotNull() {
            addCriterion("filter_attr_id is not null");
            return (Criteria) this;
        }

        public Criteria andFilterAttrIdEqualTo(Integer value) {
            addCriterion("filter_attr_id =", value, "filterAttrId");
            return (Criteria) this;
        }

        public Criteria andFilterAttrIdNotEqualTo(Integer value) {
            addCriterion("filter_attr_id <>", value, "filterAttrId");
            return (Criteria) this;
        }

        public Criteria andFilterAttrIdGreaterThan(Integer value) {
            addCriterion("filter_attr_id >", value, "filterAttrId");
            return (Criteria) this;
        }

        public Criteria andFilterAttrIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("filter_attr_id >=", value, "filterAttrId");
            return (Criteria) this;
        }

        public Criteria andFilterAttrIdLessThan(Integer value) {
            addCriterion("filter_attr_id <", value, "filterAttrId");
            return (Criteria) this;
        }

        public Criteria andFilterAttrIdLessThanOrEqualTo(Integer value) {
            addCriterion("filter_attr_id <=", value, "filterAttrId");
            return (Criteria) this;
        }

        public Criteria andFilterAttrIdIn(List<Integer> values) {
            addCriterion("filter_attr_id in", values, "filterAttrId");
            return (Criteria) this;
        }

        public Criteria andFilterAttrIdNotIn(List<Integer> values) {
            addCriterion("filter_attr_id not in", values, "filterAttrId");
            return (Criteria) this;
        }

        public Criteria andFilterAttrIdBetween(Integer value1, Integer value2) {
            addCriterion("filter_attr_id between", value1, value2, "filterAttrId");
            return (Criteria) this;
        }

        public Criteria andFilterAttrIdNotBetween(Integer value1, Integer value2) {
            addCriterion("filter_attr_id not between", value1, value2, "filterAttrId");
            return (Criteria) this;
        }

        public Criteria andFilterAttrNameIsNull() {
            addCriterion("filter_attr_name is null");
            return (Criteria) this;
        }

        public Criteria andFilterAttrNameIsNotNull() {
            addCriterion("filter_attr_name is not null");
            return (Criteria) this;
        }

        public Criteria andFilterAttrNameEqualTo(String value) {
            addCriterion("filter_attr_name =", value, "filterAttrName");
            return (Criteria) this;
        }

        public Criteria andFilterAttrNameNotEqualTo(String value) {
            addCriterion("filter_attr_name <>", value, "filterAttrName");
            return (Criteria) this;
        }

        public Criteria andFilterAttrNameGreaterThan(String value) {
            addCriterion("filter_attr_name >", value, "filterAttrName");
            return (Criteria) this;
        }

        public Criteria andFilterAttrNameGreaterThanOrEqualTo(String value) {
            addCriterion("filter_attr_name >=", value, "filterAttrName");
            return (Criteria) this;
        }

        public Criteria andFilterAttrNameLessThan(String value) {
            addCriterion("filter_attr_name <", value, "filterAttrName");
            return (Criteria) this;
        }

        public Criteria andFilterAttrNameLessThanOrEqualTo(String value) {
            addCriterion("filter_attr_name <=", value, "filterAttrName");
            return (Criteria) this;
        }

        public Criteria andFilterAttrNameLike(String value) {
            addCriterion("filter_attr_name like", value, "filterAttrName");
            return (Criteria) this;
        }

        public Criteria andFilterAttrNameNotLike(String value) {
            addCriterion("filter_attr_name not like", value, "filterAttrName");
            return (Criteria) this;
        }

        public Criteria andFilterAttrNameIn(List<String> values) {
            addCriterion("filter_attr_name in", values, "filterAttrName");
            return (Criteria) this;
        }

        public Criteria andFilterAttrNameNotIn(List<String> values) {
            addCriterion("filter_attr_name not in", values, "filterAttrName");
            return (Criteria) this;
        }

        public Criteria andFilterAttrNameBetween(String value1, String value2) {
            addCriterion("filter_attr_name between", value1, value2, "filterAttrName");
            return (Criteria) this;
        }

        public Criteria andFilterAttrNameNotBetween(String value1, String value2) {
            addCriterion("filter_attr_name not between", value1, value2, "filterAttrName");
            return (Criteria) this;
        }

        public Criteria andFilterAttrScoreIsNull() {
            addCriterion("filter_attr_score is null");
            return (Criteria) this;
        }

        public Criteria andFilterAttrScoreIsNotNull() {
            addCriterion("filter_attr_score is not null");
            return (Criteria) this;
        }

        public Criteria andFilterAttrScoreEqualTo(Integer value) {
            addCriterion("filter_attr_score =", value, "filterAttrScore");
            return (Criteria) this;
        }

        public Criteria andFilterAttrScoreNotEqualTo(Integer value) {
            addCriterion("filter_attr_score <>", value, "filterAttrScore");
            return (Criteria) this;
        }

        public Criteria andFilterAttrScoreGreaterThan(Integer value) {
            addCriterion("filter_attr_score >", value, "filterAttrScore");
            return (Criteria) this;
        }

        public Criteria andFilterAttrScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("filter_attr_score >=", value, "filterAttrScore");
            return (Criteria) this;
        }

        public Criteria andFilterAttrScoreLessThan(Integer value) {
            addCriterion("filter_attr_score <", value, "filterAttrScore");
            return (Criteria) this;
        }

        public Criteria andFilterAttrScoreLessThanOrEqualTo(Integer value) {
            addCriterion("filter_attr_score <=", value, "filterAttrScore");
            return (Criteria) this;
        }

        public Criteria andFilterAttrScoreIn(List<Integer> values) {
            addCriterion("filter_attr_score in", values, "filterAttrScore");
            return (Criteria) this;
        }

        public Criteria andFilterAttrScoreNotIn(List<Integer> values) {
            addCriterion("filter_attr_score not in", values, "filterAttrScore");
            return (Criteria) this;
        }

        public Criteria andFilterAttrScoreBetween(Integer value1, Integer value2) {
            addCriterion("filter_attr_score between", value1, value2, "filterAttrScore");
            return (Criteria) this;
        }

        public Criteria andFilterAttrScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("filter_attr_score not between", value1, value2, "filterAttrScore");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
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

        public Criteria andModfiyIsNull() {
            addCriterion("modfiy is null");
            return (Criteria) this;
        }

        public Criteria andModfiyIsNotNull() {
            addCriterion("modfiy is not null");
            return (Criteria) this;
        }

        public Criteria andModfiyEqualTo(String value) {
            addCriterion("modfiy =", value, "modfiy");
            return (Criteria) this;
        }

        public Criteria andModfiyNotEqualTo(String value) {
            addCriterion("modfiy <>", value, "modfiy");
            return (Criteria) this;
        }

        public Criteria andModfiyGreaterThan(String value) {
            addCriterion("modfiy >", value, "modfiy");
            return (Criteria) this;
        }

        public Criteria andModfiyGreaterThanOrEqualTo(String value) {
            addCriterion("modfiy >=", value, "modfiy");
            return (Criteria) this;
        }

        public Criteria andModfiyLessThan(String value) {
            addCriterion("modfiy <", value, "modfiy");
            return (Criteria) this;
        }

        public Criteria andModfiyLessThanOrEqualTo(String value) {
            addCriterion("modfiy <=", value, "modfiy");
            return (Criteria) this;
        }

        public Criteria andModfiyLike(String value) {
            addCriterion("modfiy like", value, "modfiy");
            return (Criteria) this;
        }

        public Criteria andModfiyNotLike(String value) {
            addCriterion("modfiy not like", value, "modfiy");
            return (Criteria) this;
        }

        public Criteria andModfiyIn(List<String> values) {
            addCriterion("modfiy in", values, "modfiy");
            return (Criteria) this;
        }

        public Criteria andModfiyNotIn(List<String> values) {
            addCriterion("modfiy not in", values, "modfiy");
            return (Criteria) this;
        }

        public Criteria andModfiyBetween(String value1, String value2) {
            addCriterion("modfiy between", value1, value2, "modfiy");
            return (Criteria) this;
        }

        public Criteria andModfiyNotBetween(String value1, String value2) {
            addCriterion("modfiy not between", value1, value2, "modfiy");
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