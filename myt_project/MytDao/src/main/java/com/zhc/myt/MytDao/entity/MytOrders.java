package com.zhc.myt.MytDao.entity;

import java.util.Date;

public class MytOrders {
    private Integer id;

    private Integer wxUserId;

    private Integer proId;

    private String proName;

    private Long proOneFee;

    private Integer proImgId;

    private String orderNo;

    private String orderBankType;

    private String orderBody;

    private Integer orderGoodsNum;

    private String orderStatus;

    private Long orderTotalFee;

    private Long orderRealityFee;

    private Date orderCreateTime;

    private Date orderPayTime;

    private String orderSequenceNo;

    private String wxOpenid;

    private String wxAuthCode;

    private Integer mchId;

    private String errMessage;

    private Integer transportFre;

    private String transportNo;

    private Integer reTransportFre;

    private String reTransportNo;

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

    public Integer getWxUserId() {
        return wxUserId;
    }

    public void setWxUserId(Integer wxUserId) {
        this.wxUserId = wxUserId;
    }

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName == null ? null : proName.trim();
    }

    public Long getProOneFee() {
        return proOneFee;
    }

    public void setProOneFee(Long proOneFee) {
        this.proOneFee = proOneFee;
    }

    public Integer getProImgId() {
        return proImgId;
    }

    public void setProImgId(Integer proImgId) {
        this.proImgId = proImgId;
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

    public Integer getOrderGoodsNum() {
        return orderGoodsNum;
    }

    public void setOrderGoodsNum(Integer orderGoodsNum) {
        this.orderGoodsNum = orderGoodsNum;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus == null ? null : orderStatus.trim();
    }

    public Long getOrderTotalFee() {
        return orderTotalFee;
    }

    public void setOrderTotalFee(Long orderTotalFee) {
        this.orderTotalFee = orderTotalFee;
    }

    public Long getOrderRealityFee() {
        return orderRealityFee;
    }

    public void setOrderRealityFee(Long orderRealityFee) {
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

    public String getWxOpenid() {
        return wxOpenid;
    }

    public void setWxOpenid(String wxOpenid) {
        this.wxOpenid = wxOpenid == null ? null : wxOpenid.trim();
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

    public Integer getTransportFre() {
        return transportFre;
    }

    public void setTransportFre(Integer transportFre) {
        this.transportFre = transportFre;
    }

    public String getTransportNo() {
        return transportNo;
    }

    public void setTransportNo(String transportNo) {
        this.transportNo = transportNo == null ? null : transportNo.trim();
    }

    public Integer getReTransportFre() {
        return reTransportFre;
    }

    public void setReTransportFre(Integer reTransportFre) {
        this.reTransportFre = reTransportFre;
    }

    public String getReTransportNo() {
        return reTransportNo;
    }

    public void setReTransportNo(String reTransportNo) {
        this.reTransportNo = reTransportNo == null ? null : reTransportNo.trim();
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