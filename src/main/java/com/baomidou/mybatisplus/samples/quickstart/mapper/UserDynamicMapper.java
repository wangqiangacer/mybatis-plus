package com.baomidou.mybatisplus.samples.quickstart.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.samples.quickstart.domain.TestUser;
import com.baomidou.mybatisplus.samples.quickstart.domain.UserDynamic;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author wangqinag
 * @version 1.0
 * @date 2020/6/15 16:42
 */
@Mapper
public interface UserDynamicMapper  extends BaseMapper<UserDynamic> {
}
