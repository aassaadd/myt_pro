package com.zhc.myt.MytDao.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MytQuestionnaireFillExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public MytQuestionnaireFillExample() {
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

        public Criteria andQuIdIsNull() {
            addCriterion("qu_id is null");
            return (Criteria) this;
        }

        public Criteria andQuIdIsNotNull() {
            addCriterion("qu_id is not null");
            return (Criteria) this;
        }

        public Criteria andQuIdEqualTo(Integer value) {
            addCriterion("qu_id =", value, "quId");
            return (Criteria) this;
        }

        public Criteria andQuIdNotEqualTo(Integer value) {
            addCriterion("qu_id <>", value, "quId");
            return (Criteria) this;
        }

        public Criteria andQuIdGreaterThan(Integer value) {
            addCriterion("qu_id >", value, "quId");
            return (Criteria) this;
        }

        public Criteria andQuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("qu_id >=", value, "quId");
            return (Criteria) this;
        }

        public Criteria andQuIdLessThan(Integer value) {
            addCriterion("qu_id <", value, "quId");
            return (Criteria) this;
        }

        public Criteria andQuIdLessThanOrEqualTo(Integer value) {
            addCriterion("qu_id <=", value, "quId");
            return (Criteria) this;
        }

        public Criteria andQuIdIn(List<Integer> values) {
            addCriterion("qu_id in", values, "quId");
            return (Criteria) this;
        }

        public Criteria andQuIdNotIn(List<Integer> values) {
            addCriterion("qu_id not in", values, "quId");
            return (Criteria) this;
        }

        public Criteria andQuIdBetween(Integer value1, Integer value2) {
            addCriterion("qu_id between", value1, value2, "quId");
            return (Criteria) this;
        }

        public Criteria andQuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("qu_id not between", value1, value2, "quId");
            return (Criteria) this;
        }

        public Criteria andProIdIsNull() {
            addCriterion("pro_id is null");
            return (Criteria) this;
        }

        public Criteria andProIdIsNotNull() {
            addCriterion("pro_id is not null");
            return (Criteria) this;
        }

        public Criteria andProIdEqualTo(Integer value) {
            addCriterion("pro_id =", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotEqualTo(Integer value) {
            addCriterion("pro_id <>", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdGreaterThan(Integer value) {
            addCriterion("pro_id >", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pro_id >=", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdLessThan(Integer value) {
            addCriterion("pro_id <", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdLessThanOrEqualTo(Integer value) {
            addCriterion("pro_id <=", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdIn(List<Integer> values) {
            addCriterion("pro_id in", values, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotIn(List<Integer> values) {
            addCriterion("pro_id not in", values, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdBetween(Integer value1, Integer value2) {
            addCriterion("pro_id between", value1, value2, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pro_id not between", value1, value2, "proId");
            return (Criteria) this;
        }

        public Criteria andQufDescriptionIsNull() {
            addCriterion("quf_description is null");
            return (Criteria) this;
        }

        public Criteria andQufDescriptionIsNotNull() {
            addCriterion("quf_description is not null");
            return (Criteria) this;
        }

        public Criteria andQufDescriptionEqualTo(String value) {
            addCriterion("quf_description =", value, "qufDescription");
            return (Criteria) this;
        }

        public Criteria andQufDescriptionNotEqualTo(String value) {
            addCriterion("quf_description <>", value, "qufDescription");
            return (Criteria) this;
        }

        public Criteria andQufDescriptionGreaterThan(String value) {
            addCriterion("quf_description >", value, "qufDescription");
            return (Criteria) this;
        }

        public Criteria andQufDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("quf_description >=", value, "qufDescription");
            return (Criteria) this;
        }

        public Criteria andQufDescriptionLessThan(String value) {
            addCriterion("quf_description <", value, "qufDescription");
            return (Criteria) this;
        }

        public Criteria andQufDescriptionLessThanOrEqualTo(String value) {
            addCriterion("quf_description <=", value, "qufDescription");
            return (Criteria) this;
        }

        public Criteria andQufDescriptionLike(String value) {
            addCriterion("quf_description like", value, "qufDescription");
            return (Criteria) this;
        }

        public Criteria andQufDescriptionNotLike(String value) {
            addCriterion("quf_description not like", value, "qufDescription");
            return (Criteria) this;
        }

        public Criteria andQufDescriptionIn(List<String> values) {
            addCriterion("quf_description in", values, "qufDescription");
            return (Criteria) this;
        }

        public Criteria andQufDescriptionNotIn(List<String> values) {
            addCriterion("quf_description not in", values, "qufDescription");
            return (Criteria) this;
        }

        public Criteria andQufDescriptionBetween(String value1, String value2) {
            addCriterion("quf_description between", value1, value2, "qufDescription");
            return (Criteria) this;
        }

        public Criteria andQufDescriptionNotBetween(String value1, String value2) {
            addCriterion("quf_description not between", value1, value2, "qufDescription");
            return (Criteria) this;
        }

        public Criteria andQufDescriptionBakIsNull() {
            addCriterion("quf_description_bak is null");
            return (Criteria) this;
        }

        public Criteria andQufDescriptionBakIsNotNull() {
            addCriterion("quf_description_bak is not null");
            return (Criteria) this;
        }

        public Criteria andQufDescriptionBakEqualTo(String value) {
            addCriterion("quf_description_bak =", value, "qufDescriptionBak");
            return (Criteria) this;
        }

        public Criteria andQufDescriptionBakNotEqualTo(String value) {
            addCriterion("quf_description_bak <>", value, "qufDescriptionBak");
            return (Criteria) this;
        }

        public Criteria andQufDescriptionBakGreaterThan(String value) {
            addCriterion("quf_description_bak >", value, "qufDescriptionBak");
            return (Criteria) this;
        }

        public Criteria andQufDescriptionBakGreaterThanOrEqualTo(String value) {
            addCriterion("quf_description_bak >=", value, "qufDescriptionBak");
            return (Criteria) this;
        }

        public Criteria andQufDescriptionBakLessThan(String value) {
            addCriterion("quf_description_bak <", value, "qufDescriptionBak");
            return (Criteria) this;
        }

        public Criteria andQufDescriptionBakLessThanOrEqualTo(String value) {
            addCriterion("quf_description_bak <=", value, "qufDescriptionBak");
            return (Criteria) this;
        }

        public Criteria andQufDescriptionBakLike(String value) {
            addCriterion("quf_description_bak like", value, "qufDescriptionBak");
            return (Criteria) this;
        }

        public Criteria andQufDescriptionBakNotLike(String value) {
            addCriterion("quf_description_bak not like", value, "qufDescriptionBak");
            return (Criteria) this;
        }

        public Criteria andQufDescriptionBakIn(List<String> values) {
            addCriterion("quf_description_bak in", values, "qufDescriptionBak");
            return (Criteria) this;
        }

        public Criteria andQufDescriptionBakNotIn(List<String> values) {
            addCriterion("quf_description_bak not in", values, "qufDescriptionBak");
            return (Criteria) this;
        }

        public Criteria andQufDescriptionBakBetween(String value1, String value2) {
            addCriterion("quf_description_bak between", value1, value2, "qufDescriptionBak");
            return (Criteria) this;
        }

        public Criteria andQufDescriptionBakNotBetween(String value1, String value2) {
            addCriterion("quf_description_bak not between", value1, value2, "qufDescriptionBak");
            return (Criteria) this;
        }

        public Criteria andQufJsonIsNull() {
            addCriterion("quf_json is null");
            return (Criteria) this;
        }

        public Criteria andQufJsonIsNotNull() {
            addCriterion("quf_json is not null");
            return (Criteria) this;
        }

        public Criteria andQufJsonEqualTo(String value) {
            addCriterion("quf_json =", value, "qufJson");
            return (Criteria) this;
        }

        public Criteria andQufJsonNotEqualTo(String value) {
            addCriterion("quf_json <>", value, "qufJson");
            return (Criteria) this;
        }

        public Criteria andQufJsonGreaterThan(String value) {
            addCriterion("quf_json >", value, "qufJson");
            return (Criteria) this;
        }

        public Criteria andQufJsonGreaterThanOrEqualTo(String value) {
            addCriterion("quf_json >=", value, "qufJson");
            return (Criteria) this;
        }

        public Criteria andQufJsonLessThan(String value) {
            addCriterion("quf_json <", value, "qufJson");
            return (Criteria) this;
        }

        public Criteria andQufJsonLessThanOrEqualTo(String value) {
            addCriterion("quf_json <=", value, "qufJson");
            return (Criteria) this;
        }

        public Criteria andQufJsonLike(String value) {
            addCriterion("quf_json like", value, "qufJson");
            return (Criteria) this;
        }

        public Criteria andQufJsonNotLike(String value) {
            addCriterion("quf_json not like", value, "qufJson");
            return (Criteria) this;
        }

        public Criteria andQufJsonIn(List<String> values) {
            addCriterion("quf_json in", values, "qufJson");
            return (Criteria) this;
        }

        public Criteria andQufJsonNotIn(List<String> values) {
            addCriterion("quf_json not in", values, "qufJson");
            return (Criteria) this;
        }

        public Criteria andQufJsonBetween(String value1, String value2) {
            addCriterion("quf_json between", value1, value2, "qufJson");
            return (Criteria) this;
        }

        public Criteria andQufJsonNotBetween(String value1, String value2) {
            addCriterion("quf_json not between", value1, value2, "qufJson");
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

        public Criteria andProNoIsNull() {
            addCriterion("pro_no is null");
            return (Criteria) this;
        }

        public Criteria andProNoIsNotNull() {
            addCriterion("pro_no is not null");
            return (Criteria) this;
        }

        public Criteria andProNoEqualTo(String value) {
            addCriterion("pro_no =", value, "proNo");
            return (Criteria) this;
        }

        public Criteria andProNoNotEqualTo(String value) {
            addCriterion("pro_no <>", value, "proNo");
            return (Criteria) this;
        }

        public Criteria andProNoGreaterThan(String value) {
            addCriterion("pro_no >", value, "proNo");
            return (Criteria) this;
        }

        public Criteria andProNoGreaterThanOrEqualTo(String value) {
            addCriterion("pro_no >=", value, "proNo");
            return (Criteria) this;
        }

        public Criteria andProNoLessThan(String value) {
            addCriterion("pro_no <", value, "proNo");
            return (Criteria) this;
        }

        public Criteria andProNoLessThanOrEqualTo(String value) {
            addCriterion("pro_no <=", value, "proNo");
            return (Criteria) this;
        }

        public Criteria andProNoLike(String value) {
            addCriterion("pro_no like", value, "proNo");
            return (Criteria) this;
        }

        public Criteria andProNoNotLike(String value) {
            addCriterion("pro_no not like", value, "proNo");
            return (Criteria) this;
        }

        public Criteria andProNoIn(List<String> values) {
            addCriterion("pro_no in", values, "proNo");
            return (Criteria) this;
        }

        public Criteria andProNoNotIn(List<String> values) {
            addCriterion("pro_no not in", values, "proNo");
            return (Criteria) this;
        }

        public Criteria andProNoBetween(String value1, String value2) {
            addCriterion("pro_no between", value1, value2, "proNo");
            return (Criteria) this;
        }

        public Criteria andProNoNotBetween(String value1, String value2) {
            addCriterion("pro_no not between", value1, value2, "proNo");
            return (Criteria) this;
        }

        public Criteria andImgIdIsNull() {
            addCriterion("img_id is null");
            return (Criteria) this;
        }

        public Criteria andImgIdIsNotNull() {
            addCriterion("img_id is not null");
            return (Criteria) this;
        }

        public Criteria andImgIdEqualTo(Integer value) {
            addCriterion("img_id =", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdNotEqualTo(Integer value) {
            addCriterion("img_id <>", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdGreaterThan(Integer value) {
            addCriterion("img_id >", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("img_id >=", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdLessThan(Integer value) {
            addCriterion("img_id <", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdLessThanOrEqualTo(Integer value) {
            addCriterion("img_id <=", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdIn(List<Integer> values) {
            addCriterion("img_id in", values, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdNotIn(List<Integer> values) {
            addCriterion("img_id not in", values, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdBetween(Integer value1, Integer value2) {
            addCriterion("img_id between", value1, value2, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("img_id not between", value1, value2, "imgId");
            return (Criteria) this;
        }

        public Criteria andImg2IdIsNull() {
            addCriterion("img2_id is null");
            return (Criteria) this;
        }

        public Criteria andImg2IdIsNotNull() {
            addCriterion("img2_id is not null");
            return (Criteria) this;
        }

        public Criteria andImg2IdEqualTo(Integer value) {
            addCriterion("img2_id =", value, "img2Id");
            return (Criteria) this;
        }

        public Criteria andImg2IdNotEqualTo(Integer value) {
            addCriterion("img2_id <>", value, "img2Id");
            return (Criteria) this;
        }

        public Criteria andImg2IdGreaterThan(Integer value) {
            addCriterion("img2_id >", value, "img2Id");
            return (Criteria) this;
        }

        public Criteria andImg2IdGreaterThanOrEqualTo(Integer value) {
            addCriterion("img2_id >=", value, "img2Id");
            return (Criteria) this;
        }

        public Criteria andImg2IdLessThan(Integer value) {
            addCriterion("img2_id <", value, "img2Id");
            return (Criteria) this;
        }

        public Criteria andImg2IdLessThanOrEqualTo(Integer value) {
            addCriterion("img2_id <=", value, "img2Id");
            return (Criteria) this;
        }

        public Criteria andImg2IdIn(List<Integer> values) {
            addCriterion("img2_id in", values, "img2Id");
            return (Criteria) this;
        }

        public Criteria andImg2IdNotIn(List<Integer> values) {
            addCriterion("img2_id not in", values, "img2Id");
            return (Criteria) this;
        }

        public Criteria andImg2IdBetween(Integer value1, Integer value2) {
            addCriterion("img2_id between", value1, value2, "img2Id");
            return (Criteria) this;
        }

        public Criteria andImg2IdNotBetween(Integer value1, Integer value2) {
            addCriterion("img2_id not between", value1, value2, "img2Id");
            return (Criteria) this;
        }

        public Criteria andImg1IdIsNull() {
            addCriterion("img1_id is null");
            return (Criteria) this;
        }

        public Criteria andImg1IdIsNotNull() {
            addCriterion("img1_id is not null");
            return (Criteria) this;
        }

        public Criteria andImg1IdEqualTo(Integer value) {
            addCriterion("img1_id =", value, "img1Id");
            return (Criteria) this;
        }

        public Criteria andImg1IdNotEqualTo(Integer value) {
            addCriterion("img1_id <>", value, "img1Id");
            return (Criteria) this;
        }

        public Criteria andImg1IdGreaterThan(Integer value) {
            addCriterion("img1_id >", value, "img1Id");
            return (Criteria) this;
        }

        public Criteria andImg1IdGreaterThanOrEqualTo(Integer value) {
            addCriterion("img1_id >=", value, "img1Id");
            return (Criteria) this;
        }

        public Criteria andImg1IdLessThan(Integer value) {
            addCriterion("img1_id <", value, "img1Id");
            return (Criteria) this;
        }

        public Criteria andImg1IdLessThanOrEqualTo(Integer value) {
            addCriterion("img1_id <=", value, "img1Id");
            return (Criteria) this;
        }

        public Criteria andImg1IdIn(List<Integer> values) {
            addCriterion("img1_id in", values, "img1Id");
            return (Criteria) this;
        }

        public Criteria andImg1IdNotIn(List<Integer> values) {
            addCriterion("img1_id not in", values, "img1Id");
            return (Criteria) this;
        }

        public Criteria andImg1IdBetween(Integer value1, Integer value2) {
            addCriterion("img1_id between", value1, value2, "img1Id");
            return (Criteria) this;
        }

        public Criteria andImg1IdNotBetween(Integer value1, Integer value2) {
            addCriterion("img1_id not between", value1, value2, "img1Id");
            return (Criteria) this;
        }

        public Criteria andImg3IdIsNull() {
            addCriterion("img3_id is null");
            return (Criteria) this;
        }

        public Criteria andImg3IdIsNotNull() {
            addCriterion("img3_id is not null");
            return (Criteria) this;
        }

        public Criteria andImg3IdEqualTo(Integer value) {
            addCriterion("img3_id =", value, "img3Id");
            return (Criteria) this;
        }

        public Criteria andImg3IdNotEqualTo(Integer value) {
            addCriterion("img3_id <>", value, "img3Id");
            return (Criteria) this;
        }

        public Criteria andImg3IdGreaterThan(Integer value) {
            addCriterion("img3_id >", value, "img3Id");
            return (Criteria) this;
        }

        public Criteria andImg3IdGreaterThanOrEqualTo(Integer value) {
            addCriterion("img3_id >=", value, "img3Id");
            return (Criteria) this;
        }

        public Criteria andImg3IdLessThan(Integer value) {
            addCriterion("img3_id <", value, "img3Id");
            return (Criteria) this;
        }

        public Criteria andImg3IdLessThanOrEqualTo(Integer value) {
            addCriterion("img3_id <=", value, "img3Id");
            return (Criteria) this;
        }

        public Criteria andImg3IdIn(List<Integer> values) {
            addCriterion("img3_id in", values, "img3Id");
            return (Criteria) this;
        }

        public Criteria andImg3IdNotIn(List<Integer> values) {
            addCriterion("img3_id not in", values, "img3Id");
            return (Criteria) this;
        }

        public Criteria andImg3IdBetween(Integer value1, Integer value2) {
            addCriterion("img3_id between", value1, value2, "img3Id");
            return (Criteria) this;
        }

        public Criteria andImg3IdNotBetween(Integer value1, Integer value2) {
            addCriterion("img3_id not between", value1, value2, "img3Id");
            return (Criteria) this;
        }

        public Criteria andImg4IdIsNull() {
            addCriterion("img4_id is null");
            return (Criteria) this;
        }

        public Criteria andImg4IdIsNotNull() {
            addCriterion("img4_id is not null");
            return (Criteria) this;
        }

        public Criteria andImg4IdEqualTo(Integer value) {
            addCriterion("img4_id =", value, "img4Id");
            return (Criteria) this;
        }

        public Criteria andImg4IdNotEqualTo(Integer value) {
            addCriterion("img4_id <>", value, "img4Id");
            return (Criteria) this;
        }

        public Criteria andImg4IdGreaterThan(Integer value) {
            addCriterion("img4_id >", value, "img4Id");
            return (Criteria) this;
        }

        public Criteria andImg4IdGreaterThanOrEqualTo(Integer value) {
            addCriterion("img4_id >=", value, "img4Id");
            return (Criteria) this;
        }

        public Criteria andImg4IdLessThan(Integer value) {
            addCriterion("img4_id <", value, "img4Id");
            return (Criteria) this;
        }

        public Criteria andImg4IdLessThanOrEqualTo(Integer value) {
            addCriterion("img4_id <=", value, "img4Id");
            return (Criteria) this;
        }

        public Criteria andImg4IdIn(List<Integer> values) {
            addCriterion("img4_id in", values, "img4Id");
            return (Criteria) this;
        }

        public Criteria andImg4IdNotIn(List<Integer> values) {
            addCriterion("img4_id not in", values, "img4Id");
            return (Criteria) this;
        }

        public Criteria andImg4IdBetween(Integer value1, Integer value2) {
            addCriterion("img4_id between", value1, value2, "img4Id");
            return (Criteria) this;
        }

        public Criteria andImg4IdNotBetween(Integer value1, Integer value2) {
            addCriterion("img4_id not between", value1, value2, "img4Id");
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