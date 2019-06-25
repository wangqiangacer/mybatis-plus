package com.baomidou.mybatisplus.samples.quickstart.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class LoanProduct {

    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 修改时间
     */
    private Date updateDate;

    /**
     * 删除
     */
    private Integer del;

    /**
     * 产品名称
     */
    private String loanProductName;

    /**
     * 对接人
     */
    private String picker;


    /**
     * 产品类别
     */
    private Integer loanProductCategory;

    /**
     * API类型 0：普通 1：撞库 2：联登 3：撞库+联登
     */
    private Integer apiCategory;

    /**
     * 设备信息
     */
    private Integer isMobileSupport;

    /**
     * API代码-new
     */
    private String code;

    /**
     * 首页中心展示(0-展示1-不展示)
     */
    private Integer homeShow;

    /**
     * 首页列表展示-new
     */
    private Integer homeListShow;

    /**
     * 产品logo
     */
    private String loanProductLogo;

    /**
     * 产品状态(0:下线 1：隐藏 2：上线)
     */
    private Integer status;

    /**
     * 产品排序
     */
    private Integer level;

    /**
     * 可申请次数
     */
    private Integer allowApplySum;


    /**
     * 产品推广链接
     */
    private String loanProductUrl;

    /**
     * 产品撞库链接
     */
    private String productTestUrl;

    /**
     * 列表标语-new
     */
    private String listSlogan;

    /**
     * 最大带宽金额
     */
    private BigDecimal maxLoanMoney;

    /**
     * 最小带宽金额
     */
    private BigDecimal minLoanMoney;

    /**
     * 放款时间
     */
    private String loanData;

    /**
     * 产品标签
     */
    private String label;

    /**
     * 参考利率-new
     */
    private String interestRate;

    /**
     * 产品介绍-new
     */
    private String loanProductIntroduce;

    /**
     * 机构电话
     */
    private String institutionalPhone;

    /**
     * 申请条件-new
     */
    private String applyCondition;

    /**
     * 更多信息
     */
    private String moreInfo;

    /**********************************************5.1.7新增加字段*************************************/

    /**
     * 是否展示协议 1：否 2：只展示我方协议 3：只展示对方协议 4：都展示
     */
    private Integer isShowTreaty;

    /**
     * 是否默认勾选 0：否 1：是
     */
    private Integer isDefaultCheck;

    /**
     * 我方协议名称
     */
    private String weTreatyName;

    /**
     * 对方协议名称
     */
    private String otherPartyName;

    /**
     * 对方协议URL
     */
    private String otherPartyUrl;
}
