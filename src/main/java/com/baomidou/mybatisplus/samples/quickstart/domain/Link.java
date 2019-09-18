package com.baomidou.mybatisplus.samples.quickstart.domain;


public class Link {

  private long id;
  private String linkName;
  private String jumpUrl;
  private long level;
  private java.sql.Timestamp createDate;
  private java.sql.Timestamp updateDate;



  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getLinkName() {
    return linkName;
  }

  public void setLinkName(String linkName) {
    this.linkName = linkName;
  }


  public String getJumpUrl() {
    return jumpUrl;
  }

  public void setJumpUrl(String jumpUrl) {
    this.jumpUrl = jumpUrl;
  }


  public long getLevel() {
    return level;
  }

  public void setLevel(long level) {
    this.level = level;
  }


  public java.sql.Timestamp getCreateDate() {
    return createDate;
  }

  public void setCreateDate(java.sql.Timestamp createDate) {
    this.createDate = createDate;
  }


  public java.sql.Timestamp getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(java.sql.Timestamp updateDate) {
    this.updateDate = updateDate;
  }

}
