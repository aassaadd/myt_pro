package com.zhc.myt.MytDao.entity;

import java.util.Date;

public class MytProduct {
    private Integer id;

    private Integer mchId;

    private Integer procId;

    private String proNo;

    private String proName;

    private String proDescription;

    private Integer proCount;

    private Integer proSoldCount;

    private String proAbout;

    private Long proTryPrice;

    private Long proPrice;

    private String proState;

    private Date proOpenDate;

    private Date proEndDate;

    private String proType;

    private String proExamineType;

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

    public Integer getProcId() {
        return procId;
    }

    public void setProcId(Integer procId) {
        this.procId = procId;
    }

    public String getProNo() {
        return proNo;
    }

    public void setProNo(String proNo) {
        this.proNo = proNo == null ? null : proNo.trim();
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName == null ? null : proName.trim();
    }

    public String getProDescription() {
        return proDescription;
    }

    public void setProDescription(String proDescription) {
        this.proDescription = proDescription == null ? null : proDescription.trim();
    }

    public Integer getProCount() {
        return proCount;
    }

    public void setProCount(Integer proCount) {
        this.proCount = proCount;
    }

    public Integer getProSoldCount() {
        return proSoldCount;
    }

    public void setProSoldCount(Integer proSoldCount) {
        this.proSoldCount = proSoldCount;
    }

    public String getProAbout() {
        return proAbout;
    }

    public void setProAbout(String proAbout) {
        this.proAbout = proAbout == null ? null : proAbout.trim();
    }

    public Long getProTryPrice() {
        return proTryPrice;
    }

    public void setProTryPrice(Long proTryPrice) {
        this.proTryPrice = proTryPrice;
    }

    public Long getProPrice() {
        return proPrice;
    }

    public void setProPrice(Long proPrice) {
        this.proPrice = proPrice;
    }

    public String getProState() {
        return proState;
    }

    public void setProState(String proState) {
        this.proState = proState == null ? null : proState.trim();
    }

    public Date getProOpenDate() {
        return proOpenDate;
    }

    public void setProOpenDate(Date proOpenDate) {
        this.proOpenDate = proOpenDate;
    }

    public Date getProEndDate() {
        return proEndDate;
    }

    public void setProEndDate(Date proEndDate) {
        this.proEndDate = proEndDate;
    }

    public String getProType() {
        return proType;
    }

    public void setProType(String proType) {
        this.proType = proType == null ? null : proType.trim();
    }

    public String getProExamineType() {
        return proExamineType;
    }

    public void setProExamineType(String proExamineType) {
        this.proExamineType = proExamineType == null ? null : proExamineType.trim();
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