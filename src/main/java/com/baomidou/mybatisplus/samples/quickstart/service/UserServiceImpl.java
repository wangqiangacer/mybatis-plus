package com.baomidou.mybatisplus.samples.quickstart.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baomidou.mybatisplus.samples.quickstart.domain.User;
import com.baomidou.mybatisplus.samples.quickstart.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("all")
@Service
@Slf4j
public class UserServiceImpl  extends ServiceImpl<UserMapper, User> implements UserSerivce {



    @Override
    public boolean insertBatch(List<User> userList) {


        return false;
    }
}
