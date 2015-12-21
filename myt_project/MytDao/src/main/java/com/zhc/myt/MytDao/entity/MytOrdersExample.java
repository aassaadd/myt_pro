package com.zhc.myt.MytDao.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MytOrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public MytOrdersExample() {
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

        public Criteria andWxUserIdIsNull() {
            addCriterion("wx_user_id is null");
            return (Criteria) this;
        }

        public Criteria andWxUserIdIsNotNull() {
            addCriterion("wx_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andWxUserIdEqualTo(Integer value) {
            addCriterion("wx_user_id =", value, "wxUserId");
            return (Criteria) this;
        }

        public Criteria andWxUserIdNotEqualTo(Integer value) {
            addCriterion("wx_user_id <>", value, "wxUserId");
            return (Criteria) this;
        }

        public Criteria andWxUserIdGreaterThan(Integer value) {
            addCriterion("wx_user_id >", value, "wxUserId");
            return (Criteria) this;
        }

        public Criteria andWxUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("wx_user_id >=", value, "wxUserId");
            return (Criteria) this;
        }

        public Criteria andWxUserIdLessThan(Integer value) {
            addCriterion("wx_user_id <", value, "wxUserId");
            return (Criteria) this;
        }

        public Criteria andWxUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("wx_user_id <=", value, "wxUserId");
            return (Criteria) this;
        }

        public Criteria andWxUserIdIn(List<Integer> values) {
            addCriterion("wx_user_id in", values, "wxUserId");
            return (Criteria) this;
        }

        public Criteria andWxUserIdNotIn(List<Integer> values) {
            addCriterion("wx_user_id not in", values, "wxUserId");
            return (Criteria) this;
        }

        public Criteria andWxUserIdBetween(Integer value1, Integer value2) {
            addCriterion("wx_user_id between", value1, value2, "wxUserId");
            return (Criteria) this;
        }

        public Criteria andWxUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("wx_user_id not between", value1, value2, "wxUserId");
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

        public Criteria andProOneFeeIsNull() {
            addCriterion("pro_one_fee is null");
            return (Criteria) this;
        }

        public Criteria andProOneFeeIsNotNull() {
            addCriterion("pro_one_fee is not null");
            return (Criteria) this;
        }

        public Criteria andProOneFeeEqualTo(Long value) {
            addCriterion("pro_one_fee =", value, "proOneFee");
            return (Criteria) this;
        }

        public Criteria andProOneFeeNotEqualTo(Long value) {
            addCriterion("pro_one_fee <>", value, "proOneFee");
            return (Criteria) this;
        }

        public Criteria andProOneFeeGreaterThan(Long value) {
            addCriterion("pro_one_fee >", value, "proOneFee");
            return (Criteria) this;
        }

        public Criteria andProOneFeeGreaterThanOrEqualTo(Long value) {
            addCriterion("pro_one_fee >=", value, "proOneFee");
            return (Criteria) this;
        }

        public Criteria andProOneFeeLessThan(Long value) {
            addCriterion("pro_one_fee <", value, "proOneFee");
            return (Criteria) this;
        }

        public Criteria andProOneFeeLessThanOrEqualTo(Long value) {
            addCriterion("pro_one_fee <=", value, "proOneFee");
            return (Criteria) this;
        }

        public Criteria andProOneFeeIn(List<Long> values) {
            addCriterion("pro_one_fee in", values, "proOneFee");
            return (Criteria) this;
        }

        public Criteria andProOneFeeNotIn(List<Long> values) {
            addCriterion("pro_one_fee not in", values, "proOneFee");
            return (Criteria) this;
        }

        public Criteria andProOneFeeBetween(Long value1, Long value2) {
            addCriterion("pro_one_fee between", value1, value2, "proOneFee");
            return (Criteria) this;
        }

        public Criteria andProOneFeeNotBetween(Long value1, Long value2) {
            addCriterion("pro_one_fee not between", value1, value2, "proOneFee");
            return (Criteria) this;
        }

        public Criteria andProImgIdIsNull() {
            addCriterion("pro_img_id is null");
            return (Criteria) this;
        }

        public Criteria andProImgIdIsNotNull() {
            addCriterion("pro_img_id is not null");
            return (Criteria) this;
        }

        public Criteria andProImgIdEqualTo(Integer value) {
            addCriterion("pro_img_id =", value, "proImgId");
            return (Criteria) this;
        }

        public Criteria andProImgIdNotEqualTo(Integer value) {
            addCriterion("pro_img_id <>", value, "proImgId");
            return (Criteria) this;
        }

        public Criteria andProImgIdGreaterThan(Integer value) {
            addCriterion("pro_img_id >", value, "proImgId");
            return (Criteria) this;
        }

        public Criteria andProImgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pro_img_id >=", value, "proImgId");
            return (Criteria) this;
        }

        public Criteria andProImgIdLessThan(Integer value) {
            addCriterion("pro_img_id <", value, "proImgId");
            return (Criteria) this;
        }

        public Criteria andProImgIdLessThanOrEqualTo(Integer value) {
            addCriterion("pro_img_id <=", value, "proImgId");
            return (Criteria) this;
        }

        public Criteria andProImgIdIn(List<Integer> values) {
            addCriterion("pro_img_id in", values, "proImgId");
            return (Criteria) this;
        }

        public Criteria andProImgIdNotIn(List<Integer> values) {
            addCriterion("pro_img_id not in", values, "proImgId");
            return (Criteria) this;
        }

        public Criteria andProImgIdBetween(Integer value1, Integer value2) {
            addCriterion("pro_img_id between", value1, value2, "proImgId");
            return (Criteria) this;
        }

        public Criteria andProImgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pro_img_id not between", value1, value2, "proImgId");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("order_no =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("order_no like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("order_no not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("order_no in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("order_no not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("order_no between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("order_no not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderBankTypeIsNull() {
            addCriterion("order_bank_type is null");
            return (Criteria) this;
        }

        public Criteria andOrderBankTypeIsNotNull() {
            addCriterion("order_bank_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrderBankTypeEqualTo(String value) {
            addCriterion("order_bank_type =", value, "orderBankType");
            return (Criteria) this;
        }

        public Criteria andOrderBankTypeNotEqualTo(String value) {
            addCriterion("order_bank_type <>", value, "orderBankType");
            return (Criteria) this;
        }

        public Criteria andOrderBankTypeGreaterThan(String value) {
            addCriterion("order_bank_type >", value, "orderBankType");
            return (Criteria) this;
        }

        public Criteria andOrderBankTypeGreaterThanOrEqualTo(String value) {
            addCriterion("order_bank_type >=", value, "orderBankType");
            return (Criteria) this;
        }

        public Criteria andOrderBankTypeLessThan(String value) {
            addCriterion("order_bank_type <", value, "orderBankType");
            return (Criteria) this;
        }

        public Criteria andOrderBankTypeLessThanOrEqualTo(String value) {
            addCriterion("order_bank_type <=", value, "orderBankType");
            return (Criteria) this;
        }

        public Criteria andOrderBankTypeLike(String value) {
            addCriterion("order_bank_type like", value, "orderBankType");
            return (Criteria) this;
        }

        public Criteria andOrderBankTypeNotLike(String value) {
            addCriterion("order_bank_type not like", value, "orderBankType");
            return (Criteria) this;
        }

        public Criteria andOrderBankTypeIn(List<String> values) {
            addCriterion("order_bank_type in", values, "orderBankType");
            return (Criteria) this;
        }

        public Criteria andOrderBankTypeNotIn(List<String> values) {
            addCriterion("order_bank_type not in", values, "orderBankType");
            return (Criteria) this;
        }

        public Criteria andOrderBankTypeBetween(String value1, String value2) {
            addCriterion("order_bank_type between", value1, value2, "orderBankType");
            return (Criteria) this;
        }

        public Criteria andOrderBankTypeNotBetween(String value1, String value2) {
            addCriterion("order_bank_type not between", value1, value2, "orderBankType");
            return (Criteria) this;
        }

        public Criteria andOrderBodyIsNull() {
            addCriterion("order_body is null");
            return (Criteria) this;
        }

        public Criteria andOrderBodyIsNotNull() {
            addCriterion("order_body is not null");
            return (Criteria) this;
        }

        public Criteria andOrderBodyEqualTo(String value) {
            addCriterion("order_body =", value, "orderBody");
            return (Criteria) this;
        }

        public Criteria andOrderBodyNotEqualTo(String value) {
            addCriterion("order_body <>", value, "orderBody");
            return (Criteria) this;
        }

        public Criteria andOrderBodyGreaterThan(String value) {
            addCriterion("order_body >", value, "orderBody");
            return (Criteria) this;
        }

        public Criteria andOrderBodyGreaterThanOrEqualTo(String value) {
            addCriterion("order_body >=", value, "orderBody");
            return (Criteria) this;
        }

        public Criteria andOrderBodyLessThan(String value) {
            addCriterion("order_body <", value, "orderBody");
            return (Criteria) this;
        }

        public Criteria andOrderBodyLessThanOrEqualTo(String value) {
            addCriterion("order_body <=", value, "orderBody");
            return (Criteria) this;
        }

        public Criteria andOrderBodyLike(String value) {
            addCriterion("order_body like", value, "orderBody");
            return (Criteria) this;
        }

        public Criteria andOrderBodyNotLike(String value) {
            addCriterion("order_body not like", value, "orderBody");
            return (Criteria) this;
        }

        public Criteria andOrderBodyIn(List<String> values) {
            addCriterion("order_body in", values, "orderBody");
            return (Criteria) this;
        }

        public Criteria andOrderBodyNotIn(List<String> values) {
            addCriterion("order_body not in", values, "orderBody");
            return (Criteria) this;
        }

        public Criteria andOrderBodyBetween(String value1, String value2) {
            addCriterion("order_body between", value1, value2, "orderBody");
            return (Criteria) this;
        }

        public Criteria andOrderBodyNotBetween(String value1, String value2) {
            addCriterion("order_body not between", value1, value2, "orderBody");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsNumIsNull() {
            addCriterion("order_goods_num is null");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsNumIsNotNull() {
            addCriterion("order_goods_num is not null");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsNumEqualTo(Integer value) {
            addCriterion("order_goods_num =", value, "orderGoodsNum");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsNumNotEqualTo(Integer value) {
            addCriterion("order_goods_num <>", value, "orderGoodsNum");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsNumGreaterThan(Integer value) {
            addCriterion("order_goods_num >", value, "orderGoodsNum");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_goods_num >=", value, "orderGoodsNum");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsNumLessThan(Integer value) {
            addCriterion("order_goods_num <", value, "orderGoodsNum");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsNumLessThanOrEqualTo(Integer value) {
            addCriterion("order_goods_num <=", value, "orderGoodsNum");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsNumIn(List<Integer> values) {
            addCriterion("order_goods_num in", values, "orderGoodsNum");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsNumNotIn(List<Integer> values) {
            addCriterion("order_goods_num not in", values, "orderGoodsNum");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsNumBetween(Integer value1, Integer value2) {
            addCriterion("order_goods_num between", value1, value2, "orderGoodsNum");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsNumNotBetween(Integer value1, Integer value2) {
            addCriterion("order_goods_num not between", value1, value2, "orderGoodsNum");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("order_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("order_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(String value) {
            addCriterion("order_status =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(String value) {
            addCriterion("order_status <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(String value) {
            addCriterion("order_status >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(String value) {
            addCriterion("order_status >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(String value) {
            addCriterion("order_status <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(String value) {
            addCriterion("order_status <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLike(String value) {
            addCriterion("order_status like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotLike(String value) {
            addCriterion("order_status not like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<String> values) {
            addCriterion("order_status in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<String> values) {
            addCriterion("order_status not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(String value1, String value2) {
            addCriterion("order_status between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(String value1, String value2) {
            addCriterion("order_status not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderTotalFeeIsNull() {
            addCriterion("order_total_fee is null");
            return (Criteria) this;
        }

        public Criteria andOrderTotalFeeIsNotNull() {
            addCriterion("order_total_fee is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTotalFeeEqualTo(Long value) {
            addCriterion("order_total_fee =", value, "orderTotalFee");
            return (Criteria) this;
        }

        public Criteria andOrderTotalFeeNotEqualTo(Long value) {
            addCriterion("order_total_fee <>", value, "orderTotalFee");
            return (Criteria) this;
        }

        public Criteria andOrderTotalFeeGreaterThan(Long value) {
            addCriterion("order_total_fee >", value, "orderTotalFee");
            return (Criteria) this;
        }

        public Criteria andOrderTotalFeeGreaterThanOrEqualTo(Long value) {
            addCriterion("order_total_fee >=", value, "orderTotalFee");
            return (Criteria) this;
        }

        public Criteria andOrderTotalFeeLessThan(Long value) {
            addCriterion("order_total_fee <", value, "orderTotalFee");
            return (Criteria) this;
        }

        public Criteria andOrderTotalFeeLessThanOrEqualTo(Long value) {
            addCriterion("order_total_fee <=", value, "orderTotalFee");
            return (Criteria) this;
        }

        public Criteria andOrderTotalFeeIn(List<Long> values) {
            addCriterion("order_total_fee in", values, "orderTotalFee");
            return (Criteria) this;
        }

        public Criteria andOrderTotalFeeNotIn(List<Long> values) {
            addCriterion("order_total_fee not in", values, "orderTotalFee");
            return (Criteria) this;
        }

        public Criteria andOrderTotalFeeBetween(Long value1, Long value2) {
            addCriterion("order_total_fee between", value1, value2, "orderTotalFee");
            return (Criteria) this;
        }

        public Criteria andOrderTotalFeeNotBetween(Long value1, Long value2) {
            addCriterion("order_total_fee not between", value1, value2, "orderTotalFee");
            return (Criteria) this;
        }

        public Criteria andOrderRealityFeeIsNull() {
            addCriterion("order_reality_fee is null");
            return (Criteria) this;
        }

        public Criteria andOrderRealityFeeIsNotNull() {
            addCriterion("order_reality_fee is not null");
            return (Criteria) this;
        }

        public Criteria andOrderRealityFeeEqualTo(Long value) {
            addCriterion("order_reality_fee =", value, "orderRealityFee");
            return (Criteria) this;
        }

        public Criteria andOrderRealityFeeNotEqualTo(Long value) {
            addCriterion("order_reality_fee <>", value, "orderRealityFee");
            return (Criteria) this;
        }

        public Criteria andOrderRealityFeeGreaterThan(Long value) {
            addCriterion("order_reality_fee >", value, "orderRealityFee");
            return (Criteria) this;
        }

        public Criteria andOrderRealityFeeGreaterThanOrEqualTo(Long value) {
            addCriterion("order_reality_fee >=", value, "orderRealityFee");
            return (Criteria) this;
        }

        public Criteria andOrderRealityFeeLessThan(Long value) {
            addCriterion("order_reality_fee <", value, "orderRealityFee");
            return (Criteria) this;
        }

        public Criteria andOrderRealityFeeLessThanOrEqualTo(Long value) {
            addCriterion("order_reality_fee <=", value, "orderRealityFee");
            return (Criteria) this;
        }

        public Criteria andOrderRealityFeeIn(List<Long> values) {
            addCriterion("order_reality_fee in", values, "orderRealityFee");
            return (Criteria) this;
        }

        public Criteria andOrderRealityFeeNotIn(List<Long> values) {
            addCriterion("order_reality_fee not in", values, "orderRealityFee");
            return (Criteria) this;
        }

        public Criteria andOrderRealityFeeBetween(Long value1, Long value2) {
            addCriterion("order_reality_fee between", value1, value2, "orderRealityFee");
            return (Criteria) this;
        }

        public Criteria andOrderRealityFeeNotBetween(Long value1, Long value2) {
            addCriterion("order_reality_fee not between", value1, value2, "orderRealityFee");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeIsNull() {
            addCriterion("order_create_time is null");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeIsNotNull() {
            addCriterion("order_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeEqualTo(Date value) {
            addCriterion("order_create_time =", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeNotEqualTo(Date value) {
            addCriterion("order_create_time <>", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeGreaterThan(Date value) {
            addCriterion("order_create_time >", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("order_create_time >=", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeLessThan(Date value) {
            addCriterion("order_create_time <", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("order_create_time <=", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeIn(List<Date> values) {
            addCriterion("order_create_time in", values, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeNotIn(List<Date> values) {
            addCriterion("order_create_time not in", values, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeBetween(Date value1, Date value2) {
            addCriterion("order_create_time between", value1, value2, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("order_create_time not between", value1, value2, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderPayTimeIsNull() {
            addCriterion("order_pay_time is null");
            return (Criteria) this;
        }

        public Criteria andOrderPayTimeIsNotNull() {
            addCriterion("order_pay_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPayTimeEqualTo(Date value) {
            addCriterion("order_pay_time =", value, "orderPayTime");
            return (Criteria) this;
        }

        public Criteria andOrderPayTimeNotEqualTo(Date value) {
            addCriterion("order_pay_time <>", value, "orderPayTime");
            return (Criteria) this;
        }

        public Criteria andOrderPayTimeGreaterThan(Date value) {
            addCriterion("order_pay_time >", value, "orderPayTime");
            return (Criteria) this;
        }

        public Criteria andOrderPayTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("order_pay_time >=", value, "orderPayTime");
            return (Criteria) this;
        }

        public Criteria andOrderPayTimeLessThan(Date value) {
            addCriterion("order_pay_time <", value, "orderPayTime");
            return (Criteria) this;
        }

        public Criteria andOrderPayTimeLessThanOrEqualTo(Date value) {
            addCriterion("order_pay_time <=", value, "orderPayTime");
            return (Criteria) this;
        }

        public Criteria andOrderPayTimeIn(List<Date> values) {
            addCriterion("order_pay_time in", values, "orderPayTime");
            return (Criteria) this;
        }

        public Criteria andOrderPayTimeNotIn(List<Date> values) {
            addCriterion("order_pay_time not in", values, "orderPayTime");
            return (Criteria) this;
        }

        public Criteria andOrderPayTimeBetween(Date value1, Date value2) {
            addCriterion("order_pay_time between", value1, value2, "orderPayTime");
            return (Criteria) this;
        }

        public Criteria andOrderPayTimeNotBetween(Date value1, Date value2) {
            addCriterion("order_pay_time not between", value1, value2, "orderPayTime");
            return (Criteria) this;
        }

        public Criteria andOrderSequenceNoIsNull() {
            addCriterion("order_sequence_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderSequenceNoIsNotNull() {
            addCriterion("order_sequence_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSequenceNoEqualTo(String value) {
            addCriterion("order_sequence_no =", value, "orderSequenceNo");
            return (Criteria) this;
        }

        public Criteria andOrderSequenceNoNotEqualTo(String value) {
            addCriterion("order_sequence_no <>", value, "orderSequenceNo");
            return (Criteria) this;
        }

        public Criteria andOrderSequenceNoGreaterThan(String value) {
            addCriterion("order_sequence_no >", value, "orderSequenceNo");
            return (Criteria) this;
        }

        public Criteria andOrderSequenceNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_sequence_no >=", value, "orderSequenceNo");
            return (Criteria) this;
        }

        public Criteria andOrderSequenceNoLessThan(String value) {
            addCriterion("order_sequence_no <", value, "orderSequenceNo");
            return (Criteria) this;
        }

        public Criteria andOrderSequenceNoLessThanOrEqualTo(String value) {
            addCriterion("order_sequence_no <=", value, "orderSequenceNo");
            return (Criteria) this;
        }

        public Criteria andOrderSequenceNoLike(String value) {
            addCriterion("order_sequence_no like", value, "orderSequenceNo");
            return (Criteria) this;
        }

        public Criteria andOrderSequenceNoNotLike(String value) {
            addCriterion("order_sequence_no not like", value, "orderSequenceNo");
            return (Criteria) this;
        }

        public Criteria andOrderSequenceNoIn(List<String> values) {
            addCriterion("order_sequence_no in", values, "orderSequenceNo");
            return (Criteria) this;
        }

        public Criteria andOrderSequenceNoNotIn(List<String> values) {
            addCriterion("order_sequence_no not in", values, "orderSequenceNo");
            return (Criteria) this;
        }

        public Criteria andOrderSequenceNoBetween(String value1, String value2) {
            addCriterion("order_sequence_no between", value1, value2, "orderSequenceNo");
            return (Criteria) this;
        }

        public Criteria andOrderSequenceNoNotBetween(String value1, String value2) {
            addCriterion("order_sequence_no not between", value1, value2, "orderSequenceNo");
            return (Criteria) this;
        }

        public Criteria andWxOpenidIsNull() {
            addCriterion("wx_openid is null");
            return (Criteria) this;
        }

        public Criteria andWxOpenidIsNotNull() {
            addCriterion("wx_openid is not null");
            return (Criteria) this;
        }

        public Criteria andWxOpenidEqualTo(String value) {
            addCriterion("wx_openid =", value, "wxOpenid");
            return (Criteria) this;
        }

        public Criteria andWxOpenidNotEqualTo(String value) {
            addCriterion("wx_openid <>", value, "wxOpenid");
            return (Criteria) this;
        }

        public Criteria andWxOpenidGreaterThan(String value) {
            addCriterion("wx_openid >", value, "wxOpenid");
            return (Criteria) this;
        }

        public Criteria andWxOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("wx_openid >=", value, "wxOpenid");
            return (Criteria) this;
        }

        public Criteria andWxOpenidLessThan(String value) {
            addCriterion("wx_openid <", value, "wxOpenid");
            return (Criteria) this;
        }

        public Criteria andWxOpenidLessThanOrEqualTo(String value) {
            addCriterion("wx_openid <=", value, "wxOpenid");
            return (Criteria) this;
        }

        public Criteria andWxOpenidLike(String value) {
            addCriterion("wx_openid like", value, "wxOpenid");
            return (Criteria) this;
        }

        public Criteria andWxOpenidNotLike(String value) {
            addCriterion("wx_openid not like", value, "wxOpenid");
            return (Criteria) this;
        }

        public Criteria andWxOpenidIn(List<String> values) {
            addCriterion("wx_openid in", values, "wxOpenid");
            return (Criteria) this;
        }

        public Criteria andWxOpenidNotIn(List<String> values) {
            addCriterion("wx_openid not in", values, "wxOpenid");
            return (Criteria) this;
        }

        public Criteria andWxOpenidBetween(String value1, String value2) {
            addCriterion("wx_openid between", value1, value2, "wxOpenid");
            return (Criteria) this;
        }

        public Criteria andWxOpenidNotBetween(String value1, String value2) {
            addCriterion("wx_openid not between", value1, value2, "wxOpenid");
            return (Criteria) this;
        }

        public Criteria andWxAuthCodeIsNull() {
            addCriterion("wx_auth_code is null");
            return (Criteria) this;
        }

        public Criteria andWxAuthCodeIsNotNull() {
            addCriterion("wx_auth_code is not null");
            return (Criteria) this;
        }

        public Criteria andWxAuthCodeEqualTo(String value) {
            addCriterion("wx_auth_code =", value, "wxAuthCode");
            return (Criteria) this;
        }

        public Criteria andWxAuthCodeNotEqualTo(String value) {
            addCriterion("wx_auth_code <>", value, "wxAuthCode");
            return (Criteria) this;
        }

        public Criteria andWxAuthCodeGreaterThan(String value) {
            addCriterion("wx_auth_code >", value, "wxAuthCode");
            return (Criteria) this;
        }

        public Criteria andWxAuthCodeGreaterThanOrEqualTo(String value) {
            addCriterion("wx_auth_code >=", value, "wxAuthCode");
            return (Criteria) this;
        }

        public Criteria andWxAuthCodeLessThan(String value) {
            addCriterion("wx_auth_code <", value, "wxAuthCode");
            return (Criteria) this;
        }

        public Criteria andWxAuthCodeLessThanOrEqualTo(String value) {
            addCriterion("wx_auth_code <=", value, "wxAuthCode");
            return (Criteria) this;
        }

        public Criteria andWxAuthCodeLike(String value) {
            addCriterion("wx_auth_code like", value, "wxAuthCode");
            return (Criteria) this;
        }

        public Criteria andWxAuthCodeNotLike(String value) {
            addCriterion("wx_auth_code not like", value, "wxAuthCode");
            return (Criteria) this;
        }

        public Criteria andWxAuthCodeIn(List<String> values) {
            addCriterion("wx_auth_code in", values, "wxAuthCode");
            return (Criteria) this;
        }

        public Criteria andWxAuthCodeNotIn(List<String> values) {
            addCriterion("wx_auth_code not in", values, "wxAuthCode");
            return (Criteria) this;
        }

        public Criteria andWxAuthCodeBetween(String value1, String value2) {
            addCriterion("wx_auth_code between", value1, value2, "wxAuthCode");
            return (Criteria) this;
        }

        public Criteria andWxAuthCodeNotBetween(String value1, String value2) {
            addCriterion("wx_auth_code not between", value1, value2, "wxAuthCode");
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

        public Criteria andErrMessageIsNull() {
            addCriterion("err_message is null");
            return (Criteria) this;
        }

        public Criteria andErrMessageIsNotNull() {
            addCriterion("err_message is not null");
            return (Criteria) this;
        }

        public Criteria andErrMessageEqualTo(String value) {
            addCriterion("err_message =", value, "errMessage");
            return (Criteria) this;
        }

        public Criteria andErrMessageNotEqualTo(String value) {
            addCriterion("err_message <>", value, "errMessage");
            return (Criteria) this;
        }

        public Criteria andErrMessageGreaterThan(String value) {
            addCriterion("err_message >", value, "errMessage");
            return (Criteria) this;
        }

        public Criteria andErrMessageGreaterThanOrEqualTo(String value) {
            addCriterion("err_message >=", value, "errMessage");
            return (Criteria) this;
        }

        public Criteria andErrMessageLessThan(String value) {
            addCriterion("err_message <", value, "errMessage");
            return (Criteria) this;
        }

        public Criteria andErrMessageLessThanOrEqualTo(String value) {
            addCriterion("err_message <=", value, "errMessage");
            return (Criteria) this;
        }

        public Criteria andErrMessageLike(String value) {
            addCriterion("err_message like", value, "errMessage");
            return (Criteria) this;
        }

        public Criteria andErrMessageNotLike(String value) {
            addCriterion("err_message not like", value, "errMessage");
            return (Criteria) this;
        }

        public Criteria andErrMessageIn(List<String> values) {
            addCriterion("err_message in", values, "errMessage");
            return (Criteria) this;
        }

        public Criteria andErrMessageNotIn(List<String> values) {
            addCriterion("err_message not in", values, "errMessage");
            return (Criteria) this;
        }

        public Criteria andErrMessageBetween(String value1, String value2) {
            addCriterion("err_message between", value1, value2, "errMessage");
            return (Criteria) this;
        }

        public Criteria andErrMessageNotBetween(String value1, String value2) {
            addCriterion("err_message not between", value1, value2, "errMessage");
            return (Criteria) this;
        }

        public Criteria andTransportFreIsNull() {
            addCriterion("transport_fre is null");
            return (Criteria) this;
        }

        public Criteria andTransportFreIsNotNull() {
            addCriterion("transport_fre is not null");
            return (Criteria) this;
        }

        public Criteria andTransportFreEqualTo(Integer value) {
            addCriterion("transport_fre =", value, "transportFre");
            return (Criteria) this;
        }

        public Criteria andTransportFreNotEqualTo(Integer value) {
            addCriterion("transport_fre <>", value, "transportFre");
            return (Criteria) this;
        }

        public Criteria andTransportFreGreaterThan(Integer value) {
            addCriterion("transport_fre >", value, "transportFre");
            return (Criteria) this;
        }

        public Criteria andTransportFreGreaterThanOrEqualTo(Integer value) {
            addCriterion("transport_fre >=", value, "transportFre");
            return (Criteria) this;
        }

        public Criteria andTransportFreLessThan(Integer value) {
            addCriterion("transport_fre <", value, "transportFre");
            return (Criteria) this;
        }

        public Criteria andTransportFreLessThanOrEqualTo(Integer value) {
            addCriterion("transport_fre <=", value, "transportFre");
            return (Criteria) this;
        }

        public Criteria andTransportFreIn(List<Integer> values) {
            addCriterion("transport_fre in", values, "transportFre");
            return (Criteria) this;
        }

        public Criteria andTransportFreNotIn(List<Integer> values) {
            addCriterion("transport_fre not in", values, "transportFre");
            return (Criteria) this;
        }

        public Criteria andTransportFreBetween(Integer value1, Integer value2) {
            addCriterion("transport_fre between", value1, value2, "transportFre");
            return (Criteria) this;
        }

        public Criteria andTransportFreNotBetween(Integer value1, Integer value2) {
            addCriterion("transport_fre not between", value1, value2, "transportFre");
            return (Criteria) this;
        }

        public Criteria andTransportNoIsNull() {
            addCriterion("transport_no is null");
            return (Criteria) this;
        }

        public Criteria andTransportNoIsNotNull() {
            addCriterion("transport_no is not null");
            return (Criteria) this;
        }

        public Criteria andTransportNoEqualTo(String value) {
            addCriterion("transport_no =", value, "transportNo");
            return (Criteria) this;
        }

        public Criteria andTransportNoNotEqualTo(String value) {
            addCriterion("transport_no <>", value, "transportNo");
            return (Criteria) this;
        }

        public Criteria andTransportNoGreaterThan(String value) {
            addCriterion("transport_no >", value, "transportNo");
            return (Criteria) this;
        }

        public Criteria andTransportNoGreaterThanOrEqualTo(String value) {
            addCriterion("transport_no >=", value, "transportNo");
            return (Criteria) this;
        }

        public Criteria andTransportNoLessThan(String value) {
            addCriterion("transport_no <", value, "transportNo");
            return (Criteria) this;
        }

        public Criteria andTransportNoLessThanOrEqualTo(String value) {
            addCriterion("transport_no <=", value, "transportNo");
            return (Criteria) this;
        }

        public Criteria andTransportNoLike(String value) {
            addCriterion("transport_no like", value, "transportNo");
            return (Criteria) this;
        }

        public Criteria andTransportNoNotLike(String value) {
            addCriterion("transport_no not like", value, "transportNo");
            return (Criteria) this;
        }

        public Criteria andTransportNoIn(List<String> values) {
            addCriterion("transport_no in", values, "transportNo");
            return (Criteria) this;
        }

        public Criteria andTransportNoNotIn(List<String> values) {
            addCriterion("transport_no not in", values, "transportNo");
            return (Criteria) this;
        }

        public Criteria andTransportNoBetween(String value1, String value2) {
            addCriterion("transport_no between", value1, value2, "transportNo");
            return (Criteria) this;
        }

        public Criteria andTransportNoNotBetween(String value1, String value2) {
            addCriterion("transport_no not between", value1, value2, "transportNo");
            return (Criteria) this;
        }

        public Criteria andReTransportFreIsNull() {
            addCriterion("re_transport_fre is null");
            return (Criteria) this;
        }

        public Criteria andReTransportFreIsNotNull() {
            addCriterion("re_transport_fre is not null");
            return (Criteria) this;
        }

        public Criteria andReTransportFreEqualTo(Integer value) {
            addCriterion("re_transport_fre =", value, "reTransportFre");
            return (Criteria) this;
        }

        public Criteria andReTransportFreNotEqualTo(Integer value) {
            addCriterion("re_transport_fre <>", value, "reTransportFre");
            return (Criteria) this;
        }

        public Criteria andReTransportFreGreaterThan(Integer value) {
            addCriterion("re_transport_fre >", value, "reTransportFre");
            return (Criteria) this;
        }

        public Criteria andReTransportFreGreaterThanOrEqualTo(Integer value) {
            addCriterion("re_transport_fre >=", value, "reTransportFre");
            return (Criteria) this;
        }

        public Criteria andReTransportFreLessThan(Integer value) {
            addCriterion("re_transport_fre <", value, "reTransportFre");
            return (Criteria) this;
        }

        public Criteria andReTransportFreLessThanOrEqualTo(Integer value) {
            addCriterion("re_transport_fre <=", value, "reTransportFre");
            return (Criteria) this;
        }

        public Criteria andReTransportFreIn(List<Integer> values) {
            addCriterion("re_transport_fre in", values, "reTransportFre");
            return (Criteria) this;
        }

        public Criteria andReTransportFreNotIn(List<Integer> values) {
            addCriterion("re_transport_fre not in", values, "reTransportFre");
            return (Criteria) this;
        }

        public Criteria andReTransportFreBetween(Integer value1, Integer value2) {
            addCriterion("re_transport_fre between", value1, value2, "reTransportFre");
            return (Criteria) this;
        }

        public Criteria andReTransportFreNotBetween(Integer value1, Integer value2) {
            addCriterion("re_transport_fre not between", value1, value2, "reTransportFre");
            return (Criteria) this;
        }

        public Criteria andReTransportNoIsNull() {
            addCriterion("re_transport_no is null");
            return (Criteria) this;
        }

        public Criteria andReTransportNoIsNotNull() {
            addCriterion("re_transport_no is not null");
            return (Criteria) this;
        }

        public Criteria andReTransportNoEqualTo(String value) {
            addCriterion("re_transport_no =", value, "reTransportNo");
            return (Criteria) this;
        }

        public Criteria andReTransportNoNotEqualTo(String value) {
            addCriterion("re_transport_no <>", value, "reTransportNo");
            return (Criteria) this;
        }

        public Criteria andReTransportNoGreaterThan(String value) {
            addCriterion("re_transport_no >", value, "reTransportNo");
            return (Criteria) this;
        }

        public Criteria andReTransportNoGreaterThanOrEqualTo(String value) {
            addCriterion("re_transport_no >=", value, "reTransportNo");
            return (Criteria) this;
        }

        public Criteria andReTransportNoLessThan(String value) {
            addCriterion("re_transport_no <", value, "reTransportNo");
            return (Criteria) this;
        }

        public Criteria andReTransportNoLessThanOrEqualTo(String value) {
            addCriterion("re_transport_no <=", value, "reTransportNo");
            return (Criteria) this;
        }

        public Criteria andReTransportNoLike(String value) {
            addCriterion("re_transport_no like", value, "reTransportNo");
            return (Criteria) this;
        }

        public Criteria andReTransportNoNotLike(String value) {
            addCriterion("re_transport_no not like", value, "reTransportNo");
            return (Criteria) this;
        }

        public Criteria andReTransportNoIn(List<String> values) {
            addCriterion("re_transport_no in", values, "reTransportNo");
            return (Criteria) this;
        }

        public Criteria andReTransportNoNotIn(List<String> values) {
            addCriterion("re_transport_no not in", values, "reTransportNo");
            return (Criteria) this;
        }

        public Criteria andReTransportNoBetween(String value1, String value2) {
            addCriterion("re_transport_no between", value1, value2, "reTransportNo");
            return (Criteria) this;
        }

        public Criteria andReTransportNoNotBetween(String value1, String value2) {
            addCriterion("re_transport_no not between", value1, value2, "reTransportNo");
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