package com.baomidou.mybatisplus.samples.quickstart.domain;


public class AppInfo {

  private long id;
  private String platform;
  private String downloadUrl;
  private String newestVersion;
  private long isUpdate;
  private long isFakeVest;
  private long isCredit;
  private String hotLine;
  private String updateDoc;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;
  private long del;
  private long type;
  private String marketName;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getPlatform() {
    return platform;
  }

  public void setPlatform(String platform) {
    this.platform = platform;
  }


  public String getDownloadUrl() {
    return downloadUrl;
  }

  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }


  public String getNewestVersion() {
    return newestVersion;
  }

  public void setNewestVersion(String newestVersion) {
    this.newestVersion = newestVersion;
  }


  public long getIsUpdate() {
    return isUpdate;
  }

  public void setIsUpdate(long isUpdate) {
    this.isUpdate = isUpdate;
  }


  public long getIsFakeVest() {
    return isFakeVest;
  }

  public void setIsFakeVest(long isFakeVest) {
    this.isFakeVest = isFakeVest;
  }


  public long getIsCredit() {
    return isCredit;
  }

  public void setIsCredit(long isCredit) {
    this.isCredit = isCredit;
  }


  public String getHotLine() {
    return hotLine;
  }

  public void setHotLine(String hotLine) {
    this.hotLine = hotLine;
  }


  public String getUpdateDoc() {
    return updateDoc;
  }

  public void setUpdateDoc(String updateDoc) {
    this.updateDoc = updateDoc;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public java.sql.Timestamp getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(java.sql.Timestamp updateTime) {
    this.updateTime = updateTime;
  }


  public long getDel() {
    return del;
  }

  public void setDel(long del) {
    this.del = del;
  }


  public long getType() {
    return type;
  }

  public void setType(long type) {
    this.type = type;
  }


  public String getMarketName() {
    return marketName;
  }

  public void setMarketName(String marketName) {
    this.marketName = marketName;
  }

}
