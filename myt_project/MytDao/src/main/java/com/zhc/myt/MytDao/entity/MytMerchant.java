package com.zhc.myt.MytDao.entity;

import java.util.Date;

public class MytMerchant {
    private Integer id;

    private String mchName;

    private String mchDescription;

    private Integer mchLogoId;

    private String mchAddress;

    private String mchCall;

    private String mchAccount;

    private String mchAccountBank;

    private String mchAccountName;

    private String mchPersonInCharge;

    private String mchPersonInChargeCall;

    private String status;

    private Integer optId;

    private Date optDate;

    private Integer createId;

    private Date createDate;

    private String province;

    private String city;

    private String area;

    private String address;

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

    public String getMchAddress() {
        return mchAddress;
    }

    public void setMchAddress(String mchAddress) {
        this.mchAddress = mchAddress == null ? null : mchAddress.trim();
    }

    public String getMchCall() {
        return mchCall;
    }

    public void setMchCall(String mchCall) {
        this.mchCall = mchCall == null ? null : mchCall.trim();
    }

    public String getMchAccount() {
        return mchAccount;
    }

    public void setMchAccount(String mchAccount) {
        this.mchAccount = mchAccount == null ? null : mchAccount.trim();
    }

    public String getMchAccountBank() {
        return mchAccountBank;
    }

    public void setMchAccountBank(String mchAccountBank) {
        this.mchAccountBank = mchAccountBank == null ? null : mchAccountBank.trim();
    }

    public String getMchAccountName() {
        return mchAccountName;
    }

    public void setMchAccountName(String mchAccountName) {
        this.mchAccountName = mchAccountName == null ? null : mchAccountName.trim();
    }

    public String getMchPersonInCharge() {
        return mchPersonInCharge;
    }

    public void setMchPersonInCharge(String mchPersonInCharge) {
        this.mchPersonInCharge = mchPersonInCharge == null ? null : mchPersonInCharge.trim();
    }

    public String getMchPersonInChargeCall() {
        return mchPersonInChargeCall;
    }

    public void setMchPersonInChargeCall(String mchPersonInChargeCall) {
        this.mchPersonInChargeCall = mchPersonInChargeCall == null ? null : mchPersonInChargeCall.trim();
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

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }
}