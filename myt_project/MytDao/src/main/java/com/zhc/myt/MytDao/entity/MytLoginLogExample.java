package com.zhc.myt.MytDao.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MytLoginLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public MytLoginLogExample() {
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

        public Criteria andExplorerNameIsNull() {
            addCriterion("explorer_name is null");
            return (Criteria) this;
        }

        public Criteria andExplorerNameIsNotNull() {
            addCriterion("explorer_name is not null");
            return (Criteria) this;
        }

        public Criteria andExplorerNameEqualTo(String value) {
            addCriterion("explorer_name =", value, "explorerName");
            return (Criteria) this;
        }

        public Criteria andExplorerNameNotEqualTo(String value) {
            addCriterion("explorer_name <>", value, "explorerName");
            return (Criteria) this;
        }

        public Criteria andExplorerNameGreaterThan(String value) {
            addCriterion("explorer_name >", value, "explorerName");
            return (Criteria) this;
        }

        public Criteria andExplorerNameGreaterThanOrEqualTo(String value) {
            addCriterion("explorer_name >=", value, "explorerName");
            return (Criteria) this;
        }

        public Criteria andExplorerNameLessThan(String value) {
            addCriterion("explorer_name <", value, "explorerName");
            return (Criteria) this;
        }

        public Criteria andExplorerNameLessThanOrEqualTo(String value) {
            addCriterion("explorer_name <=", value, "explorerName");
            return (Criteria) this;
        }

        public Criteria andExplorerNameLike(String value) {
            addCriterion("explorer_name like", value, "explorerName");
            return (Criteria) this;
        }

        public Criteria andExplorerNameNotLike(String value) {
            addCriterion("explorer_name not like", value, "explorerName");
            return (Criteria) this;
        }

        public Criteria andExplorerNameIn(List<String> values) {
            addCriterion("explorer_name in", values, "explorerName");
            return (Criteria) this;
        }

        public Criteria andExplorerNameNotIn(List<String> values) {
            addCriterion("explorer_name not in", values, "explorerName");
            return (Criteria) this;
        }

        public Criteria andExplorerNameBetween(String value1, String value2) {
            addCriterion("explorer_name between", value1, value2, "explorerName");
            return (Criteria) this;
        }

        public Criteria andExplorerNameNotBetween(String value1, String value2) {
            addCriterion("explorer_name not between", value1, value2, "explorerName");
            return (Criteria) this;
        }

        public Criteria andExplorerVerIsNull() {
            addCriterion("explorer_ver is null");
            return (Criteria) this;
        }

        public Criteria andExplorerVerIsNotNull() {
            addCriterion("explorer_ver is not null");
            return (Criteria) this;
        }

        public Criteria andExplorerVerEqualTo(String value) {
            addCriterion("explorer_ver =", value, "explorerVer");
            return (Criteria) this;
        }

        public Criteria andExplorerVerNotEqualTo(String value) {
            addCriterion("explorer_ver <>", value, "explorerVer");
            return (Criteria) this;
        }

        public Criteria andExplorerVerGreaterThan(String value) {
            addCriterion("explorer_ver >", value, "explorerVer");
            return (Criteria) this;
        }

        public Criteria andExplorerVerGreaterThanOrEqualTo(String value) {
            addCriterion("explorer_ver >=", value, "explorerVer");
            return (Criteria) this;
        }

        public Criteria andExplorerVerLessThan(String value) {
            addCriterion("explorer_ver <", value, "explorerVer");
            return (Criteria) this;
        }

        public Criteria andExplorerVerLessThanOrEqualTo(String value) {
            addCriterion("explorer_ver <=", value, "explorerVer");
            return (Criteria) this;
        }

        public Criteria andExplorerVerLike(String value) {
            addCriterion("explorer_ver like", value, "explorerVer");
            return (Criteria) this;
        }

        public Criteria andExplorerVerNotLike(String value) {
            addCriterion("explorer_ver not like", value, "explorerVer");
            return (Criteria) this;
        }

        public Criteria andExplorerVerIn(List<String> values) {
            addCriterion("explorer_ver in", values, "explorerVer");
            return (Criteria) this;
        }

        public Criteria andExplorerVerNotIn(List<String> values) {
            addCriterion("explorer_ver not in", values, "explorerVer");
            return (Criteria) this;
        }

        public Criteria andExplorerVerBetween(String value1, String value2) {
            addCriterion("explorer_ver between", value1, value2, "explorerVer");
            return (Criteria) this;
        }

        public Criteria andExplorerVerNotBetween(String value1, String value2) {
            addCriterion("explorer_ver not between", value1, value2, "explorerVer");
            return (Criteria) this;
        }

        public Criteria andExplorerPlugIsNull() {
            addCriterion("explorer_plug is null");
            return (Criteria) this;
        }

        public Criteria andExplorerPlugIsNotNull() {
            addCriterion("explorer_plug is not null");
            return (Criteria) this;
        }

        public Criteria andExplorerPlugEqualTo(String value) {
            addCriterion("explorer_plug =", value, "explorerPlug");
            return (Criteria) this;
        }

        public Criteria andExplorerPlugNotEqualTo(String value) {
            addCriterion("explorer_plug <>", value, "explorerPlug");
            return (Criteria) this;
        }

        public Criteria andExplorerPlugGreaterThan(String value) {
            addCriterion("explorer_plug >", value, "explorerPlug");
            return (Criteria) this;
        }

        public Criteria andExplorerPlugGreaterThanOrEqualTo(String value) {
            addCriterion("explorer_plug >=", value, "explorerPlug");
            return (Criteria) this;
        }

        public Criteria andExplorerPlugLessThan(String value) {
            addCriterion("explorer_plug <", value, "explorerPlug");
            return (Criteria) this;
        }

        public Criteria andExplorerPlugLessThanOrEqualTo(String value) {
            addCriterion("explorer_plug <=", value, "explorerPlug");
            return (Criteria) this;
        }

        public Criteria andExplorerPlugLike(String value) {
            addCriterion("explorer_plug like", value, "explorerPlug");
            return (Criteria) this;
        }

        public Criteria andExplorerPlugNotLike(String value) {
            addCriterion("explorer_plug not like", value, "explorerPlug");
            return (Criteria) this;
        }

        public Criteria andExplorerPlugIn(List<String> values) {
            addCriterion("explorer_plug in", values, "explorerPlug");
            return (Criteria) this;
        }

        public Criteria andExplorerPlugNotIn(List<String> values) {
            addCriterion("explorer_plug not in", values, "explorerPlug");
            return (Criteria) this;
        }

        public Criteria andExplorerPlugBetween(String value1, String value2) {
            addCriterion("explorer_plug between", value1, value2, "explorerPlug");
            return (Criteria) this;
        }

        public Criteria andExplorerPlugNotBetween(String value1, String value2) {
            addCriterion("explorer_plug not between", value1, value2, "explorerPlug");
            return (Criteria) this;
        }

        public Criteria andOsNameIsNull() {
            addCriterion("os_name is null");
            return (Criteria) this;
        }

        public Criteria andOsNameIsNotNull() {
            addCriterion("os_name is not null");
            return (Criteria) this;
        }

        public Criteria andOsNameEqualTo(String value) {
            addCriterion("os_name =", value, "osName");
            return (Criteria) this;
        }

        public Criteria andOsNameNotEqualTo(String value) {
            addCriterion("os_name <>", value, "osName");
            return (Criteria) this;
        }

        public Criteria andOsNameGreaterThan(String value) {
            addCriterion("os_name >", value, "osName");
            return (Criteria) this;
        }

        public Criteria andOsNameGreaterThanOrEqualTo(String value) {
            addCriterion("os_name >=", value, "osName");
            return (Criteria) this;
        }

        public Criteria andOsNameLessThan(String value) {
            addCriterion("os_name <", value, "osName");
            return (Criteria) this;
        }

        public Criteria andOsNameLessThanOrEqualTo(String value) {
            addCriterion("os_name <=", value, "osName");
            return (Criteria) this;
        }

        public Criteria andOsNameLike(String value) {
            addCriterion("os_name like", value, "osName");
            return (Criteria) this;
        }

        public Criteria andOsNameNotLike(String value) {
            addCriterion("os_name not like", value, "osName");
            return (Criteria) this;
        }

        public Criteria andOsNameIn(List<String> values) {
            addCriterion("os_name in", values, "osName");
            return (Criteria) this;
        }

        public Criteria andOsNameNotIn(List<String> values) {
            addCriterion("os_name not in", values, "osName");
            return (Criteria) this;
        }

        public Criteria andOsNameBetween(String value1, String value2) {
            addCriterion("os_name between", value1, value2, "osName");
            return (Criteria) this;
        }

        public Criteria andOsNameNotBetween(String value1, String value2) {
            addCriterion("os_name not between", value1, value2, "osName");
            return (Criteria) this;
        }

        public Criteria andAboutIsNull() {
            addCriterion("about is null");
            return (Criteria) this;
        }

        public Criteria andAboutIsNotNull() {
            addCriterion("about is not null");
            return (Criteria) this;
        }

        public Criteria andAboutEqualTo(String value) {
            addCriterion("about =", value, "about");
            return (Criteria) this;
        }

        public Criteria andAboutNotEqualTo(String value) {
            addCriterion("about <>", value, "about");
            return (Criteria) this;
        }

        public Criteria andAboutGreaterThan(String value) {
            addCriterion("about >", value, "about");
            return (Criteria) this;
        }

        public Criteria andAboutGreaterThanOrEqualTo(String value) {
            addCriterion("about >=", value, "about");
            return (Criteria) this;
        }

        public Criteria andAboutLessThan(String value) {
            addCriterion("about <", value, "about");
            return (Criteria) this;
        }

        public Criteria andAboutLessThanOrEqualTo(String value) {
            addCriterion("about <=", value, "about");
            return (Criteria) this;
        }

        public Criteria andAboutLike(String value) {
            addCriterion("about like", value, "about");
            return (Criteria) this;
        }

        public Criteria andAboutNotLike(String value) {
            addCriterion("about not like", value, "about");
            return (Criteria) this;
        }

        public Criteria andAboutIn(List<String> values) {
            addCriterion("about in", values, "about");
            return (Criteria) this;
        }

        public Criteria andAboutNotIn(List<String> values) {
            addCriterion("about not in", values, "about");
            return (Criteria) this;
        }

        public Criteria andAboutBetween(String value1, String value2) {
            addCriterion("about between", value1, value2, "about");
            return (Criteria) this;
        }

        public Criteria andAboutNotBetween(String value1, String value2) {
            addCriterion("about not between", value1, value2, "about");
            return (Criteria) this;
        }

        public Criteria andClientIpIsNull() {
            addCriterion("client_ip is null");
            return (Criteria) this;
        }

        public Criteria andClientIpIsNotNull() {
            addCriterion("client_ip is not null");
            return (Criteria) this;
        }

        public Criteria andClientIpEqualTo(String value) {
            addCriterion("client_ip =", value, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpNotEqualTo(String value) {
            addCriterion("client_ip <>", value, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpGreaterThan(String value) {
            addCriterion("client_ip >", value, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpGreaterThanOrEqualTo(String value) {
            addCriterion("client_ip >=", value, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpLessThan(String value) {
            addCriterion("client_ip <", value, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpLessThanOrEqualTo(String value) {
            addCriterion("client_ip <=", value, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpLike(String value) {
            addCriterion("client_ip like", value, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpNotLike(String value) {
            addCriterion("client_ip not like", value, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpIn(List<String> values) {
            addCriterion("client_ip in", values, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpNotIn(List<String> values) {
            addCriterion("client_ip not in", values, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpBetween(String value1, String value2) {
            addCriterion("client_ip between", value1, value2, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpNotBetween(String value1, String value2) {
            addCriterion("client_ip not between", value1, value2, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientNameIsNull() {
            addCriterion("client_name is null");
            return (Criteria) this;
        }

        public Criteria andClientNameIsNotNull() {
            addCriterion("client_name is not null");
            return (Criteria) this;
        }

        public Criteria andClientNameEqualTo(String value) {
            addCriterion("client_name =", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameNotEqualTo(String value) {
            addCriterion("client_name <>", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameGreaterThan(String value) {
            addCriterion("client_name >", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameGreaterThanOrEqualTo(String value) {
            addCriterion("client_name >=", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameLessThan(String value) {
            addCriterion("client_name <", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameLessThanOrEqualTo(String value) {
            addCriterion("client_name <=", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameLike(String value) {
            addCriterion("client_name like", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameNotLike(String value) {
            addCriterion("client_name not like", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameIn(List<String> values) {
            addCriterion("client_name in", values, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameNotIn(List<String> values) {
            addCriterion("client_name not in", values, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameBetween(String value1, String value2) {
            addCriterion("client_name between", value1, value2, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameNotBetween(String value1, String value2) {
            addCriterion("client_name not between", value1, value2, "clientName");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
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