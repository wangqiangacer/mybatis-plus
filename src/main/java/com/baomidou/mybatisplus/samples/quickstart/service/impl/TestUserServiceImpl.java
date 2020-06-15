package com.baomidou.mybatisplus.samples.quickstart.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baomidou.mybatisplus.samples.quickstart.domain.TestUser;
import com.baomidou.mybatisplus.samples.quickstart.domain.User;
import com.baomidou.mybatisplus.samples.quickstart.mapper.TestUserMapper;
import com.baomidou.mybatisplus.samples.quickstart.mapper.UserMapper;
import com.baomidou.mybatisplus.samples.quickstart.service.TestUserService;
import com.baomidou.mybatisplus.samples.quickstart.service.UserSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wangqinag
 * @version 1.0
 * @date 2020/5/26 16:27
 */
@Service
public class TestUserServiceImpl extends ServiceImpl<TestUserMapper, TestUser> implements TestUserService {

    @Autowired
    private  TestUserMapper testUserMapper;

    @Override
    public void insertUser() {
        for (int i = 1; i < 100; i++) {
            TestUser testUser1 = new TestUser();
            testUser1.setName("小明");
            testUser1.setAge(21);
            testUserMapper.insert(testUser1);
        }
    }
}
