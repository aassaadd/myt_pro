package com.zhc.myt.MytDao.entity;

import java.util.Date;

public class MytQuestionnaireFill {
    private Integer id;

    private Integer quId;

    private Integer proId;

    private String qufDescription;

    private String qufDescriptionBak;

    private String qufJson;

    private String status;

    private Integer optId;

    private Date optDate;

    private Integer createId;

    private Date createDate;

    private String proNo;

    private Integer imgId;

    private Integer img2Id;

    private Integer img1Id;

    private Integer img3Id;

    private Integer img4Id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuId() {
        return quId;
    }

    public void setQuId(Integer quId) {
        this.quId = quId;
    }

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public String getQufDescription() {
        return qufDescription;
    }

    public void setQufDescription(String qufDescription) {
        this.qufDescription = qufDescription == null ? null : qufDescription.trim();
    }

    public String getQufDescriptionBak() {
        return qufDescriptionBak;
    }

    public void setQufDescriptionBak(String qufDescriptionBak) {
        this.qufDescriptionBak = qufDescriptionBak == null ? null : qufDescriptionBak.trim();
    }

    public String getQufJson() {
        return qufJson;
    }

    public void setQufJson(String qufJson) {
        this.qufJson = qufJson == null ? null : qufJson.trim();
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

    public String getProNo() {
        return proNo;
    }

    public void setProNo(String proNo) {
        this.proNo = proNo == null ? null : proNo.trim();
    }

    public Integer getImgId() {
        return imgId;
    }

    public void setImgId(Integer imgId) {
        this.imgId = imgId;
    }

    public Integer getImg2Id() {
        return img2Id;
    }

    public void setImg2Id(Integer img2Id) {
        this.img2Id = img2Id;
    }

    public Integer getImg1Id() {
        return img1Id;
    }

    public void setImg1Id(Integer img1Id) {
        this.img1Id = img1Id;
    }

    public Integer getImg3Id() {
        return img3Id;
    }

    public void setImg3Id(Integer img3Id) {
        this.img3Id = img3Id;
    }

    public Integer getImg4Id() {
        return img4Id;
    }

    public void setImg4Id(Integer img4Id) {
        this.img4Id = img4Id;
    }
}