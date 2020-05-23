package com.baomidou.mybatisplus.samples.quickstart.controller;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.samples.quickstart.domain.User;
import com.baomidou.mybatisplus.samples.quickstart.service.UserSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author wangqiang
 * @version 1.0
 * @date 2020/5/23 10:24
 */
@RestController
public class IndexController {

    @Autowired
    private UserSerivce userSerivce;

    @GetMapping("/getUser")
    public String getUser(Integer id){
        List<User> userList = userSerivce.list(new QueryWrapper<User>().eq("id", id));
        return JSONObject.toJSONString(userList);
    }

    @GetMapping("/selectByNameAge")
    public  String selectByNameAge(String name,Integer age){
        return JSONObject.toJSONString(userSerivce.selectByNameAge(name, age));
    }
}
