package com.zhc.myt.MytDao.entity;

import java.util.Date;

public class MytMerchant {
    private Integer id;

    private String mchName;

    private String mchDescription;

    private Integer mchLogoId;

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

    public String getMchName() {
        return mchName;
    }

    public void setMchName(String mchName) {
        this.mchName = mchName == null ? null : mchName.trim();
    }

    public String getMchDescription() {
        return mchDescription;
    }

    public void setMchDescription(String mchDescription) {
        this.mchDescription = mchDescription == null ? null : mchDescription.trim();
    }

    public Integer getMchLogoId() {
        return mchLogoId;
    }

    public void setMchLogoId(Integer mchLogoId) {
        this.mchLogoId = mchLogoId;
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