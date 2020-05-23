package com.baomidou.mybatisplus.samples.quickstart.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.samples.quickstart.domain.User;
import com.baomidou.mybatisplus.samples.quickstart.request.UserRequest;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface UserMapper extends BaseMapper<User> {
    @Select("{call findUser(#{id, jdbcType = INTEGER, mode = IN})}")
    User findOne(Integer id);

    User selectUser(Integer id);

    User findConditon(@Param("request") UserRequest request);

    void updateUser(@Param("request") UserRequest request);

    List<User> findUserIds(List<Integer> ids);

    List<User> findUserMap(Map paramMap);


    User selectByNameAndAge(@Param("name") String name,@Param("age") Integer age);


}
