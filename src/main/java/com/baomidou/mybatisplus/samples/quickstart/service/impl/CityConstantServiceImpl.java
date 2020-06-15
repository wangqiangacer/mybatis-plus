package com.baomidou.mybatisplus.samples.quickstart.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baomidou.mybatisplus.samples.quickstart.domain.CityConstant;
import com.baomidou.mybatisplus.samples.quickstart.domain.User;
import com.baomidou.mybatisplus.samples.quickstart.mapper.CityConstantMapper;
import com.baomidou.mybatisplus.samples.quickstart.mapper.UserMapper;
import com.baomidou.mybatisplus.samples.quickstart.service.CityConstantService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@SuppressWarnings("all")
@Service
@Slf4j
public class CityConstantServiceImpl  extends ServiceImpl<CityConstantMapper, CityConstant> implements CityConstantService {
}
