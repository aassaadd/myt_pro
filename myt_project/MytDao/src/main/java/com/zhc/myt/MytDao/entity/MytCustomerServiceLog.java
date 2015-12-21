package com.zhc.myt.MytDao.entity;

import java.util.Date;

public class MytCustomerServiceLog {
    private Integer id;

    private Integer mchId;

    private String cslNo;

    private String cslName;

    private String cslUserName;

    private String cslUserCall;

    private String cslClass;

    private String cslContent;

    private Integer cslScore;

    private String cslOpinion;

    private Date upDate;

    private String status;

    private Integer optId;

    private Date optDate;

    private Integer createId;

    private Date createDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMchId() {
        return mchId;
    }

    public void setMchId(Integer mchId) {
        this.mchId = mchId;
    }

    public String getCslNo() {
        return cslNo;
    }

    public void setCslNo(String cslNo) {
        this.cslNo = cslNo == null ? null : cslNo.trim();
    }

    public String getCslName() {
        return cslName;
    }

    public void setCslName(String cslName) {
        this.cslName = cslName == null ? null : cslName.trim();
    }

    public String getCslUserName() {
        return cslUserName;
    }

    public void setCslUserName(String cslUserName) {
        this.cslUserName = cslUserName == null ? null : cslUserName.trim();
    }

    public String getCslUserCall() {
        return cslUserCall;
    }

    public void setCslUserCall(String cslUserCall) {
        this.cslUserCall = cslUserCall == null ? null : cslUserCall.trim();
    }

    public String getCslClass() {
        return cslClass;
    }

    public void setCslClass(String cslClass) {
        this.cslClass = cslClass == null ? null : cslClass.trim();
    }

    public String getCslContent() {
        return cslContent;
    }

    public void setCslContent(String cslContent) {
        this.cslContent = cslContent == null ? null : cslContent.trim();
    }

    public Integer getCslScore() {
        return cslScore;
    }

    public void setCslScore(Integer cslScore) {
        this.cslScore = cslScore;
    }

    public String getCslOpinion() {
        return cslOpinion;
    }

    public void setCslOpinion(String cslOpinion) {
        this.cslOpinion = cslOpinion == null ? null : cslOpinion.trim();
    }

    public Date getUpDate() {
        return upDate;
    }

    public void setUpDate(Date upDate) {
        this.upDate = upDate;
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

    public Integer getCreateId() {
        return createId;
    }

    public void setCreateId(Integer createId) {
        this.createId = createId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}