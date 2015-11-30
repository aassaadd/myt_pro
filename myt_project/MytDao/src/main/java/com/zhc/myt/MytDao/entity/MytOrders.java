package com.zhc.myt.MytDao.entity;

import java.util.Date;

public class MytOrders {
    private Integer id;

    private String orderNo;

    private String orderBankType;

    private String orderBody;

    private Byte orderGoodsNum;

    private String orderStatus;

    private Float orderTotalFee;

    private Float orderRealityFee;

    private Date orderCreateTime;

    private Date orderPayTime;

    private String orderSequenceNo;

    private String wxAppid;

    private String wxMchId;

    private String wxSubAppid;

    private String wxSubMchId;

    private String wxOpenid;

    private String wxSubOpenid;

    private String wxAuthCode;

    private Integer mchId;

    private String errMessage;

    private String status;

    private Integer optId;

    private Date optDate;

    private Date createDate;

    private Integer createId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public String getOrderBankType() {
        return orderBankType;
    }

    public void setOrderBankType(String orderBankType) {
        this.orderBankType = orderBankType == null ? null : orderBankType.trim();
    }

    public String getOrderBody() {
        return orderBody;
    }

    public void setOrderBody(String orderBody) {
        this.orderBody = orderBody == null ? null : orderBody.trim();
    }

    public Byte getOrderGoodsNum() {
        return orderGoodsNum;
    }

    public void setOrderGoodsNum(Byte orderGoodsNum) {
        this.orderGoodsNum = orderGoodsNum;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus == null ? null : orderStatus.trim();
    }

    public Float getOrderTotalFee() {
        return orderTotalFee;
    }

    public void setOrderTotalFee(Float orderTotalFee) {
        this.orderTotalFee = orderTotalFee;
    }

    public Float getOrderRealityFee() {
        return orderRealityFee;
    }

    public void setOrderRealityFee(Float orderRealityFee) {
        this.orderRealityFee = orderRealityFee;
    }

    public Date getOrderCreateTime() {
        return orderCreateTime;
    }

    public void setOrderCreateTime(Date orderCreateTime) {
        this.orderCreateTime = orderCreateTime;
    }

    public Date getOrderPayTime() {
        return orderPayTime;
    }

    public void setOrderPayTime(Date orderPayTime) {
        this.orderPayTime = orderPayTime;
    }

    public String getOrderSequenceNo() {
        return orderSequenceNo;
    }

    public void setOrderSequenceNo(String orderSequenceNo) {
        this.orderSequenceNo = orderSequenceNo == null ? null : orderSequenceNo.trim();
    }

    public String getWxAppid() {
        return wxAppid;
    }

    public void setWxAppid(String wxAppid) {
        this.wxAppid = wxAppid == null ? null : wxAppid.trim();
    }

    public String getWxMchId() {
        return wxMchId;
    }

    public void setWxMchId(String wxMchId) {
        this.wxMchId = wxMchId == null ? null : wxMchId.trim();
    }

    public String getWxSubAppid() {
        return wxSubAppid;
    }

    public void setWxSubAppid(String wxSubAppid) {
        this.wxSubAppid = wxSubAppid == null ? null : wxSubAppid.trim();
    }

    public String getWxSubMchId() {
        return wxSubMchId;
    }

    public void setWxSubMchId(String wxSubMchId) {
        this.wxSubMchId = wxSubMchId == null ? null : wxSubMchId.trim();
    }

    public String getWxOpenid() {
        return wxOpenid;
    }

    public void setWxOpenid(String wxOpenid) {
        this.wxOpenid = wxOpenid == null ? null : wxOpenid.trim();
    }

    public String getWxSubOpenid() {
        return wxSubOpenid;
    }

    public void setWxSubOpenid(String wxSubOpenid) {
        this.wxSubOpenid = wxSubOpenid == null ? null : wxSubOpenid.trim();
    }

    public String getWxAuthCode() {
        return wxAuthCode;
    }

    public void setWxAuthCode(String wxAuthCode) {
        this.wxAuthCode = wxAuthCode == null ? null : wxAuthCode.trim();
    }

    public Integer getMchId() {
        return mchId;
    }

    public void setMchId(Integer mchId) {
        this.mchId = mchId;
    }

    public String getErrMessage() {
        return errMessage;
    }

    public void setErrMessage(String errMessage) {
        this.errMessage = errMessage == null ? null : errMessage.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getOptId() {
        return optId;
    }

    public void setOptId(Integer optId) {
        this.optId = optId;
    }

    public Date getOptDate() {
        return optDate;
    }

    public void setOptDate(Date optDate) {
        this.optDate = optDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getCreateId() {
        return createId;
    }

    public void setCreateId(Integer createId) {
        this.createId = createId;
    }
}