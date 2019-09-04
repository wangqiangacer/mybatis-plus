package com.baomidou.mybatisplus.samples.quickstart.domain;

import com.baomidou.mybatisplus.annotation.FieldStrategy;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class WindowTab implements Serializable {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Long id;


    /**
     * 橱窗名
     */
    private String name;

    /**
     * 橱窗位置 1:首页
     */
    private Integer location;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * logo图片地址
     */
    private String logo;

    /**
     * 角标0：默认，1：最新，2：最热
     */
    private Integer mark;

    /**
     * 角标
     */
    @TableField(strategy = FieldStrategy.IGNORED)
    private String markStr;

    /**
     * 跳转方式：1:内链、2:外链、3:产品
     */
    private Integer jumpType;

    /**
     * 跳转地址
     */
    private String jumpUrl;

    private Date createTime;

    private Date updateTime;

    /**
     * 1正常
     */
    private Integer status;

    /**
     * 1:全部用户 2:未登录用户 3:已登录用户 4:渠道用户------>（5.2.3）5:新用户 6:老用户
     */
    private Integer displayType;

    /**
     * 展示设备 0:全部 1：安卓  2：ios
     */
    private Integer displayEquipment;

    /**
     * 展示包名
     */
    private String platfrom;

    /**
     * 上线时间
     */
    @TableField(strategy = FieldStrategy.IGNORED)
    private Date onlineDate;

    /**
     * 下线时间
     */
    @TableField(strategy = FieldStrategy.IGNORED)
    private Date offlineDate;

    private static final long serialVersionUID = 1L;

    private Integer cityLimit;

    @TableField(strategy = FieldStrategy.IGNORED)
    private String city;
}
