package com.baomidou.mybatisplus.samples.quickstart.service;

import com.baomidou.mybatisplus.samples.quickstart.domain.UserDynamic;

/**
 * @author wangqinag
 * @version 1.0
 * @date 2020/6/15 16:39
 */
public interface UserDynamicService {

    /**
     * 插入动态详情
     * @param userDynamic
     */
    void  addUserDynamic(UserDynamic userDynamic);
}
