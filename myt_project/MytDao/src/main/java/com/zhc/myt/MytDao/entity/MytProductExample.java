package com.zhc.myt.MytDao.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MytProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public MytProductExample() {
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

        public Criteria andMchIdIsNull() {
            addCriterion("mch_id is null");
            return (Criteria) this;
        }

        public Criteria andMchIdIsNotNull() {
            addCriterion("mch_id is not null");
            return (Criteria) this;
        }

        public Criteria andMchIdEqualTo(Integer value) {
            addCriterion("mch_id =", value, "mchId");
            return (Criteria) this;
        }

        public Criteria andMchIdNotEqualTo(Integer value) {
            addCriterion("mch_id <>", value, "mchId");
            return (Criteria) this;
        }

        public Criteria andMchIdGreaterThan(Integer value) {
            addCriterion("mch_id >", value, "mchId");
            return (Criteria) this;
        }

        public Criteria andMchIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("mch_id >=", value, "mchId");
            return (Criteria) this;
        }

        public Criteria andMchIdLessThan(Integer value) {
            addCriterion("mch_id <", value, "mchId");
            return (Criteria) this;
        }

        public Criteria andMchIdLessThanOrEqualTo(Integer value) {
            addCriterion("mch_id <=", value, "mchId");
            return (Criteria) this;
        }

        public Criteria andMchIdIn(List<Integer> values) {
            addCriterion("mch_id in", values, "mchId");
            return (Criteria) this;
        }

        public Criteria andMchIdNotIn(List<Integer> values) {
            addCriterion("mch_id not in", values, "mchId");
            return (Criteria) this;
        }

        public Criteria andMchIdBetween(Integer value1, Integer value2) {
            addCriterion("mch_id between", value1, value2, "mchId");
            return (Criteria) this;
        }

        public Criteria andMchIdNotBetween(Integer value1, Integer value2) {
            addCriterion("mch_id not between", value1, value2, "mchId");
            return (Criteria) this;
        }

        public Criteria andProcIdIsNull() {
            addCriterion("proc_id is null");
            return (Criteria) this;
        }

        public Criteria andProcIdIsNotNull() {
            addCriterion("proc_id is not null");
            return (Criteria) this;
        }

        public Criteria andProcIdEqualTo(Integer value) {
            addCriterion("proc_id =", value, "procId");
            return (Criteria) this;
        }

        public Criteria andProcIdNotEqualTo(Integer value) {
            addCriterion("proc_id <>", value, "procId");
            return (Criteria) this;
        }

        public Criteria andProcIdGreaterThan(Integer value) {
            addCriterion("proc_id >", value, "procId");
            return (Criteria) this;
        }

        public Criteria andProcIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("proc_id >=", value, "procId");
            return (Criteria) this;
        }

        public Criteria andProcIdLessThan(Integer value) {
            addCriterion("proc_id <", value, "procId");
            return (Criteria) this;
        }

        public Criteria andProcIdLessThanOrEqualTo(Integer value) {
            addCriterion("proc_id <=", value, "procId");
            return (Criteria) this;
        }

        public Criteria andProcIdIn(List<Integer> values) {
            addCriterion("proc_id in", values, "procId");
            return (Criteria) this;
        }

        public Criteria andProcIdNotIn(List<Integer> values) {
            addCriterion("proc_id not in", values, "procId");
            return (Criteria) this;
        }

        public Criteria andProcIdBetween(Integer value1, Integer value2) {
            addCriterion("proc_id between", value1, value2, "procId");
            return (Criteria) this;
        }

        public Criteria andProcIdNotBetween(Integer value1, Integer value2) {
            addCriterion("proc_id not between", value1, value2, "procId");
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

        public Criteria andProNameIsNull() {
            addCriterion("pro_name is null");
            return (Criteria) this;
        }

        public Criteria andProNameIsNotNull() {
            addCriterion("pro_name is not null");
            return (Criteria) this;
        }

        public Criteria andProNameEqualTo(String value) {
            addCriterion("pro_name =", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotEqualTo(String value) {
            addCriterion("pro_name <>", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameGreaterThan(String value) {
            addCriterion("pro_name >", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameGreaterThanOrEqualTo(String value) {
            addCriterion("pro_name >=", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameLessThan(String value) {
            addCriterion("pro_name <", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameLessThanOrEqualTo(String value) {
            addCriterion("pro_name <=", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameLike(String value) {
            addCriterion("pro_name like", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotLike(String value) {
            addCriterion("pro_name not like", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameIn(List<String> values) {
            addCriterion("pro_name in", values, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotIn(List<String> values) {
            addCriterion("pro_name not in", values, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameBetween(String value1, String value2) {
            addCriterion("pro_name between", value1, value2, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotBetween(String value1, String value2) {
            addCriterion("pro_name not between", value1, value2, "proName");
            return (Criteria) this;
        }

        public Criteria andProDescriptionIsNull() {
            addCriterion("pro_description is null");
            return (Criteria) this;
        }

        public Criteria andProDescriptionIsNotNull() {
            addCriterion("pro_description is not null");
            return (Criteria) this;
        }

        public Criteria andProDescriptionEqualTo(String value) {
            addCriterion("pro_description =", value, "proDescription");
            return (Criteria) this;
        }

        public Criteria andProDescriptionNotEqualTo(String value) {
            addCriterion("pro_description <>", value, "proDescription");
            return (Criteria) this;
        }

        public Criteria andProDescriptionGreaterThan(String value) {
            addCriterion("pro_description >", value, "proDescription");
            return (Criteria) this;
        }

        public Criteria andProDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("pro_description >=", value, "proDescription");
            return (Criteria) this;
        }

        public Criteria andProDescriptionLessThan(String value) {
            addCriterion("pro_description <", value, "proDescription");
            return (Criteria) this;
        }

        public Criteria andProDescriptionLessThanOrEqualTo(String value) {
            addCriterion("pro_description <=", value, "proDescription");
            return (Criteria) this;
        }

        public Criteria andProDescriptionLike(String value) {
            addCriterion("pro_description like", value, "proDescription");
            return (Criteria) this;
        }

        public Criteria andProDescriptionNotLike(String value) {
            addCriterion("pro_description not like", value, "proDescription");
            return (Criteria) this;
        }

        public Criteria andProDescriptionIn(List<String> values) {
            addCriterion("pro_description in", values, "proDescription");
            return (Criteria) this;
        }

        public Criteria andProDescriptionNotIn(List<String> values) {
            addCriterion("pro_description not in", values, "proDescription");
            return (Criteria) this;
        }

        public Criteria andProDescriptionBetween(String value1, String value2) {
            addCriterion("pro_description between", value1, value2, "proDescription");
            return (Criteria) this;
        }

        public Criteria andProDescriptionNotBetween(String value1, String value2) {
            addCriterion("pro_description not between", value1, value2, "proDescription");
            return (Criteria) this;
        }

        public Criteria andProCountIsNull() {
            addCriterion("pro_count is null");
            return (Criteria) this;
        }

        public Criteria andProCountIsNotNull() {
            addCriterion("pro_count is not null");
            return (Criteria) this;
        }

        public Criteria andProCountEqualTo(Integer value) {
            addCriterion("pro_count =", value, "proCount");
            return (Criteria) this;
        }

        public Criteria andProCountNotEqualTo(Integer value) {
            addCriterion("pro_count <>", value, "proCount");
            return (Criteria) this;
        }

        public Criteria andProCountGreaterThan(Integer value) {
            addCriterion("pro_count >", value, "proCount");
            return (Criteria) this;
        }

        public Criteria andProCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("pro_count >=", value, "proCount");
            return (Criteria) this;
        }

        public Criteria andProCountLessThan(Integer value) {
            addCriterion("pro_count <", value, "proCount");
            return (Criteria) this;
        }

        public Criteria andProCountLessThanOrEqualTo(Integer value) {
            addCriterion("pro_count <=", value, "proCount");
            return (Criteria) this;
        }

        public Criteria andProCountIn(List<Integer> values) {
            addCriterion("pro_count in", values, "proCount");
            return (Criteria) this;
        }

        public Criteria andProCountNotIn(List<Integer> values) {
            addCriterion("pro_count not in", values, "proCount");
            return (Criteria) this;
        }

        public Criteria andProCountBetween(Integer value1, Integer value2) {
            addCriterion("pro_count between", value1, value2, "proCount");
            return (Criteria) this;
        }

        public Criteria andProCountNotBetween(Integer value1, Integer value2) {
            addCriterion("pro_count not between", value1, value2, "proCount");
            return (Criteria) this;
        }

        public Criteria andProSoldCountIsNull() {
            addCriterion("pro_sold_count is null");
            return (Criteria) this;
        }

        public Criteria andProSoldCountIsNotNull() {
            addCriterion("pro_sold_count is not null");
            return (Criteria) this;
        }

        public Criteria andProSoldCountEqualTo(Integer value) {
            addCriterion("pro_sold_count =", value, "proSoldCount");
            return (Criteria) this;
        }

        public Criteria andProSoldCountNotEqualTo(Integer value) {
            addCriterion("pro_sold_count <>", value, "proSoldCount");
            return (Criteria) this;
        }

        public Criteria andProSoldCountGreaterThan(Integer value) {
            addCriterion("pro_sold_count >", value, "proSoldCount");
            return (Criteria) this;
        }

        public Criteria andProSoldCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("pro_sold_count >=", value, "proSoldCount");
            return (Criteria) this;
        }

        public Criteria andProSoldCountLessThan(Integer value) {
            addCriterion("pro_sold_count <", value, "proSoldCount");
            return (Criteria) this;
        }

        public Criteria andProSoldCountLessThanOrEqualTo(Integer value) {
            addCriterion("pro_sold_count <=", value, "proSoldCount");
            return (Criteria) this;
        }

        public Criteria andProSoldCountIn(List<Integer> values) {
            addCriterion("pro_sold_count in", values, "proSoldCount");
            return (Criteria) this;
        }

        public Criteria andProSoldCountNotIn(List<Integer> values) {
            addCriterion("pro_sold_count not in", values, "proSoldCount");
            return (Criteria) this;
        }

        public Criteria andProSoldCountBetween(Integer value1, Integer value2) {
            addCriterion("pro_sold_count between", value1, value2, "proSoldCount");
            return (Criteria) this;
        }

        public Criteria andProSoldCountNotBetween(Integer value1, Integer value2) {
            addCriterion("pro_sold_count not between", value1, value2, "proSoldCount");
            return (Criteria) this;
        }

        public Criteria andProAboutIsNull() {
            addCriterion("pro_about is null");
            return (Criteria) this;
        }

        public Criteria andProAboutIsNotNull() {
            addCriterion("pro_about is not null");
            return (Criteria) this;
        }

        public Criteria andProAboutEqualTo(String value) {
            addCriterion("pro_about =", value, "proAbout");
            return (Criteria) this;
        }

        public Criteria andProAboutNotEqualTo(String value) {
            addCriterion("pro_about <>", value, "proAbout");
            return (Criteria) this;
        }

        public Criteria andProAboutGreaterThan(String value) {
            addCriterion("pro_about >", value, "proAbout");
            return (Criteria) this;
        }

        public Criteria andProAboutGreaterThanOrEqualTo(String value) {
            addCriterion("pro_about >=", value, "proAbout");
            return (Criteria) this;
        }

        public Criteria andProAboutLessThan(String value) {
            addCriterion("pro_about <", value, "proAbout");
            return (Criteria) this;
        }

        public Criteria andProAboutLessThanOrEqualTo(String value) {
            addCriterion("pro_about <=", value, "proAbout");
            return (Criteria) this;
        }

        public Criteria andProAboutLike(String value) {
            addCriterion("pro_about like", value, "proAbout");
            return (Criteria) this;
        }

        public Criteria andProAboutNotLike(String value) {
            addCriterion("pro_about not like", value, "proAbout");
            return (Criteria) this;
        }

        public Criteria andProAboutIn(List<String> values) {
            addCriterion("pro_about in", values, "proAbout");
            return (Criteria) this;
        }

        public Criteria andProAboutNotIn(List<String> values) {
            addCriterion("pro_about not in", values, "proAbout");
            return (Criteria) this;
        }

        public Criteria andProAboutBetween(String value1, String value2) {
            addCriterion("pro_about between", value1, value2, "proAbout");
            return (Criteria) this;
        }

        public Criteria andProAboutNotBetween(String value1, String value2) {
            addCriterion("pro_about not between", value1, value2, "proAbout");
            return (Criteria) this;
        }

        public Criteria andProTryPriceIsNull() {
            addCriterion("pro_try_price is null");
            return (Criteria) this;
        }

        public Criteria andProTryPriceIsNotNull() {
            addCriterion("pro_try_price is not null");
            return (Criteria) this;
        }

        public Criteria andProTryPriceEqualTo(Long value) {
            addCriterion("pro_try_price =", value, "proTryPrice");
            return (Criteria) this;
        }

        public Criteria andProTryPriceNotEqualTo(Long value) {
            addCriterion("pro_try_price <>", value, "proTryPrice");
            return (Criteria) this;
        }

        public Criteria andProTryPriceGreaterThan(Long value) {
            addCriterion("pro_try_price >", value, "proTryPrice");
            return (Criteria) this;
        }

        public Criteria andProTryPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("pro_try_price >=", value, "proTryPrice");
            return (Criteria) this;
        }

        public Criteria andProTryPriceLessThan(Long value) {
            addCriterion("pro_try_price <", value, "proTryPrice");
            return (Criteria) this;
        }

        public Criteria andProTryPriceLessThanOrEqualTo(Long value) {
            addCriterion("pro_try_price <=", value, "proTryPrice");
            return (Criteria) this;
        }

        public Criteria andProTryPriceIn(List<Long> values) {
            addCriterion("pro_try_price in", values, "proTryPrice");
            return (Criteria) this;
        }

        public Criteria andProTryPriceNotIn(List<Long> values) {
            addCriterion("pro_try_price not in", values, "proTryPrice");
            return (Criteria) this;
        }

        public Criteria andProTryPriceBetween(Long value1, Long value2) {
            addCriterion("pro_try_price between", value1, value2, "proTryPrice");
            return (Criteria) this;
        }

        public Criteria andProTryPriceNotBetween(Long value1, Long value2) {
            addCriterion("pro_try_price not between", value1, value2, "proTryPrice");
            return (Criteria) this;
        }

        public Criteria andProPriceIsNull() {
            addCriterion("pro_price is null");
            return (Criteria) this;
        }

        public Criteria andProPriceIsNotNull() {
            addCriterion("pro_price is not null");
            return (Criteria) this;
        }

        public Criteria andProPriceEqualTo(Long value) {
            addCriterion("pro_price =", value, "proPrice");
            return (Criteria) this;
        }

        public Criteria andProPriceNotEqualTo(Long value) {
            addCriterion("pro_price <>", value, "proPrice");
            return (Criteria) this;
        }

        public Criteria andProPriceGreaterThan(Long value) {
            addCriterion("pro_price >", value, "proPrice");
            return (Criteria) this;
        }

        public Criteria andProPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("pro_price >=", value, "proPrice");
            return (Criteria) this;
        }

        public Criteria andProPriceLessThan(Long value) {
            addCriterion("pro_price <", value, "proPrice");
            return (Criteria) this;
        }

        public Criteria andProPriceLessThanOrEqualTo(Long value) {
            addCriterion("pro_price <=", value, "proPrice");
            return (Criteria) this;
        }

        public Criteria andProPriceIn(List<Long> values) {
            addCriterion("pro_price in", values, "proPrice");
            return (Criteria) this;
        }

        public Criteria andProPriceNotIn(List<Long> values) {
            addCriterion("pro_price not in", values, "proPrice");
            return (Criteria) this;
        }

        public Criteria andProPriceBetween(Long value1, Long value2) {
            addCriterion("pro_price between", value1, value2, "proPrice");
            return (Criteria) this;
        }

        public Criteria andProPriceNotBetween(Long value1, Long value2) {
            addCriterion("pro_price not between", value1, value2, "proPrice");
            return (Criteria) this;
        }

        public Criteria andProStateIsNull() {
            addCriterion("pro_state is null");
            return (Criteria) this;
        }

        public Criteria andProStateIsNotNull() {
            addCriterion("pro_state is not null");
            return (Criteria) this;
        }

        public Criteria andProStateEqualTo(String value) {
            addCriterion("pro_state =", value, "proState");
            return (Criteria) this;
        }

        public Criteria andProStateNotEqualTo(String value) {
            addCriterion("pro_state <>", value, "proState");
            return (Criteria) this;
        }

        public Criteria andProStateGreaterThan(String value) {
            addCriterion("pro_state >", value, "proState");
            return (Criteria) this;
        }

        public Criteria andProStateGreaterThanOrEqualTo(String value) {
            addCriterion("pro_state >=", value, "proState");
            return (Criteria) this;
        }

        public Criteria andProStateLessThan(String value) {
            addCriterion("pro_state <", value, "proState");
            return (Criteria) this;
        }

        public Criteria andProStateLessThanOrEqualTo(String value) {
            addCriterion("pro_state <=", value, "proState");
            return (Criteria) this;
        }

        public Criteria andProStateLike(String value) {
            addCriterion("pro_state like", value, "proState");
            return (Criteria) this;
        }

        public Criteria andProStateNotLike(String value) {
            addCriterion("pro_state not like", value, "proState");
            return (Criteria) this;
        }

        public Criteria andProStateIn(List<String> values) {
            addCriterion("pro_state in", values, "proState");
            return (Criteria) this;
        }

        public Criteria andProStateNotIn(List<String> values) {
            addCriterion("pro_state not in", values, "proState");
            return (Criteria) this;
        }

        public Criteria andProStateBetween(String value1, String value2) {
            addCriterion("pro_state between", value1, value2, "proState");
            return (Criteria) this;
        }

        public Criteria andProStateNotBetween(String value1, String value2) {
            addCriterion("pro_state not between", value1, value2, "proState");
            return (Criteria) this;
        }

        public Criteria andProOpenDateIsNull() {
            addCriterion("pro_open_date is null");
            return (Criteria) this;
        }

        public Criteria andProOpenDateIsNotNull() {
            addCriterion("pro_open_date is not null");
            return (Criteria) this;
        }

        public Criteria andProOpenDateEqualTo(Date value) {
            addCriterion("pro_open_date =", value, "proOpenDate");
            return (Criteria) this;
        }

        public Criteria andProOpenDateNotEqualTo(Date value) {
            addCriterion("pro_open_date <>", value, "proOpenDate");
            return (Criteria) this;
        }

        public Criteria andProOpenDateGreaterThan(Date value) {
            addCriterion("pro_open_date >", value, "proOpenDate");
            return (Criteria) this;
        }

        public Criteria andProOpenDateGreaterThanOrEqualTo(Date value) {
            addCriterion("pro_open_date >=", value, "proOpenDate");
            return (Criteria) this;
        }

        public Criteria andProOpenDateLessThan(Date value) {
            addCriterion("pro_open_date <", value, "proOpenDate");
            return (Criteria) this;
        }

        public Criteria andProOpenDateLessThanOrEqualTo(Date value) {
            addCriterion("pro_open_date <=", value, "proOpenDate");
            return (Criteria) this;
        }

        public Criteria andProOpenDateIn(List<Date> values) {
            addCriterion("pro_open_date in", values, "proOpenDate");
            return (Criteria) this;
        }

        public Criteria andProOpenDateNotIn(List<Date> values) {
            addCriterion("pro_open_date not in", values, "proOpenDate");
            return (Criteria) this;
        }

        public Criteria andProOpenDateBetween(Date value1, Date value2) {
            addCriterion("pro_open_date between", value1, value2, "proOpenDate");
            return (Criteria) this;
        }

        public Criteria andProOpenDateNotBetween(Date value1, Date value2) {
            addCriterion("pro_open_date not between", value1, value2, "proOpenDate");
            return (Criteria) this;
        }

        public Criteria andProEndDateIsNull() {
            addCriterion("pro_end_date is null");
            return (Criteria) this;
        }

        public Criteria andProEndDateIsNotNull() {
            addCriterion("pro_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andProEndDateEqualTo(Date value) {
            addCriterion("pro_end_date =", value, "proEndDate");
            return (Criteria) this;
        }

        public Criteria andProEndDateNotEqualTo(Date value) {
            addCriterion("pro_end_date <>", value, "proEndDate");
            return (Criteria) this;
        }

        public Criteria andProEndDateGreaterThan(Date value) {
            addCriterion("pro_end_date >", value, "proEndDate");
            return (Criteria) this;
        }

        public Criteria andProEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("pro_end_date >=", value, "proEndDate");
            return (Criteria) this;
        }

        public Criteria andProEndDateLessThan(Date value) {
            addCriterion("pro_end_date <", value, "proEndDate");
            return (Criteria) this;
        }

        public Criteria andProEndDateLessThanOrEqualTo(Date value) {
            addCriterion("pro_end_date <=", value, "proEndDate");
            return (Criteria) this;
        }

        public Criteria andProEndDateIn(List<Date> values) {
            addCriterion("pro_end_date in", values, "proEndDate");
            return (Criteria) this;
        }

        public Criteria andProEndDateNotIn(List<Date> values) {
            addCriterion("pro_end_date not in", values, "proEndDate");
            return (Criteria) this;
        }

        public Criteria andProEndDateBetween(Date value1, Date value2) {
            addCriterion("pro_end_date between", value1, value2, "proEndDate");
            return (Criteria) this;
        }

        public Criteria andProEndDateNotBetween(Date value1, Date value2) {
            addCriterion("pro_end_date not between", value1, value2, "proEndDate");
            return (Criteria) this;
        }

        public Criteria andProTypeIsNull() {
            addCriterion("pro_type is null");
            return (Criteria) this;
        }

        public Criteria andProTypeIsNotNull() {
            addCriterion("pro_type is not null");
            return (Criteria) this;
        }

        public Criteria andProTypeEqualTo(String value) {
            addCriterion("pro_type =", value, "proType");
            return (Criteria) this;
        }

        public Criteria andProTypeNotEqualTo(String value) {
            addCriterion("pro_type <>", value, "proType");
            return (Criteria) this;
        }

        public Criteria andProTypeGreaterThan(String value) {
            addCriterion("pro_type >", value, "proType");
            return (Criteria) this;
        }

        public Criteria andProTypeGreaterThanOrEqualTo(String value) {
            addCriterion("pro_type >=", value, "proType");
            return (Criteria) this;
        }

        public Criteria andProTypeLessThan(String value) {
            addCriterion("pro_type <", value, "proType");
            return (Criteria) this;
        }

        public Criteria andProTypeLessThanOrEqualTo(String value) {
            addCriterion("pro_type <=", value, "proType");
            return (Criteria) this;
        }

        public Criteria andProTypeLike(String value) {
            addCriterion("pro_type like", value, "proType");
            return (Criteria) this;
        }

        public Criteria andProTypeNotLike(String value) {
            addCriterion("pro_type not like", value, "proType");
            return (Criteria) this;
        }

        public Criteria andProTypeIn(List<String> values) {
            addCriterion("pro_type in", values, "proType");
            return (Criteria) this;
        }

        public Criteria andProTypeNotIn(List<String> values) {
            addCriterion("pro_type not in", values, "proType");
            return (Criteria) this;
        }

        public Criteria andProTypeBetween(String value1, String value2) {
            addCriterion("pro_type between", value1, value2, "proType");
            return (Criteria) this;
        }

        public Criteria andProTypeNotBetween(String value1, String value2) {
            addCriterion("pro_type not between", value1, value2, "proType");
            return (Criteria) this;
        }

        public Criteria andProExamineTypeIsNull() {
            addCriterion("pro_examine_type is null");
            return (Criteria) this;
        }

        public Criteria andProExamineTypeIsNotNull() {
            addCriterion("pro_examine_type is not null");
            return (Criteria) this;
        }

        public Criteria andProExamineTypeEqualTo(String value) {
            addCriterion("pro_examine_type =", value, "proExamineType");
            return (Criteria) this;
        }

        public Criteria andProExamineTypeNotEqualTo(String value) {
            addCriterion("pro_examine_type <>", value, "proExamineType");
            return (Criteria) this;
        }

        public Criteria andProExamineTypeGreaterThan(String value) {
            addCriterion("pro_examine_type >", value, "proExamineType");
            return (Criteria) this;
        }

        public Criteria andProExamineTypeGreaterThanOrEqualTo(String value) {
            addCriterion("pro_examine_type >=", value, "proExamineType");
            return (Criteria) this;
        }

        public Criteria andProExamineTypeLessThan(String value) {
            addCriterion("pro_examine_type <", value, "proExamineType");
            return (Criteria) this;
        }

        public Criteria andProExamineTypeLessThanOrEqualTo(String value) {
            addCriterion("pro_examine_type <=", value, "proExamineType");
            return (Criteria) this;
        }

        public Criteria andProExamineTypeLike(String value) {
            addCriterion("pro_examine_type like", value, "proExamineType");
            return (Criteria) this;
        }

        public Criteria andProExamineTypeNotLike(String value) {
            addCriterion("pro_examine_type not like", value, "proExamineType");
            return (Criteria) this;
        }

        public Criteria andProExamineTypeIn(List<String> values) {
            addCriterion("pro_examine_type in", values, "proExamineType");
            return (Criteria) this;
        }

        public Criteria andProExamineTypeNotIn(List<String> values) {
            addCriterion("pro_examine_type not in", values, "proExamineType");
            return (Criteria) this;
        }

        public Criteria andProExamineTypeBetween(String value1, String value2) {
            addCriterion("pro_examine_type between", value1, value2, "proExamineType");
            return (Criteria) this;
        }

        public Criteria andProExamineTypeNotBetween(String value1, String value2) {
            addCriterion("pro_examine_type not between", value1, value2, "proExamineType");
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