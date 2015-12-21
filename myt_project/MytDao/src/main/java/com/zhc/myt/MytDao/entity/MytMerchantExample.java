package com.zhc.myt.MytDao.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MytMerchantExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public MytMerchantExample() {
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

        public Criteria andMchNameIsNull() {
            addCriterion("mch_name is null");
            return (Criteria) this;
        }

        public Criteria andMchNameIsNotNull() {
            addCriterion("mch_name is not null");
            return (Criteria) this;
        }

        public Criteria andMchNameEqualTo(String value) {
            addCriterion("mch_name =", value, "mchName");
            return (Criteria) this;
        }

        public Criteria andMchNameNotEqualTo(String value) {
            addCriterion("mch_name <>", value, "mchName");
            return (Criteria) this;
        }

        public Criteria andMchNameGreaterThan(String value) {
            addCriterion("mch_name >", value, "mchName");
            return (Criteria) this;
        }

        public Criteria andMchNameGreaterThanOrEqualTo(String value) {
            addCriterion("mch_name >=", value, "mchName");
            return (Criteria) this;
        }

        public Criteria andMchNameLessThan(String value) {
            addCriterion("mch_name <", value, "mchName");
            return (Criteria) this;
        }

        public Criteria andMchNameLessThanOrEqualTo(String value) {
            addCriterion("mch_name <=", value, "mchName");
            return (Criteria) this;
        }

        public Criteria andMchNameLike(String value) {
            addCriterion("mch_name like", value, "mchName");
            return (Criteria) this;
        }

        public Criteria andMchNameNotLike(String value) {
            addCriterion("mch_name not like", value, "mchName");
            return (Criteria) this;
        }

        public Criteria andMchNameIn(List<String> values) {
            addCriterion("mch_name in", values, "mchName");
            return (Criteria) this;
        }

        public Criteria andMchNameNotIn(List<String> values) {
            addCriterion("mch_name not in", values, "mchName");
            return (Criteria) this;
        }

        public Criteria andMchNameBetween(String value1, String value2) {
            addCriterion("mch_name between", value1, value2, "mchName");
            return (Criteria) this;
        }

        public Criteria andMchNameNotBetween(String value1, String value2) {
            addCriterion("mch_name not between", value1, value2, "mchName");
            return (Criteria) this;
        }

        public Criteria andMchDescriptionIsNull() {
            addCriterion("mch_description is null");
            return (Criteria) this;
        }

        public Criteria andMchDescriptionIsNotNull() {
            addCriterion("mch_description is not null");
            return (Criteria) this;
        }

        public Criteria andMchDescriptionEqualTo(String value) {
            addCriterion("mch_description =", value, "mchDescription");
            return (Criteria) this;
        }

        public Criteria andMchDescriptionNotEqualTo(String value) {
            addCriterion("mch_description <>", value, "mchDescription");
            return (Criteria) this;
        }

        public Criteria andMchDescriptionGreaterThan(String value) {
            addCriterion("mch_description >", value, "mchDescription");
            return (Criteria) this;
        }

        public Criteria andMchDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("mch_description >=", value, "mchDescription");
            return (Criteria) this;
        }

        public Criteria andMchDescriptionLessThan(String value) {
            addCriterion("mch_description <", value, "mchDescription");
            return (Criteria) this;
        }

        public Criteria andMchDescriptionLessThanOrEqualTo(String value) {
            addCriterion("mch_description <=", value, "mchDescription");
            return (Criteria) this;
        }

        public Criteria andMchDescriptionLike(String value) {
            addCriterion("mch_description like", value, "mchDescription");
            return (Criteria) this;
        }

        public Criteria andMchDescriptionNotLike(String value) {
            addCriterion("mch_description not like", value, "mchDescription");
            return (Criteria) this;
        }

        public Criteria andMchDescriptionIn(List<String> values) {
            addCriterion("mch_description in", values, "mchDescription");
            return (Criteria) this;
        }

        public Criteria andMchDescriptionNotIn(List<String> values) {
            addCriterion("mch_description not in", values, "mchDescription");
            return (Criteria) this;
        }

        public Criteria andMchDescriptionBetween(String value1, String value2) {
            addCriterion("mch_description between", value1, value2, "mchDescription");
            return (Criteria) this;
        }

        public Criteria andMchDescriptionNotBetween(String value1, String value2) {
            addCriterion("mch_description not between", value1, value2, "mchDescription");
            return (Criteria) this;
        }

        public Criteria andMchLogoIdIsNull() {
            addCriterion("mch_logo_id is null");
            return (Criteria) this;
        }

        public Criteria andMchLogoIdIsNotNull() {
            addCriterion("mch_logo_id is not null");
            return (Criteria) this;
        }

        public Criteria andMchLogoIdEqualTo(Integer value) {
            addCriterion("mch_logo_id =", value, "mchLogoId");
            return (Criteria) this;
        }

        public Criteria andMchLogoIdNotEqualTo(Integer value) {
            addCriterion("mch_logo_id <>", value, "mchLogoId");
            return (Criteria) this;
        }

        public Criteria andMchLogoIdGreaterThan(Integer value) {
            addCriterion("mch_logo_id >", value, "mchLogoId");
            return (Criteria) this;
        }

        public Criteria andMchLogoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("mch_logo_id >=", value, "mchLogoId");
            return (Criteria) this;
        }

        public Criteria andMchLogoIdLessThan(Integer value) {
            addCriterion("mch_logo_id <", value, "mchLogoId");
            return (Criteria) this;
        }

        public Criteria andMchLogoIdLessThanOrEqualTo(Integer value) {
            addCriterion("mch_logo_id <=", value, "mchLogoId");
            return (Criteria) this;
        }

        public Criteria andMchLogoIdIn(List<Integer> values) {
            addCriterion("mch_logo_id in", values, "mchLogoId");
            return (Criteria) this;
        }

        public Criteria andMchLogoIdNotIn(List<Integer> values) {
            addCriterion("mch_logo_id not in", values, "mchLogoId");
            return (Criteria) this;
        }

        public Criteria andMchLogoIdBetween(Integer value1, Integer value2) {
            addCriterion("mch_logo_id between", value1, value2, "mchLogoId");
            return (Criteria) this;
        }

        public Criteria andMchLogoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("mch_logo_id not between", value1, value2, "mchLogoId");
            return (Criteria) this;
        }

        public Criteria andMchAddressIsNull() {
            addCriterion("mch_address is null");
            return (Criteria) this;
        }

        public Criteria andMchAddressIsNotNull() {
            addCriterion("mch_address is not null");
            return (Criteria) this;
        }

        public Criteria andMchAddressEqualTo(String value) {
            addCriterion("mch_address =", value, "mchAddress");
            return (Criteria) this;
        }

        public Criteria andMchAddressNotEqualTo(String value) {
            addCriterion("mch_address <>", value, "mchAddress");
            return (Criteria) this;
        }

        public Criteria andMchAddressGreaterThan(String value) {
            addCriterion("mch_address >", value, "mchAddress");
            return (Criteria) this;
        }

        public Criteria andMchAddressGreaterThanOrEqualTo(String value) {
            addCriterion("mch_address >=", value, "mchAddress");
            return (Criteria) this;
        }

        public Criteria andMchAddressLessThan(String value) {
            addCriterion("mch_address <", value, "mchAddress");
            return (Criteria) this;
        }

        public Criteria andMchAddressLessThanOrEqualTo(String value) {
            addCriterion("mch_address <=", value, "mchAddress");
            return (Criteria) this;
        }

        public Criteria andMchAddressLike(String value) {
            addCriterion("mch_address like", value, "mchAddress");
            return (Criteria) this;
        }

        public Criteria andMchAddressNotLike(String value) {
            addCriterion("mch_address not like", value, "mchAddress");
            return (Criteria) this;
        }

        public Criteria andMchAddressIn(List<String> values) {
            addCriterion("mch_address in", values, "mchAddress");
            return (Criteria) this;
        }

        public Criteria andMchAddressNotIn(List<String> values) {
            addCriterion("mch_address not in", values, "mchAddress");
            return (Criteria) this;
        }

        public Criteria andMchAddressBetween(String value1, String value2) {
            addCriterion("mch_address between", value1, value2, "mchAddress");
            return (Criteria) this;
        }

        public Criteria andMchAddressNotBetween(String value1, String value2) {
            addCriterion("mch_address not between", value1, value2, "mchAddress");
            return (Criteria) this;
        }

        public Criteria andMchCallIsNull() {
            addCriterion("mch_call is null");
            return (Criteria) this;
        }

        public Criteria andMchCallIsNotNull() {
            addCriterion("mch_call is not null");
            return (Criteria) this;
        }

        public Criteria andMchCallEqualTo(String value) {
            addCriterion("mch_call =", value, "mchCall");
            return (Criteria) this;
        }

        public Criteria andMchCallNotEqualTo(String value) {
            addCriterion("mch_call <>", value, "mchCall");
            return (Criteria) this;
        }

        public Criteria andMchCallGreaterThan(String value) {
            addCriterion("mch_call >", value, "mchCall");
            return (Criteria) this;
        }

        public Criteria andMchCallGreaterThanOrEqualTo(String value) {
            addCriterion("mch_call >=", value, "mchCall");
            return (Criteria) this;
        }

        public Criteria andMchCallLessThan(String value) {
            addCriterion("mch_call <", value, "mchCall");
            return (Criteria) this;
        }

        public Criteria andMchCallLessThanOrEqualTo(String value) {
            addCriterion("mch_call <=", value, "mchCall");
            return (Criteria) this;
        }

        public Criteria andMchCallLike(String value) {
            addCriterion("mch_call like", value, "mchCall");
            return (Criteria) this;
        }

        public Criteria andMchCallNotLike(String value) {
            addCriterion("mch_call not like", value, "mchCall");
            return (Criteria) this;
        }

        public Criteria andMchCallIn(List<String> values) {
            addCriterion("mch_call in", values, "mchCall");
            return (Criteria) this;
        }

        public Criteria andMchCallNotIn(List<String> values) {
            addCriterion("mch_call not in", values, "mchCall");
            return (Criteria) this;
        }

        public Criteria andMchCallBetween(String value1, String value2) {
            addCriterion("mch_call between", value1, value2, "mchCall");
            return (Criteria) this;
        }

        public Criteria andMchCallNotBetween(String value1, String value2) {
            addCriterion("mch_call not between", value1, value2, "mchCall");
            return (Criteria) this;
        }

        public Criteria andMchAccountIsNull() {
            addCriterion("mch_account is null");
            return (Criteria) this;
        }

        public Criteria andMchAccountIsNotNull() {
            addCriterion("mch_account is not null");
            return (Criteria) this;
        }

        public Criteria andMchAccountEqualTo(String value) {
            addCriterion("mch_account =", value, "mchAccount");
            return (Criteria) this;
        }

        public Criteria andMchAccountNotEqualTo(String value) {
            addCriterion("mch_account <>", value, "mchAccount");
            return (Criteria) this;
        }

        public Criteria andMchAccountGreaterThan(String value) {
            addCriterion("mch_account >", value, "mchAccount");
            return (Criteria) this;
        }

        public Criteria andMchAccountGreaterThanOrEqualTo(String value) {
            addCriterion("mch_account >=", value, "mchAccount");
            return (Criteria) this;
        }

        public Criteria andMchAccountLessThan(String value) {
            addCriterion("mch_account <", value, "mchAccount");
            return (Criteria) this;
        }

        public Criteria andMchAccountLessThanOrEqualTo(String value) {
            addCriterion("mch_account <=", value, "mchAccount");
            return (Criteria) this;
        }

        public Criteria andMchAccountLike(String value) {
            addCriterion("mch_account like", value, "mchAccount");
            return (Criteria) this;
        }

        public Criteria andMchAccountNotLike(String value) {
            addCriterion("mch_account not like", value, "mchAccount");
            return (Criteria) this;
        }

        public Criteria andMchAccountIn(List<String> values) {
            addCriterion("mch_account in", values, "mchAccount");
            return (Criteria) this;
        }

        public Criteria andMchAccountNotIn(List<String> values) {
            addCriterion("mch_account not in", values, "mchAccount");
            return (Criteria) this;
        }

        public Criteria andMchAccountBetween(String value1, String value2) {
            addCriterion("mch_account between", value1, value2, "mchAccount");
            return (Criteria) this;
        }

        public Criteria andMchAccountNotBetween(String value1, String value2) {
            addCriterion("mch_account not between", value1, value2, "mchAccount");
            return (Criteria) this;
        }

        public Criteria andMchAccountBankIsNull() {
            addCriterion("mch_account_bank is null");
            return (Criteria) this;
        }

        public Criteria andMchAccountBankIsNotNull() {
            addCriterion("mch_account_bank is not null");
            return (Criteria) this;
        }

        public Criteria andMchAccountBankEqualTo(String value) {
            addCriterion("mch_account_bank =", value, "mchAccountBank");
            return (Criteria) this;
        }

        public Criteria andMchAccountBankNotEqualTo(String value) {
            addCriterion("mch_account_bank <>", value, "mchAccountBank");
            return (Criteria) this;
        }

        public Criteria andMchAccountBankGreaterThan(String value) {
            addCriterion("mch_account_bank >", value, "mchAccountBank");
            return (Criteria) this;
        }

        public Criteria andMchAccountBankGreaterThanOrEqualTo(String value) {
            addCriterion("mch_account_bank >=", value, "mchAccountBank");
            return (Criteria) this;
        }

        public Criteria andMchAccountBankLessThan(String value) {
            addCriterion("mch_account_bank <", value, "mchAccountBank");
            return (Criteria) this;
        }

        public Criteria andMchAccountBankLessThanOrEqualTo(String value) {
            addCriterion("mch_account_bank <=", value, "mchAccountBank");
            return (Criteria) this;
        }

        public Criteria andMchAccountBankLike(String value) {
            addCriterion("mch_account_bank like", value, "mchAccountBank");
            return (Criteria) this;
        }

        public Criteria andMchAccountBankNotLike(String value) {
            addCriterion("mch_account_bank not like", value, "mchAccountBank");
            return (Criteria) this;
        }

        public Criteria andMchAccountBankIn(List<String> values) {
            addCriterion("mch_account_bank in", values, "mchAccountBank");
            return (Criteria) this;
        }

        public Criteria andMchAccountBankNotIn(List<String> values) {
            addCriterion("mch_account_bank not in", values, "mchAccountBank");
            return (Criteria) this;
        }

        public Criteria andMchAccountBankBetween(String value1, String value2) {
            addCriterion("mch_account_bank between", value1, value2, "mchAccountBank");
            return (Criteria) this;
        }

        public Criteria andMchAccountBankNotBetween(String value1, String value2) {
            addCriterion("mch_account_bank not between", value1, value2, "mchAccountBank");
            return (Criteria) this;
        }

        public Criteria andMchAccountNameIsNull() {
            addCriterion("mch_account_name is null");
            return (Criteria) this;
        }

        public Criteria andMchAccountNameIsNotNull() {
            addCriterion("mch_account_name is not null");
            return (Criteria) this;
        }

        public Criteria andMchAccountNameEqualTo(String value) {
            addCriterion("mch_account_name =", value, "mchAccountName");
            return (Criteria) this;
        }

        public Criteria andMchAccountNameNotEqualTo(String value) {
            addCriterion("mch_account_name <>", value, "mchAccountName");
            return (Criteria) this;
        }

        public Criteria andMchAccountNameGreaterThan(String value) {
            addCriterion("mch_account_name >", value, "mchAccountName");
            return (Criteria) this;
        }

        public Criteria andMchAccountNameGreaterThanOrEqualTo(String value) {
            addCriterion("mch_account_name >=", value, "mchAccountName");
            return (Criteria) this;
        }

        public Criteria andMchAccountNameLessThan(String value) {
            addCriterion("mch_account_name <", value, "mchAccountName");
            return (Criteria) this;
        }

        public Criteria andMchAccountNameLessThanOrEqualTo(String value) {
            addCriterion("mch_account_name <=", value, "mchAccountName");
            return (Criteria) this;
        }

        public Criteria andMchAccountNameLike(String value) {
            addCriterion("mch_account_name like", value, "mchAccountName");
            return (Criteria) this;
        }

        public Criteria andMchAccountNameNotLike(String value) {
            addCriterion("mch_account_name not like", value, "mchAccountName");
            return (Criteria) this;
        }

        public Criteria andMchAccountNameIn(List<String> values) {
            addCriterion("mch_account_name in", values, "mchAccountName");
            return (Criteria) this;
        }

        public Criteria andMchAccountNameNotIn(List<String> values) {
            addCriterion("mch_account_name not in", values, "mchAccountName");
            return (Criteria) this;
        }

        public Criteria andMchAccountNameBetween(String value1, String value2) {
            addCriterion("mch_account_name between", value1, value2, "mchAccountName");
            return (Criteria) this;
        }

        public Criteria andMchAccountNameNotBetween(String value1, String value2) {
            addCriterion("mch_account_name not between", value1, value2, "mchAccountName");
            return (Criteria) this;
        }

        public Criteria andMchPersonInChargeIsNull() {
            addCriterion("mch_person_in_charge is null");
            return (Criteria) this;
        }

        public Criteria andMchPersonInChargeIsNotNull() {
            addCriterion("mch_person_in_charge is not null");
            return (Criteria) this;
        }

        public Criteria andMchPersonInChargeEqualTo(String value) {
            addCriterion("mch_person_in_charge =", value, "mchPersonInCharge");
            return (Criteria) this;
        }

        public Criteria andMchPersonInChargeNotEqualTo(String value) {
            addCriterion("mch_person_in_charge <>", value, "mchPersonInCharge");
            return (Criteria) this;
        }

        public Criteria andMchPersonInChargeGreaterThan(String value) {
            addCriterion("mch_person_in_charge >", value, "mchPersonInCharge");
            return (Criteria) this;
        }

        public Criteria andMchPersonInChargeGreaterThanOrEqualTo(String value) {
            addCriterion("mch_person_in_charge >=", value, "mchPersonInCharge");
            return (Criteria) this;
        }

        public Criteria andMchPersonInChargeLessThan(String value) {
            addCriterion("mch_person_in_charge <", value, "mchPersonInCharge");
            return (Criteria) this;
        }

        public Criteria andMchPersonInChargeLessThanOrEqualTo(String value) {
            addCriterion("mch_person_in_charge <=", value, "mchPersonInCharge");
            return (Criteria) this;
        }

        public Criteria andMchPersonInChargeLike(String value) {
            addCriterion("mch_person_in_charge like", value, "mchPersonInCharge");
            return (Criteria) this;
        }

        public Criteria andMchPersonInChargeNotLike(String value) {
            addCriterion("mch_person_in_charge not like", value, "mchPersonInCharge");
            return (Criteria) this;
        }

        public Criteria andMchPersonInChargeIn(List<String> values) {
            addCriterion("mch_person_in_charge in", values, "mchPersonInCharge");
            return (Criteria) this;
        }

        public Criteria andMchPersonInChargeNotIn(List<String> values) {
            addCriterion("mch_person_in_charge not in", values, "mchPersonInCharge");
            return (Criteria) this;
        }

        public Criteria andMchPersonInChargeBetween(String value1, String value2) {
            addCriterion("mch_person_in_charge between", value1, value2, "mchPersonInCharge");
            return (Criteria) this;
        }

        public Criteria andMchPersonInChargeNotBetween(String value1, String value2) {
            addCriterion("mch_person_in_charge not between", value1, value2, "mchPersonInCharge");
            return (Criteria) this;
        }

        public Criteria andMchPersonInChargeCallIsNull() {
            addCriterion("mch_person_in_charge_call is null");
            return (Criteria) this;
        }

        public Criteria andMchPersonInChargeCallIsNotNull() {
            addCriterion("mch_person_in_charge_call is not null");
            return (Criteria) this;
        }

        public Criteria andMchPersonInChargeCallEqualTo(String value) {
            addCriterion("mch_person_in_charge_call =", value, "mchPersonInChargeCall");
            return (Criteria) this;
        }

        public Criteria andMchPersonInChargeCallNotEqualTo(String value) {
            addCriterion("mch_person_in_charge_call <>", value, "mchPersonInChargeCall");
            return (Criteria) this;
        }

        public Criteria andMchPersonInChargeCallGreaterThan(String value) {
            addCriterion("mch_person_in_charge_call >", value, "mchPersonInChargeCall");
            return (Criteria) this;
        }

        public Criteria andMchPersonInChargeCallGreaterThanOrEqualTo(String value) {
            addCriterion("mch_person_in_charge_call >=", value, "mchPersonInChargeCall");
            return (Criteria) this;
        }

        public Criteria andMchPersonInChargeCallLessThan(String value) {
            addCriterion("mch_person_in_charge_call <", value, "mchPersonInChargeCall");
            return (Criteria) this;
        }

        public Criteria andMchPersonInChargeCallLessThanOrEqualTo(String value) {
            addCriterion("mch_person_in_charge_call <=", value, "mchPersonInChargeCall");
            return (Criteria) this;
        }

        public Criteria andMchPersonInChargeCallLike(String value) {
            addCriterion("mch_person_in_charge_call like", value, "mchPersonInChargeCall");
            return (Criteria) this;
        }

        public Criteria andMchPersonInChargeCallNotLike(String value) {
            addCriterion("mch_person_in_charge_call not like", value, "mchPersonInChargeCall");
            return (Criteria) this;
        }

        public Criteria andMchPersonInChargeCallIn(List<String> values) {
            addCriterion("mch_person_in_charge_call in", values, "mchPersonInChargeCall");
            return (Criteria) this;
        }

        public Criteria andMchPersonInChargeCallNotIn(List<String> values) {
            addCriterion("mch_person_in_charge_call not in", values, "mchPersonInChargeCall");
            return (Criteria) this;
        }

        public Criteria andMchPersonInChargeCallBetween(String value1, String value2) {
            addCriterion("mch_person_in_charge_call between", value1, value2, "mchPersonInChargeCall");
            return (Criteria) this;
        }

        public Criteria andMchPersonInChargeCallNotBetween(String value1, String value2) {
            addCriterion("mch_person_in_charge_call not between", value1, value2, "mchPersonInChargeCall");
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

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
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