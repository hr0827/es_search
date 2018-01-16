package com.elastic.entity.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProdSpuCateRelationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int count = -1;

    public ProdSpuCateRelationExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
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

        public Criteria andFirstLevelCateIdIsNull() {
            addCriterion("first_level_cate_id is null");
            return (Criteria) this;
        }

        public Criteria andFirstLevelCateIdIsNotNull() {
            addCriterion("first_level_cate_id is not null");
            return (Criteria) this;
        }

        public Criteria andFirstLevelCateIdEqualTo(String value) {
            addCriterion("first_level_cate_id =", value, "firstLevelCateId");
            return (Criteria) this;
        }

        public Criteria andFirstLevelCateIdNotEqualTo(String value) {
            addCriterion("first_level_cate_id <>", value, "firstLevelCateId");
            return (Criteria) this;
        }

        public Criteria andFirstLevelCateIdGreaterThan(String value) {
            addCriterion("first_level_cate_id >", value, "firstLevelCateId");
            return (Criteria) this;
        }

        public Criteria andFirstLevelCateIdGreaterThanOrEqualTo(String value) {
            addCriterion("first_level_cate_id >=", value, "firstLevelCateId");
            return (Criteria) this;
        }

        public Criteria andFirstLevelCateIdLessThan(String value) {
            addCriterion("first_level_cate_id <", value, "firstLevelCateId");
            return (Criteria) this;
        }

        public Criteria andFirstLevelCateIdLessThanOrEqualTo(String value) {
            addCriterion("first_level_cate_id <=", value, "firstLevelCateId");
            return (Criteria) this;
        }

        public Criteria andFirstLevelCateIdLike(String value) {
            addCriterion("first_level_cate_id like", value, "firstLevelCateId");
            return (Criteria) this;
        }

        public Criteria andFirstLevelCateIdNotLike(String value) {
            addCriterion("first_level_cate_id not like", value, "firstLevelCateId");
            return (Criteria) this;
        }

        public Criteria andFirstLevelCateIdIn(List<String> values) {
            addCriterion("first_level_cate_id in", values, "firstLevelCateId");
            return (Criteria) this;
        }

        public Criteria andFirstLevelCateIdNotIn(List<String> values) {
            addCriterion("first_level_cate_id not in", values, "firstLevelCateId");
            return (Criteria) this;
        }

        public Criteria andFirstLevelCateIdBetween(String value1, String value2) {
            addCriterion("first_level_cate_id between", value1, value2, "firstLevelCateId");
            return (Criteria) this;
        }

        public Criteria andFirstLevelCateIdNotBetween(String value1, String value2) {
            addCriterion("first_level_cate_id not between", value1, value2, "firstLevelCateId");
            return (Criteria) this;
        }

        public Criteria andSecondLevelCateIdIsNull() {
            addCriterion("second_level_cate_id is null");
            return (Criteria) this;
        }

        public Criteria andSecondLevelCateIdIsNotNull() {
            addCriterion("second_level_cate_id is not null");
            return (Criteria) this;
        }

        public Criteria andSecondLevelCateIdEqualTo(String value) {
            addCriterion("second_level_cate_id =", value, "secondLevelCateId");
            return (Criteria) this;
        }

        public Criteria andSecondLevelCateIdNotEqualTo(String value) {
            addCriterion("second_level_cate_id <>", value, "secondLevelCateId");
            return (Criteria) this;
        }

        public Criteria andSecondLevelCateIdGreaterThan(String value) {
            addCriterion("second_level_cate_id >", value, "secondLevelCateId");
            return (Criteria) this;
        }

        public Criteria andSecondLevelCateIdGreaterThanOrEqualTo(String value) {
            addCriterion("second_level_cate_id >=", value, "secondLevelCateId");
            return (Criteria) this;
        }

        public Criteria andSecondLevelCateIdLessThan(String value) {
            addCriterion("second_level_cate_id <", value, "secondLevelCateId");
            return (Criteria) this;
        }

        public Criteria andSecondLevelCateIdLessThanOrEqualTo(String value) {
            addCriterion("second_level_cate_id <=", value, "secondLevelCateId");
            return (Criteria) this;
        }

        public Criteria andSecondLevelCateIdLike(String value) {
            addCriterion("second_level_cate_id like", value, "secondLevelCateId");
            return (Criteria) this;
        }

        public Criteria andSecondLevelCateIdNotLike(String value) {
            addCriterion("second_level_cate_id not like", value, "secondLevelCateId");
            return (Criteria) this;
        }

        public Criteria andSecondLevelCateIdIn(List<String> values) {
            addCriterion("second_level_cate_id in", values, "secondLevelCateId");
            return (Criteria) this;
        }

        public Criteria andSecondLevelCateIdNotIn(List<String> values) {
            addCriterion("second_level_cate_id not in", values, "secondLevelCateId");
            return (Criteria) this;
        }

        public Criteria andSecondLevelCateIdBetween(String value1, String value2) {
            addCriterion("second_level_cate_id between", value1, value2, "secondLevelCateId");
            return (Criteria) this;
        }

        public Criteria andSecondLevelCateIdNotBetween(String value1, String value2) {
            addCriterion("second_level_cate_id not between", value1, value2, "secondLevelCateId");
            return (Criteria) this;
        }

        public Criteria andThirdLevelCateIdIsNull() {
            addCriterion("third_level_cate_id is null");
            return (Criteria) this;
        }

        public Criteria andThirdLevelCateIdIsNotNull() {
            addCriterion("third_level_cate_id is not null");
            return (Criteria) this;
        }

        public Criteria andThirdLevelCateIdEqualTo(String value) {
            addCriterion("third_level_cate_id =", value, "thirdLevelCateId");
            return (Criteria) this;
        }

        public Criteria andThirdLevelCateIdNotEqualTo(String value) {
            addCriterion("third_level_cate_id <>", value, "thirdLevelCateId");
            return (Criteria) this;
        }

        public Criteria andThirdLevelCateIdGreaterThan(String value) {
            addCriterion("third_level_cate_id >", value, "thirdLevelCateId");
            return (Criteria) this;
        }

        public Criteria andThirdLevelCateIdGreaterThanOrEqualTo(String value) {
            addCriterion("third_level_cate_id >=", value, "thirdLevelCateId");
            return (Criteria) this;
        }

        public Criteria andThirdLevelCateIdLessThan(String value) {
            addCriterion("third_level_cate_id <", value, "thirdLevelCateId");
            return (Criteria) this;
        }

        public Criteria andThirdLevelCateIdLessThanOrEqualTo(String value) {
            addCriterion("third_level_cate_id <=", value, "thirdLevelCateId");
            return (Criteria) this;
        }

        public Criteria andThirdLevelCateIdLike(String value) {
            addCriterion("third_level_cate_id like", value, "thirdLevelCateId");
            return (Criteria) this;
        }

        public Criteria andThirdLevelCateIdNotLike(String value) {
            addCriterion("third_level_cate_id not like", value, "thirdLevelCateId");
            return (Criteria) this;
        }

        public Criteria andThirdLevelCateIdIn(List<String> values) {
            addCriterion("third_level_cate_id in", values, "thirdLevelCateId");
            return (Criteria) this;
        }

        public Criteria andThirdLevelCateIdNotIn(List<String> values) {
            addCriterion("third_level_cate_id not in", values, "thirdLevelCateId");
            return (Criteria) this;
        }

        public Criteria andThirdLevelCateIdBetween(String value1, String value2) {
            addCriterion("third_level_cate_id between", value1, value2, "thirdLevelCateId");
            return (Criteria) this;
        }

        public Criteria andThirdLevelCateIdNotBetween(String value1, String value2) {
            addCriterion("third_level_cate_id not between", value1, value2, "thirdLevelCateId");
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