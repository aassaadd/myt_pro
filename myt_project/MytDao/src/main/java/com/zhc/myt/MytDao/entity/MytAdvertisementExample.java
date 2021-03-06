package com.zhc.myt.MytDao.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MytAdvertisementExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public MytAdvertisementExample() {
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

    public void setLimitStart(Integer limitStart) {
        this.limitStart=limitStart;
    }

    public Integer getLimitStart() {
        return limitStart;
    }

    public void setLimitEnd(Integer limitEnd) {
        this.limitEnd=limitEnd;
    }

    public Integer getLimitEnd() {
        return limitEnd;
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAdvTitleIsNull() {
            addCriterion("adv_title is null");
            return (Criteria) this;
        }

        public Criteria andAdvTitleIsNotNull() {
            addCriterion("adv_title is not null");
            return (Criteria) this;
        }

        public Criteria andAdvTitleEqualTo(String value) {
            addCriterion("adv_title =", value, "advTitle");
            return (Criteria) this;
        }

        public Criteria andAdvTitleNotEqualTo(String value) {
            addCriterion("adv_title <>", value, "advTitle");
            return (Criteria) this;
        }

        public Criteria andAdvTitleGreaterThan(String value) {
            addCriterion("adv_title >", value, "advTitle");
            return (Criteria) this;
        }

        public Criteria andAdvTitleGreaterThanOrEqualTo(String value) {
            addCriterion("adv_title >=", value, "advTitle");
            return (Criteria) this;
        }

        public Criteria andAdvTitleLessThan(String value) {
            addCriterion("adv_title <", value, "advTitle");
            return (Criteria) this;
        }

        public Criteria andAdvTitleLessThanOrEqualTo(String value) {
            addCriterion("adv_title <=", value, "advTitle");
            return (Criteria) this;
        }

        public Criteria andAdvTitleLike(String value) {
            addCriterion("adv_title like", value, "advTitle");
            return (Criteria) this;
        }

        public Criteria andAdvTitleNotLike(String value) {
            addCriterion("adv_title not like", value, "advTitle");
            return (Criteria) this;
        }

        public Criteria andAdvTitleIn(List<String> values) {
            addCriterion("adv_title in", values, "advTitle");
            return (Criteria) this;
        }

        public Criteria andAdvTitleNotIn(List<String> values) {
            addCriterion("adv_title not in", values, "advTitle");
            return (Criteria) this;
        }

        public Criteria andAdvTitleBetween(String value1, String value2) {
            addCriterion("adv_title between", value1, value2, "advTitle");
            return (Criteria) this;
        }

        public Criteria andAdvTitleNotBetween(String value1, String value2) {
            addCriterion("adv_title not between", value1, value2, "advTitle");
            return (Criteria) this;
        }

        public Criteria andAdvMchIsNull() {
            addCriterion("adv_mch is null");
            return (Criteria) this;
        }

        public Criteria andAdvMchIsNotNull() {
            addCriterion("adv_mch is not null");
            return (Criteria) this;
        }

        public Criteria andAdvMchEqualTo(String value) {
            addCriterion("adv_mch =", value, "advMch");
            return (Criteria) this;
        }

        public Criteria andAdvMchNotEqualTo(String value) {
            addCriterion("adv_mch <>", value, "advMch");
            return (Criteria) this;
        }

        public Criteria andAdvMchGreaterThan(String value) {
            addCriterion("adv_mch >", value, "advMch");
            return (Criteria) this;
        }

        public Criteria andAdvMchGreaterThanOrEqualTo(String value) {
            addCriterion("adv_mch >=", value, "advMch");
            return (Criteria) this;
        }

        public Criteria andAdvMchLessThan(String value) {
            addCriterion("adv_mch <", value, "advMch");
            return (Criteria) this;
        }

        public Criteria andAdvMchLessThanOrEqualTo(String value) {
            addCriterion("adv_mch <=", value, "advMch");
            return (Criteria) this;
        }

        public Criteria andAdvMchLike(String value) {
            addCriterion("adv_mch like", value, "advMch");
            return (Criteria) this;
        }

        public Criteria andAdvMchNotLike(String value) {
            addCriterion("adv_mch not like", value, "advMch");
            return (Criteria) this;
        }

        public Criteria andAdvMchIn(List<String> values) {
            addCriterion("adv_mch in", values, "advMch");
            return (Criteria) this;
        }

        public Criteria andAdvMchNotIn(List<String> values) {
            addCriterion("adv_mch not in", values, "advMch");
            return (Criteria) this;
        }

        public Criteria andAdvMchBetween(String value1, String value2) {
            addCriterion("adv_mch between", value1, value2, "advMch");
            return (Criteria) this;
        }

        public Criteria andAdvMchNotBetween(String value1, String value2) {
            addCriterion("adv_mch not between", value1, value2, "advMch");
            return (Criteria) this;
        }

        public Criteria andAdvTypeIsNull() {
            addCriterion("adv_type is null");
            return (Criteria) this;
        }

        public Criteria andAdvTypeIsNotNull() {
            addCriterion("adv_type is not null");
            return (Criteria) this;
        }

        public Criteria andAdvTypeEqualTo(String value) {
            addCriterion("adv_type =", value, "advType");
            return (Criteria) this;
        }

        public Criteria andAdvTypeNotEqualTo(String value) {
            addCriterion("adv_type <>", value, "advType");
            return (Criteria) this;
        }

        public Criteria andAdvTypeGreaterThan(String value) {
            addCriterion("adv_type >", value, "advType");
            return (Criteria) this;
        }

        public Criteria andAdvTypeGreaterThanOrEqualTo(String value) {
            addCriterion("adv_type >=", value, "advType");
            return (Criteria) this;
        }

        public Criteria andAdvTypeLessThan(String value) {
            addCriterion("adv_type <", value, "advType");
            return (Criteria) this;
        }

        public Criteria andAdvTypeLessThanOrEqualTo(String value) {
            addCriterion("adv_type <=", value, "advType");
            return (Criteria) this;
        }

        public Criteria andAdvTypeLike(String value) {
            addCriterion("adv_type like", value, "advType");
            return (Criteria) this;
        }

        public Criteria andAdvTypeNotLike(String value) {
            addCriterion("adv_type not like", value, "advType");
            return (Criteria) this;
        }

        public Criteria andAdvTypeIn(List<String> values) {
            addCriterion("adv_type in", values, "advType");
            return (Criteria) this;
        }

        public Criteria andAdvTypeNotIn(List<String> values) {
            addCriterion("adv_type not in", values, "advType");
            return (Criteria) this;
        }

        public Criteria andAdvTypeBetween(String value1, String value2) {
            addCriterion("adv_type between", value1, value2, "advType");
            return (Criteria) this;
        }

        public Criteria andAdvTypeNotBetween(String value1, String value2) {
            addCriterion("adv_type not between", value1, value2, "advType");
            return (Criteria) this;
        }

        public Criteria andAdvUrlIsNull() {
            addCriterion("adv_url is null");
            return (Criteria) this;
        }

        public Criteria andAdvUrlIsNotNull() {
            addCriterion("adv_url is not null");
            return (Criteria) this;
        }

        public Criteria andAdvUrlEqualTo(String value) {
            addCriterion("adv_url =", value, "advUrl");
            return (Criteria) this;
        }

        public Criteria andAdvUrlNotEqualTo(String value) {
            addCriterion("adv_url <>", value, "advUrl");
            return (Criteria) this;
        }

        public Criteria andAdvUrlGreaterThan(String value) {
            addCriterion("adv_url >", value, "advUrl");
            return (Criteria) this;
        }

        public Criteria andAdvUrlGreaterThanOrEqualTo(String value) {
            addCriterion("adv_url >=", value, "advUrl");
            return (Criteria) this;
        }

        public Criteria andAdvUrlLessThan(String value) {
            addCriterion("adv_url <", value, "advUrl");
            return (Criteria) this;
        }

        public Criteria andAdvUrlLessThanOrEqualTo(String value) {
            addCriterion("adv_url <=", value, "advUrl");
            return (Criteria) this;
        }

        public Criteria andAdvUrlLike(String value) {
            addCriterion("adv_url like", value, "advUrl");
            return (Criteria) this;
        }

        public Criteria andAdvUrlNotLike(String value) {
            addCriterion("adv_url not like", value, "advUrl");
            return (Criteria) this;
        }

        public Criteria andAdvUrlIn(List<String> values) {
            addCriterion("adv_url in", values, "advUrl");
            return (Criteria) this;
        }

        public Criteria andAdvUrlNotIn(List<String> values) {
            addCriterion("adv_url not in", values, "advUrl");
            return (Criteria) this;
        }

        public Criteria andAdvUrlBetween(String value1, String value2) {
            addCriterion("adv_url between", value1, value2, "advUrl");
            return (Criteria) this;
        }

        public Criteria andAdvUrlNotBetween(String value1, String value2) {
            addCriterion("adv_url not between", value1, value2, "advUrl");
            return (Criteria) this;
        }

        public Criteria andAdvImgIdIsNull() {
            addCriterion("adv_img_id is null");
            return (Criteria) this;
        }

        public Criteria andAdvImgIdIsNotNull() {
            addCriterion("adv_img_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdvImgIdEqualTo(Integer value) {
            addCriterion("adv_img_id =", value, "advImgId");
            return (Criteria) this;
        }

        public Criteria andAdvImgIdNotEqualTo(Integer value) {
            addCriterion("adv_img_id <>", value, "advImgId");
            return (Criteria) this;
        }

        public Criteria andAdvImgIdGreaterThan(Integer value) {
            addCriterion("adv_img_id >", value, "advImgId");
            return (Criteria) this;
        }

        public Criteria andAdvImgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("adv_img_id >=", value, "advImgId");
            return (Criteria) this;
        }

        public Criteria andAdvImgIdLessThan(Integer value) {
            addCriterion("adv_img_id <", value, "advImgId");
            return (Criteria) this;
        }

        public Criteria andAdvImgIdLessThanOrEqualTo(Integer value) {
            addCriterion("adv_img_id <=", value, "advImgId");
            return (Criteria) this;
        }

        public Criteria andAdvImgIdIn(List<Integer> values) {
            addCriterion("adv_img_id in", values, "advImgId");
            return (Criteria) this;
        }

        public Criteria andAdvImgIdNotIn(List<Integer> values) {
            addCriterion("adv_img_id not in", values, "advImgId");
            return (Criteria) this;
        }

        public Criteria andAdvImgIdBetween(Integer value1, Integer value2) {
            addCriterion("adv_img_id between", value1, value2, "advImgId");
            return (Criteria) this;
        }

        public Criteria andAdvImgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("adv_img_id not between", value1, value2, "advImgId");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andOptIdIsNull() {
            addCriterion("opt_id is null");
            return (Criteria) this;
        }

        public Criteria andOptIdIsNotNull() {
            addCriterion("opt_id is not null");
            return (Criteria) this;
        }

        public Criteria andOptIdEqualTo(Integer value) {
            addCriterion("opt_id =", value, "optId");
            return (Criteria) this;
        }

        public Criteria andOptIdNotEqualTo(Integer value) {
            addCriterion("opt_id <>", value, "optId");
            return (Criteria) this;
        }

        public Criteria andOptIdGreaterThan(Integer value) {
            addCriterion("opt_id >", value, "optId");
            return (Criteria) this;
        }

        public Criteria andOptIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("opt_id >=", value, "optId");
            return (Criteria) this;
        }

        public Criteria andOptIdLessThan(Integer value) {
            addCriterion("opt_id <", value, "optId");
            return (Criteria) this;
        }

        public Criteria andOptIdLessThanOrEqualTo(Integer value) {
            addCriterion("opt_id <=", value, "optId");
            return (Criteria) this;
        }

        public Criteria andOptIdIn(List<Integer> values) {
            addCriterion("opt_id in", values, "optId");
            return (Criteria) this;
        }

        public Criteria andOptIdNotIn(List<Integer> values) {
            addCriterion("opt_id not in", values, "optId");
            return (Criteria) this;
        }

        public Criteria andOptIdBetween(Integer value1, Integer value2) {
            addCriterion("opt_id between", value1, value2, "optId");
            return (Criteria) this;
        }

        public Criteria andOptIdNotBetween(Integer value1, Integer value2) {
            addCriterion("opt_id not between", value1, value2, "optId");
            return (Criteria) this;
        }

        public Criteria andOptDateIsNull() {
            addCriterion("opt_date is null");
            return (Criteria) this;
        }

        public Criteria andOptDateIsNotNull() {
            addCriterion("opt_date is not null");
            return (Criteria) this;
        }

        public Criteria andOptDateEqualTo(Date value) {
            addCriterion("opt_date =", value, "optDate");
            return (Criteria) this;
        }

        public Criteria andOptDateNotEqualTo(Date value) {
            addCriterion("opt_date <>", value, "optDate");
            return (Criteria) this;
        }

        public Criteria andOptDateGreaterThan(Date value) {
            addCriterion("opt_date >", value, "optDate");
            return (Criteria) this;
        }

        public Criteria andOptDateGreaterThanOrEqualTo(Date value) {
            addCriterion("opt_date >=", value, "optDate");
            return (Criteria) this;
        }

        public Criteria andOptDateLessThan(Date value) {
            addCriterion("opt_date <", value, "optDate");
            return (Criteria) this;
        }

        public Criteria andOptDateLessThanOrEqualTo(Date value) {
            addCriterion("opt_date <=", value, "optDate");
            return (Criteria) this;
        }

        public Criteria andOptDateIn(List<Date> values) {
            addCriterion("opt_date in", values, "optDate");
            return (Criteria) this;
        }

        public Criteria andOptDateNotIn(List<Date> values) {
            addCriterion("opt_date not in", values, "optDate");
            return (Criteria) this;
        }

        public Criteria andOptDateBetween(Date value1, Date value2) {
            addCriterion("opt_date between", value1, value2, "optDate");
            return (Criteria) this;
        }

        public Criteria andOptDateNotBetween(Date value1, Date value2) {
            addCriterion("opt_date not between", value1, value2, "optDate");
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

        public Criteria andCreateIdIsNull() {
            addCriterion("create_id is null");
            return (Criteria) this;
        }

        public Criteria andCreateIdIsNotNull() {
            addCriterion("create_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreateIdEqualTo(Integer value) {
            addCriterion("create_id =", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotEqualTo(Integer value) {
            addCriterion("create_id <>", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdGreaterThan(Integer value) {
            addCriterion("create_id >", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_id >=", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLessThan(Integer value) {
            addCriterion("create_id <", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLessThanOrEqualTo(Integer value) {
            addCriterion("create_id <=", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdIn(List<Integer> values) {
            addCriterion("create_id in", values, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotIn(List<Integer> values) {
            addCriterion("create_id not in", values, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdBetween(Integer value1, Integer value2) {
            addCriterion("create_id between", value1, value2, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("create_id not between", value1, value2, "createId");
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