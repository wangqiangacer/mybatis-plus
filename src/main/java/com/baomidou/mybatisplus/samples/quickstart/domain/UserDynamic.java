package com.baomidou.mybatisplus.samples.quickstart.domain;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author wangqinag
 * @version 1.0
 * @date 2020/6/15 16:28
 */
@Document(collection = "user_dynamic")
@Data
public class UserDynamic implements Serializable {

    /**
     * 主键id
     */
    private Long id;
    /**
     * 用户id
     */
    private Long userId;
    /**
     * 内容
     */
    private String content;
    /**
     * 视频链接或第一张图片链接
     */
    private String fileUrl;
    /**
     * 图片总数
     */
    private Integer imgNum;
    /**
     * 动态类型 1:图文 2：视频
     */
    private String dynamicType;
    /**
     * 经度
     */
    private BigDecimal lng;
    /**
     * 纬度
     */
    private BigDecimal lat;
    /**
     * 是否阅后即焚 1:是  2:否
     */
    private Integer isBar;
    /**
     * 阅后即焚时间（单位：秒）
     */
    private Integer barSecs;
    /**
     * 位置
     */
    private String location;
    /**
     * 地址
     */
    private String address;
    /**
     * 点赞数量
     */
    private Integer likes;
    /**
     * 评论数量
     */
    private Integer comments;
    /**
     * 状态 1:正常  2:删除   3.待审核   4.审核不通过
     */
    private Integer status;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date modifyTime;
    /**
     * 可见范围 0:世界可见 1:好友圈可见 2:粉丝好友可见 3：仅自己可见
     */
    private Integer visibility;
    /**
     * 是否热门 1：是  2：否
     */
    private Integer isHot;
    /**
     * 热门权重
     */
    private Integer hotWeight;

    /**
     * 热门过期时间
     */
    private Date hotExpireTime;

    /**
     * 可见类型 1：公开  2：指定可见  3：指定不可见
     */
    private Integer visibleType;

    /**
     * 活动审核状态（1.未审核  2.已审核  3.已推热门  4.忽略  5.封禁）
     */
    private Integer activityStatus;


    /**
     * 高
     */
    private Integer height;

    /**
     * 宽
     */
    private Integer width;
}
