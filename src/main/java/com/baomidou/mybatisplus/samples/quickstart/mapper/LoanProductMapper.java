package com.baomidou.mybatisplus.samples.quickstart.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.samples.quickstart.domain.LoanProduct;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoanProductMapper extends BaseMapper<LoanProduct>{
    List<LoanProduct> findByLoanProduct();


}
