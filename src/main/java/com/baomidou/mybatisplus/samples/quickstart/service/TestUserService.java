package com.baomidou.mybatisplus.samples.quickstart.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.samples.quickstart.domain.TestUser;
import com.baomidou.mybatisplus.samples.quickstart.domain.User;

/**
 * @author wangqinag
 * @version 1.0
 * @date 2020/5/26 16:26
 */
public interface TestUserService  extends IService<TestUser> {

    void insertUser();
}
