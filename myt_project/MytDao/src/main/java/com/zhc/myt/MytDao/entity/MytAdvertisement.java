package com.zhc.myt.MytDao.entity;

import java.util.Date;

public class MytAdvertisement {
    private Integer id;

    private String advTitle;

    private String advMch;

    private String advType;

    private String advUrl;

    private Integer advImgId;

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

    public String getAdvTitle() {
        return advTitle;
    }

    public void setAdvTitle(String advTitle) {
        this.advTitle = advTitle == null ? null : advTitle.trim();
    }

    public String getAdvMch() {
        return advMch;
    }

    public void setAdvMch(String advMch) {
        this.advMch = advMch == null ? null : advMch.trim();
    }

    public String getAdvType() {
        return advType;
    }

    public void setAdvType(String advType) {
        this.advType = advType == null ? null : advType.trim();
    }

    public String getAdvUrl() {
        return advUrl;
    }

    public void setAdvUrl(String advUrl) {
        this.advUrl = advUrl == null ? null : advUrl.trim();
    }

    public Integer getAdvImgId() {
        return advImgId;
    }

    public void setAdvImgId(Integer advImgId) {
        this.advImgId = advImgId;
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