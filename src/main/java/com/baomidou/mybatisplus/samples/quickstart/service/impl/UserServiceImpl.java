package com.baomidou.mybatisplus.samples.quickstart.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baomidou.mybatisplus.samples.quickstart.domain.User;
import com.baomidou.mybatisplus.samples.quickstart.mapper.UserMapper;
import com.baomidou.mybatisplus.samples.quickstart.service.UserSerivce;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@SuppressWarnings("all")
@Service
@Slf4j
public class UserServiceImpl  extends ServiceImpl<UserMapper, User> implements UserSerivce {



    @Autowired
    private  UserMapper userMapper;

    @Override
    public boolean insertBatch(List<User> userList) {

        return false;
    }

    @Override
    public User selectByNameAge(String name, Integer age) {
        if (StringUtils.isNoneBlank(name)){
          return   userMapper.selectByNameAndAge(name,age);
        }
        return null;
    }
}
