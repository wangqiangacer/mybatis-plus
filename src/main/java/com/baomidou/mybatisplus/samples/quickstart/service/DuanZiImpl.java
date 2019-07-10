package com.baomidou.mybatisplus.samples.quickstart.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baomidou.mybatisplus.samples.quickstart.domain.DuanZi;
import com.baomidou.mybatisplus.samples.quickstart.mapper.DuanZiMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@SuppressWarnings("all")
@Service
@Slf4j
public class DuanZiImpl extends ServiceImpl<DuanZiMapper, DuanZi> implements DuanZiService {
}
