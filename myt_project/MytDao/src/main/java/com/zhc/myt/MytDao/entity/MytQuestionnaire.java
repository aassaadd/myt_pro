package com.zhc.myt.MytDao.entity;

import java.util.Date;

public class MytQuestionnaire {
    private Integer id;

    private Integer partentId;

    private String proId;

    private String proNo;

    private String quDescription;

    private String quJson;

    private String quName;

    private String quType;

    private Integer imgId;

    private Integer img2Id;

    private Integer img1Id;

    private Integer img3Id;

    private Integer img4Id;

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

    public Integer getPartentId() {
        return partentId;
    }

    public void setPartentId(Integer partentId) {
        this.partentId = partentId;
    }

    public String getProId() {
        return proId;
    }

    public void setProId(String proId) {
        this.proId = proId == null ? null : proId.trim();
    }

    public String getProNo() {
        return proNo;
    }

    public void setProNo(String proNo) {
        this.proNo = proNo == null ? null : proNo.trim();
    }

    public String getQuDescription() {
        return quDescription;
    }

    public void setQuDescription(String quDescription) {
        this.quDescription = quDescription == null ? null : quDescription.trim();
    }

    public String getQuJson() {
        return quJson;
    }

    public void setQuJson(String quJson) {
        this.quJson = quJson == null ? null : quJson.trim();
    }

    public String getQuName() {
        return quName;
    }

    public void setQuName(String quName) {
        this.quName = quName == null ? null : quName.trim();
    }

    public String getQuType() {
        return quType;
    }

    public void setQuType(String quType) {
        this.quType = quType == null ? null : quType.trim();
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