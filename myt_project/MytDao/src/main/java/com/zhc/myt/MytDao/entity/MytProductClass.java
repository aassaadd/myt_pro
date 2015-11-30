package com.zhc.myt.MytDao.entity;

import java.util.Date;

public class MytProductClass {
    private Integer id;

    private String procName;

    private String procDescription;

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

    public String getProcName() {
        return procName;
    }

    public void setProcName(String procName) {
        this.procName = procName == null ? null : procName.trim();
    }

    public String getProcDescription() {
        return procDescription;
    }

    public void setProcDescription(String procDescription) {
        this.procDescription = procDescription == null ? null : procDescription.trim();
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