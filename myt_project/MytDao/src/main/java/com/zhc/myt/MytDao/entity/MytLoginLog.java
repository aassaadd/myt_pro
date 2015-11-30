package com.zhc.myt.MytDao.entity;

import java.util.Date;

public class MytLoginLog {
    private Integer id;

    private String explorerName;

    private String explorerVer;

    private String explorerPlug;

    private String osName;

    private String about;

    private String clientIp;

    private String clientName;

    private String userName;

    private String type;

    private Date createDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getExplorerName() {
        return explorerName;
    }

    public void setExplorerName(String explorerName) {
        this.explorerName = explorerName == null ? null : explorerName.trim();
    }

    public String getExplorerVer() {
        return explorerVer;
    }

    public void setExplorerVer(String explorerVer) {
        this.explorerVer = explorerVer == null ? null : explorerVer.trim();
    }

    public String getExplorerPlug() {
        return explorerPlug;
    }

    public void setExplorerPlug(String explorerPlug) {
        this.explorerPlug = explorerPlug == null ? null : explorerPlug.trim();
    }

    public String getOsName() {
        return osName;
    }

    public void setOsName(String osName) {
        this.osName = osName == null ? null : osName.trim();
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about == null ? null : about.trim();
    }

    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp == null ? null : clientIp.trim();
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName == null ? null : clientName.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}