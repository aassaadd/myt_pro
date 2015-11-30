package com.zhc.myt.MytDao.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MytAppModuleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public MytAppModuleExample() {
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

        public Criteria andAppIdIsNull() {
            addCriterion("app_id is null");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNotNull() {
            addCriterion("app_id is not null");
            return (Criteria) this;
        }

        public Criteria andAppIdEqualTo(Integer value) {
            addCriterion("app_id =", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotEqualTo(Integer value) {
            addCriterion("app_id <>", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThan(Integer value) {
            addCriterion("app_id >", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("app_id >=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThan(Integer value) {
            addCriterion("app_id <", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThanOrEqualTo(Integer value) {
            addCriterion("app_id <=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdIn(List<Integer> values) {
            addCriterion("app_id in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotIn(List<Integer> values) {
            addCriterion("app_id not in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdBetween(Integer value1, Integer value2) {
            addCriterion("app_id between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotBetween(Integer value1, Integer value2) {
            addCriterion("app_id not between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andModNameIsNull() {
            addCriterion("mod_name is null");
            return (Criteria) this;
        }

        public Criteria andModNameIsNotNull() {
            addCriterion("mod_name is not null");
            return (Criteria) this;
        }

        public Criteria andModNameEqualTo(String value) {
            addCriterion("mod_name =", value, "modName");
            return (Criteria) this;
        }

        public Criteria andModNameNotEqualTo(String value) {
            addCriterion("mod_name <>", value, "modName");
            return (Criteria) this;
        }

        public Criteria andModNameGreaterThan(String value) {
            addCriterion("mod_name >", value, "modName");
            return (Criteria) this;
        }

        public Criteria andModNameGreaterThanOrEqualTo(String value) {
            addCriterion("mod_name >=", value, "modName");
            return (Criteria) this;
        }

        public Criteria andModNameLessThan(String value) {
            addCriterion("mod_name <", value, "modName");
            return (Criteria) this;
        }

        public Criteria andModNameLessThanOrEqualTo(String value) {
            addCriterion("mod_name <=", value, "modName");
            return (Criteria) this;
        }

        public Criteria andModNameLike(String value) {
            addCriterion("mod_name like", value, "modName");
            return (Criteria) this;
        }

        public Criteria andModNameNotLike(String value) {
            addCriterion("mod_name not like", value, "modName");
            return (Criteria) this;
        }

        public Criteria andModNameIn(List<String> values) {
            addCriterion("mod_name in", values, "modName");
            return (Criteria) this;
        }

        public Criteria andModNameNotIn(List<String> values) {
            addCriterion("mod_name not in", values, "modName");
            return (Criteria) this;
        }

        public Criteria andModNameBetween(String value1, String value2) {
            addCriterion("mod_name between", value1, value2, "modName");
            return (Criteria) this;
        }

        public Criteria andModNameNotBetween(String value1, String value2) {
            addCriterion("mod_name not between", value1, value2, "modName");
            return (Criteria) this;
        }

        public Criteria andModUrlIsNull() {
            addCriterion("mod_url is null");
            return (Criteria) this;
        }

        public Criteria andModUrlIsNotNull() {
            addCriterion("mod_url is not null");
            return (Criteria) this;
        }

        public Criteria andModUrlEqualTo(String value) {
            addCriterion("mod_url =", value, "modUrl");
            return (Criteria) this;
        }

        public Criteria andModUrlNotEqualTo(String value) {
            addCriterion("mod_url <>", value, "modUrl");
            return (Criteria) this;
        }

        public Criteria andModUrlGreaterThan(String value) {
            addCriterion("mod_url >", value, "modUrl");
            return (Criteria) this;
        }

        public Criteria andModUrlGreaterThanOrEqualTo(String value) {
            addCriterion("mod_url >=", value, "modUrl");
            return (Criteria) this;
        }

        public Criteria andModUrlLessThan(String value) {
            addCriterion("mod_url <", value, "modUrl");
            return (Criteria) this;
        }

        public Criteria andModUrlLessThanOrEqualTo(String value) {
            addCriterion("mod_url <=", value, "modUrl");
            return (Criteria) this;
        }

        public Criteria andModUrlLike(String value) {
            addCriterion("mod_url like", value, "modUrl");
            return (Criteria) this;
        }

        public Criteria andModUrlNotLike(String value) {
            addCriterion("mod_url not like", value, "modUrl");
            return (Criteria) this;
        }

        public Criteria andModUrlIn(List<String> values) {
            addCriterion("mod_url in", values, "modUrl");
            return (Criteria) this;
        }

        public Criteria andModUrlNotIn(List<String> values) {
            addCriterion("mod_url not in", values, "modUrl");
            return (Criteria) this;
        }

        public Criteria andModUrlBetween(String value1, String value2) {
            addCriterion("mod_url between", value1, value2, "modUrl");
            return (Criteria) this;
        }

        public Criteria andModUrlNotBetween(String value1, String value2) {
            addCriterion("mod_url not between", value1, value2, "modUrl");
            return (Criteria) this;
        }

        public Criteria andModNoIsNull() {
            addCriterion("mod_no is null");
            return (Criteria) this;
        }

        public Criteria andModNoIsNotNull() {
            addCriterion("mod_no is not null");
            return (Criteria) this;
        }

        public Criteria andModNoEqualTo(String value) {
            addCriterion("mod_no =", value, "modNo");
            return (Criteria) this;
        }

        public Criteria andModNoNotEqualTo(String value) {
            addCriterion("mod_no <>", value, "modNo");
            return (Criteria) this;
        }

        public Criteria andModNoGreaterThan(String value) {
            addCriterion("mod_no >", value, "modNo");
            return (Criteria) this;
        }

        public Criteria andModNoGreaterThanOrEqualTo(String value) {
            addCriterion("mod_no >=", value, "modNo");
            return (Criteria) this;
        }

        public Criteria andModNoLessThan(String value) {
            addCriterion("mod_no <", value, "modNo");
            return (Criteria) this;
        }

        public Criteria andModNoLessThanOrEqualTo(String value) {
            addCriterion("mod_no <=", value, "modNo");
            return (Criteria) this;
        }

        public Criteria andModNoLike(String value) {
            addCriterion("mod_no like", value, "modNo");
            return (Criteria) this;
        }

        public Criteria andModNoNotLike(String value) {
            addCriterion("mod_no not like", value, "modNo");
            return (Criteria) this;
        }

        public Criteria andModNoIn(List<String> values) {
            addCriterion("mod_no in", values, "modNo");
            return (Criteria) this;
        }

        public Criteria andModNoNotIn(List<String> values) {
            addCriterion("mod_no not in", values, "modNo");
            return (Criteria) this;
        }

        public Criteria andModNoBetween(String value1, String value2) {
            addCriterion("mod_no between", value1, value2, "modNo");
            return (Criteria) this;
        }

        public Criteria andModNoNotBetween(String value1, String value2) {
            addCriterion("mod_no not between", value1, value2, "modNo");
            return (Criteria) this;
        }

        public Criteria andModAboutIsNull() {
            addCriterion("mod_about is null");
            return (Criteria) this;
        }

        public Criteria andModAboutIsNotNull() {
            addCriterion("mod_about is not null");
            return (Criteria) this;
        }

        public Criteria andModAboutEqualTo(String value) {
            addCriterion("mod_about =", value, "modAbout");
            return (Criteria) this;
        }

        public Criteria andModAboutNotEqualTo(String value) {
            addCriterion("mod_about <>", value, "modAbout");
            return (Criteria) this;
        }

        public Criteria andModAboutGreaterThan(String value) {
            addCriterion("mod_about >", value, "modAbout");
            return (Criteria) this;
        }

        public Criteria andModAboutGreaterThanOrEqualTo(String value) {
            addCriterion("mod_about >=", value, "modAbout");
            return (Criteria) this;
        }

        public Criteria andModAboutLessThan(String value) {
            addCriterion("mod_about <", value, "modAbout");
            return (Criteria) this;
        }

        public Criteria andModAboutLessThanOrEqualTo(String value) {
            addCriterion("mod_about <=", value, "modAbout");
            return (Criteria) this;
        }

        public Criteria andModAboutLike(String value) {
            addCriterion("mod_about like", value, "modAbout");
            return (Criteria) this;
        }

        public Criteria andModAboutNotLike(String value) {
            addCriterion("mod_about not like", value, "modAbout");
            return (Criteria) this;
        }

        public Criteria andModAboutIn(List<String> values) {
            addCriterion("mod_about in", values, "modAbout");
            return (Criteria) this;
        }

        public Criteria andModAboutNotIn(List<String> values) {
            addCriterion("mod_about not in", values, "modAbout");
            return (Criteria) this;
        }

        public Criteria andModAboutBetween(String value1, String value2) {
            addCriterion("mod_about between", value1, value2, "modAbout");
            return (Criteria) this;
        }

        public Criteria andModAboutNotBetween(String value1, String value2) {
            addCriterion("mod_about not between", value1, value2, "modAbout");
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

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sort not between", value1, value2, "sort");
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