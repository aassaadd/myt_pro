package com.zhc.myt.MytDao.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MytCustomerServiceLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public MytCustomerServiceLogExample() {
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

        public Criteria andCslNoIsNull() {
            addCriterion("csl_no is null");
            return (Criteria) this;
        }

        public Criteria andCslNoIsNotNull() {
            addCriterion("csl_no is not null");
            return (Criteria) this;
        }

        public Criteria andCslNoEqualTo(String value) {
            addCriterion("csl_no =", value, "cslNo");
            return (Criteria) this;
        }

        public Criteria andCslNoNotEqualTo(String value) {
            addCriterion("csl_no <>", value, "cslNo");
            return (Criteria) this;
        }

        public Criteria andCslNoGreaterThan(String value) {
            addCriterion("csl_no >", value, "cslNo");
            return (Criteria) this;
        }

        public Criteria andCslNoGreaterThanOrEqualTo(String value) {
            addCriterion("csl_no >=", value, "cslNo");
            return (Criteria) this;
        }

        public Criteria andCslNoLessThan(String value) {
            addCriterion("csl_no <", value, "cslNo");
            return (Criteria) this;
        }

        public Criteria andCslNoLessThanOrEqualTo(String value) {
            addCriterion("csl_no <=", value, "cslNo");
            return (Criteria) this;
        }

        public Criteria andCslNoLike(String value) {
            addCriterion("csl_no like", value, "cslNo");
            return (Criteria) this;
        }

        public Criteria andCslNoNotLike(String value) {
            addCriterion("csl_no not like", value, "cslNo");
            return (Criteria) this;
        }

        public Criteria andCslNoIn(List<String> values) {
            addCriterion("csl_no in", values, "cslNo");
            return (Criteria) this;
        }

        public Criteria andCslNoNotIn(List<String> values) {
            addCriterion("csl_no not in", values, "cslNo");
            return (Criteria) this;
        }

        public Criteria andCslNoBetween(String value1, String value2) {
            addCriterion("csl_no between", value1, value2, "cslNo");
            return (Criteria) this;
        }

        public Criteria andCslNoNotBetween(String value1, String value2) {
            addCriterion("csl_no not between", value1, value2, "cslNo");
            return (Criteria) this;
        }

        public Criteria andCslNameIsNull() {
            addCriterion("csl_name is null");
            return (Criteria) this;
        }

        public Criteria andCslNameIsNotNull() {
            addCriterion("csl_name is not null");
            return (Criteria) this;
        }

        public Criteria andCslNameEqualTo(String value) {
            addCriterion("csl_name =", value, "cslName");
            return (Criteria) this;
        }

        public Criteria andCslNameNotEqualTo(String value) {
            addCriterion("csl_name <>", value, "cslName");
            return (Criteria) this;
        }

        public Criteria andCslNameGreaterThan(String value) {
            addCriterion("csl_name >", value, "cslName");
            return (Criteria) this;
        }

        public Criteria andCslNameGreaterThanOrEqualTo(String value) {
            addCriterion("csl_name >=", value, "cslName");
            return (Criteria) this;
        }

        public Criteria andCslNameLessThan(String value) {
            addCriterion("csl_name <", value, "cslName");
            return (Criteria) this;
        }

        public Criteria andCslNameLessThanOrEqualTo(String value) {
            addCriterion("csl_name <=", value, "cslName");
            return (Criteria) this;
        }

        public Criteria andCslNameLike(String value) {
            addCriterion("csl_name like", value, "cslName");
            return (Criteria) this;
        }

        public Criteria andCslNameNotLike(String value) {
            addCriterion("csl_name not like", value, "cslName");
            return (Criteria) this;
        }

        public Criteria andCslNameIn(List<String> values) {
            addCriterion("csl_name in", values, "cslName");
            return (Criteria) this;
        }

        public Criteria andCslNameNotIn(List<String> values) {
            addCriterion("csl_name not in", values, "cslName");
            return (Criteria) this;
        }

        public Criteria andCslNameBetween(String value1, String value2) {
            addCriterion("csl_name between", value1, value2, "cslName");
            return (Criteria) this;
        }

        public Criteria andCslNameNotBetween(String value1, String value2) {
            addCriterion("csl_name not between", value1, value2, "cslName");
            return (Criteria) this;
        }

        public Criteria andCslUserNameIsNull() {
            addCriterion("csl_user_name is null");
            return (Criteria) this;
        }

        public Criteria andCslUserNameIsNotNull() {
            addCriterion("csl_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andCslUserNameEqualTo(String value) {
            addCriterion("csl_user_name =", value, "cslUserName");
            return (Criteria) this;
        }

        public Criteria andCslUserNameNotEqualTo(String value) {
            addCriterion("csl_user_name <>", value, "cslUserName");
            return (Criteria) this;
        }

        public Criteria andCslUserNameGreaterThan(String value) {
            addCriterion("csl_user_name >", value, "cslUserName");
            return (Criteria) this;
        }

        public Criteria andCslUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("csl_user_name >=", value, "cslUserName");
            return (Criteria) this;
        }

        public Criteria andCslUserNameLessThan(String value) {
            addCriterion("csl_user_name <", value, "cslUserName");
            return (Criteria) this;
        }

        public Criteria andCslUserNameLessThanOrEqualTo(String value) {
            addCriterion("csl_user_name <=", value, "cslUserName");
            return (Criteria) this;
        }

        public Criteria andCslUserNameLike(String value) {
            addCriterion("csl_user_name like", value, "cslUserName");
            return (Criteria) this;
        }

        public Criteria andCslUserNameNotLike(String value) {
            addCriterion("csl_user_name not like", value, "cslUserName");
            return (Criteria) this;
        }

        public Criteria andCslUserNameIn(List<String> values) {
            addCriterion("csl_user_name in", values, "cslUserName");
            return (Criteria) this;
        }

        public Criteria andCslUserNameNotIn(List<String> values) {
            addCriterion("csl_user_name not in", values, "cslUserName");
            return (Criteria) this;
        }

        public Criteria andCslUserNameBetween(String value1, String value2) {
            addCriterion("csl_user_name between", value1, value2, "cslUserName");
            return (Criteria) this;
        }

        public Criteria andCslUserNameNotBetween(String value1, String value2) {
            addCriterion("csl_user_name not between", value1, value2, "cslUserName");
            return (Criteria) this;
        }

        public Criteria andCslUserCallIsNull() {
            addCriterion("csl_user_call is null");
            return (Criteria) this;
        }

        public Criteria andCslUserCallIsNotNull() {
            addCriterion("csl_user_call is not null");
            return (Criteria) this;
        }

        public Criteria andCslUserCallEqualTo(String value) {
            addCriterion("csl_user_call =", value, "cslUserCall");
            return (Criteria) this;
        }

        public Criteria andCslUserCallNotEqualTo(String value) {
            addCriterion("csl_user_call <>", value, "cslUserCall");
            return (Criteria) this;
        }

        public Criteria andCslUserCallGreaterThan(String value) {
            addCriterion("csl_user_call >", value, "cslUserCall");
            return (Criteria) this;
        }

        public Criteria andCslUserCallGreaterThanOrEqualTo(String value) {
            addCriterion("csl_user_call >=", value, "cslUserCall");
            return (Criteria) this;
        }

        public Criteria andCslUserCallLessThan(String value) {
            addCriterion("csl_user_call <", value, "cslUserCall");
            return (Criteria) this;
        }

        public Criteria andCslUserCallLessThanOrEqualTo(String value) {
            addCriterion("csl_user_call <=", value, "cslUserCall");
            return (Criteria) this;
        }

        public Criteria andCslUserCallLike(String value) {
            addCriterion("csl_user_call like", value, "cslUserCall");
            return (Criteria) this;
        }

        public Criteria andCslUserCallNotLike(String value) {
            addCriterion("csl_user_call not like", value, "cslUserCall");
            return (Criteria) this;
        }

        public Criteria andCslUserCallIn(List<String> values) {
            addCriterion("csl_user_call in", values, "cslUserCall");
            return (Criteria) this;
        }

        public Criteria andCslUserCallNotIn(List<String> values) {
            addCriterion("csl_user_call not in", values, "cslUserCall");
            return (Criteria) this;
        }

        public Criteria andCslUserCallBetween(String value1, String value2) {
            addCriterion("csl_user_call between", value1, value2, "cslUserCall");
            return (Criteria) this;
        }

        public Criteria andCslUserCallNotBetween(String value1, String value2) {
            addCriterion("csl_user_call not between", value1, value2, "cslUserCall");
            return (Criteria) this;
        }

        public Criteria andCslClassIsNull() {
            addCriterion("csl_class is null");
            return (Criteria) this;
        }

        public Criteria andCslClassIsNotNull() {
            addCriterion("csl_class is not null");
            return (Criteria) this;
        }

        public Criteria andCslClassEqualTo(String value) {
            addCriterion("csl_class =", value, "cslClass");
            return (Criteria) this;
        }

        public Criteria andCslClassNotEqualTo(String value) {
            addCriterion("csl_class <>", value, "cslClass");
            return (Criteria) this;
        }

        public Criteria andCslClassGreaterThan(String value) {
            addCriterion("csl_class >", value, "cslClass");
            return (Criteria) this;
        }

        public Criteria andCslClassGreaterThanOrEqualTo(String value) {
            addCriterion("csl_class >=", value, "cslClass");
            return (Criteria) this;
        }

        public Criteria andCslClassLessThan(String value) {
            addCriterion("csl_class <", value, "cslClass");
            return (Criteria) this;
        }

        public Criteria andCslClassLessThanOrEqualTo(String value) {
            addCriterion("csl_class <=", value, "cslClass");
            return (Criteria) this;
        }

        public Criteria andCslClassLike(String value) {
            addCriterion("csl_class like", value, "cslClass");
            return (Criteria) this;
        }

        public Criteria andCslClassNotLike(String value) {
            addCriterion("csl_class not like", value, "cslClass");
            return (Criteria) this;
        }

        public Criteria andCslClassIn(List<String> values) {
            addCriterion("csl_class in", values, "cslClass");
            return (Criteria) this;
        }

        public Criteria andCslClassNotIn(List<String> values) {
            addCriterion("csl_class not in", values, "cslClass");
            return (Criteria) this;
        }

        public Criteria andCslClassBetween(String value1, String value2) {
            addCriterion("csl_class between", value1, value2, "cslClass");
            return (Criteria) this;
        }

        public Criteria andCslClassNotBetween(String value1, String value2) {
            addCriterion("csl_class not between", value1, value2, "cslClass");
            return (Criteria) this;
        }

        public Criteria andCslContentIsNull() {
            addCriterion("csl_content is null");
            return (Criteria) this;
        }

        public Criteria andCslContentIsNotNull() {
            addCriterion("csl_content is not null");
            return (Criteria) this;
        }

        public Criteria andCslContentEqualTo(String value) {
            addCriterion("csl_content =", value, "cslContent");
            return (Criteria) this;
        }

        public Criteria andCslContentNotEqualTo(String value) {
            addCriterion("csl_content <>", value, "cslContent");
            return (Criteria) this;
        }

        public Criteria andCslContentGreaterThan(String value) {
            addCriterion("csl_content >", value, "cslContent");
            return (Criteria) this;
        }

        public Criteria andCslContentGreaterThanOrEqualTo(String value) {
            addCriterion("csl_content >=", value, "cslContent");
            return (Criteria) this;
        }

        public Criteria andCslContentLessThan(String value) {
            addCriterion("csl_content <", value, "cslContent");
            return (Criteria) this;
        }

        public Criteria andCslContentLessThanOrEqualTo(String value) {
            addCriterion("csl_content <=", value, "cslContent");
            return (Criteria) this;
        }

        public Criteria andCslContentLike(String value) {
            addCriterion("csl_content like", value, "cslContent");
            return (Criteria) this;
        }

        public Criteria andCslContentNotLike(String value) {
            addCriterion("csl_content not like", value, "cslContent");
            return (Criteria) this;
        }

        public Criteria andCslContentIn(List<String> values) {
            addCriterion("csl_content in", values, "cslContent");
            return (Criteria) this;
        }

        public Criteria andCslContentNotIn(List<String> values) {
            addCriterion("csl_content not in", values, "cslContent");
            return (Criteria) this;
        }

        public Criteria andCslContentBetween(String value1, String value2) {
            addCriterion("csl_content between", value1, value2, "cslContent");
            return (Criteria) this;
        }

        public Criteria andCslContentNotBetween(String value1, String value2) {
            addCriterion("csl_content not between", value1, value2, "cslContent");
            return (Criteria) this;
        }

        public Criteria andCslScoreIsNull() {
            addCriterion("csl_score is null");
            return (Criteria) this;
        }

        public Criteria andCslScoreIsNotNull() {
            addCriterion("csl_score is not null");
            return (Criteria) this;
        }

        public Criteria andCslScoreEqualTo(Integer value) {
            addCriterion("csl_score =", value, "cslScore");
            return (Criteria) this;
        }

        public Criteria andCslScoreNotEqualTo(Integer value) {
            addCriterion("csl_score <>", value, "cslScore");
            return (Criteria) this;
        }

        public Criteria andCslScoreGreaterThan(Integer value) {
            addCriterion("csl_score >", value, "cslScore");
            return (Criteria) this;
        }

        public Criteria andCslScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("csl_score >=", value, "cslScore");
            return (Criteria) this;
        }

        public Criteria andCslScoreLessThan(Integer value) {
            addCriterion("csl_score <", value, "cslScore");
            return (Criteria) this;
        }

        public Criteria andCslScoreLessThanOrEqualTo(Integer value) {
            addCriterion("csl_score <=", value, "cslScore");
            return (Criteria) this;
        }

        public Criteria andCslScoreIn(List<Integer> values) {
            addCriterion("csl_score in", values, "cslScore");
            return (Criteria) this;
        }

        public Criteria andCslScoreNotIn(List<Integer> values) {
            addCriterion("csl_score not in", values, "cslScore");
            return (Criteria) this;
        }

        public Criteria andCslScoreBetween(Integer value1, Integer value2) {
            addCriterion("csl_score between", value1, value2, "cslScore");
            return (Criteria) this;
        }

        public Criteria andCslScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("csl_score not between", value1, value2, "cslScore");
            return (Criteria) this;
        }

        public Criteria andCslOpinionIsNull() {
            addCriterion("csl_opinion is null");
            return (Criteria) this;
        }

        public Criteria andCslOpinionIsNotNull() {
            addCriterion("csl_opinion is not null");
            return (Criteria) this;
        }

        public Criteria andCslOpinionEqualTo(String value) {
            addCriterion("csl_opinion =", value, "cslOpinion");
            return (Criteria) this;
        }

        public Criteria andCslOpinionNotEqualTo(String value) {
            addCriterion("csl_opinion <>", value, "cslOpinion");
            return (Criteria) this;
        }

        public Criteria andCslOpinionGreaterThan(String value) {
            addCriterion("csl_opinion >", value, "cslOpinion");
            return (Criteria) this;
        }

        public Criteria andCslOpinionGreaterThanOrEqualTo(String value) {
            addCriterion("csl_opinion >=", value, "cslOpinion");
            return (Criteria) this;
        }

        public Criteria andCslOpinionLessThan(String value) {
            addCriterion("csl_opinion <", value, "cslOpinion");
            return (Criteria) this;
        }

        public Criteria andCslOpinionLessThanOrEqualTo(String value) {
            addCriterion("csl_opinion <=", value, "cslOpinion");
            return (Criteria) this;
        }

        public Criteria andCslOpinionLike(String value) {
            addCriterion("csl_opinion like", value, "cslOpinion");
            return (Criteria) this;
        }

        public Criteria andCslOpinionNotLike(String value) {
            addCriterion("csl_opinion not like", value, "cslOpinion");
            return (Criteria) this;
        }

        public Criteria andCslOpinionIn(List<String> values) {
            addCriterion("csl_opinion in", values, "cslOpinion");
            return (Criteria) this;
        }

        public Criteria andCslOpinionNotIn(List<String> values) {
            addCriterion("csl_opinion not in", values, "cslOpinion");
            return (Criteria) this;
        }

        public Criteria andCslOpinionBetween(String value1, String value2) {
            addCriterion("csl_opinion between", value1, value2, "cslOpinion");
            return (Criteria) this;
        }

        public Criteria andCslOpinionNotBetween(String value1, String value2) {
            addCriterion("csl_opinion not between", value1, value2, "cslOpinion");
            return (Criteria) this;
        }

        public Criteria andUpDateIsNull() {
            addCriterion("up_date is null");
            return (Criteria) this;
        }

        public Criteria andUpDateIsNotNull() {
            addCriterion("up_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpDateEqualTo(Date value) {
            addCriterion("up_date =", value, "upDate");
            return (Criteria) this;
        }

        public Criteria andUpDateNotEqualTo(Date value) {
            addCriterion("up_date <>", value, "upDate");
            return (Criteria) this;
        }

        public Criteria andUpDateGreaterThan(Date value) {
            addCriterion("up_date >", value, "upDate");
            return (Criteria) this;
        }

        public Criteria andUpDateGreaterThanOrEqualTo(Date value) {
            addCriterion("up_date >=", value, "upDate");
            return (Criteria) this;
        }

        public Criteria andUpDateLessThan(Date value) {
            addCriterion("up_date <", value, "upDate");
            return (Criteria) this;
        }

        public Criteria andUpDateLessThanOrEqualTo(Date value) {
            addCriterion("up_date <=", value, "upDate");
            return (Criteria) this;
        }

        public Criteria andUpDateIn(List<Date> values) {
            addCriterion("up_date in", values, "upDate");
            return (Criteria) this;
        }

        public Criteria andUpDateNotIn(List<Date> values) {
            addCriterion("up_date not in", values, "upDate");
            return (Criteria) this;
        }

        public Criteria andUpDateBetween(Date value1, Date value2) {
            addCriterion("up_date between", value1, value2, "upDate");
            return (Criteria) this;
        }

        public Criteria andUpDateNotBetween(Date value1, Date value2) {
            addCriterion("up_date not between", value1, value2, "upDate");
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