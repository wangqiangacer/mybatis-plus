package com.baomidou.mybatisplus.samples.quickstart.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.samples.quickstart.domain.TestUser;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author wangqinag
 * @version 1.0
 * @date 2020/5/26 16:27
 */
@Mapper
public interface TestUserMapper extends BaseMapper<TestUser> {
}
