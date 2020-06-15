package com.baomidou.mybatisplus.samples.quickstart.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baomidou.mybatisplus.samples.quickstart.domain.LoanProduct;
import com.baomidou.mybatisplus.samples.quickstart.mapper.LoanProductMapper;
import com.baomidou.mybatisplus.samples.quickstart.service.LoanProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class LoanProductServiceImpl extends ServiceImpl<LoanProductMapper, LoanProduct> implements LoanProductService {

}
