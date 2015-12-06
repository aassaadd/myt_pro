package com.zhc.myt.MytDao.entity;

import java.util.Date;

public class MytFeedback {
    private Integer id;

    private Integer proId;

    private Integer wxUserId;

    private String fbkContent;

    private String fbkClass;

    private String fbkType;

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

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public Integer getWxUserId() {
        return wxUserId;
    }

    public void setWxUserId(Integer wxUserId) {
        this.wxUserId = wxUserId;
    }

    public String getFbkContent() {
        return fbkContent;
    }

    public void setFbkContent(String fbkContent) {
        this.fbkContent = fbkContent == null ? null : fbkContent.trim();
    }

    public String getFbkClass() {
        return fbkClass;
    }

    public void setFbkClass(String fbkClass) {
        this.fbkClass = fbkClass == null ? null : fbkClass.trim();
    }

    public String getFbkType() {
        return fbkType;
    }

    public void setFbkType(String fbkType) {
        this.fbkType = fbkType == null ? null : fbkType.trim();
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