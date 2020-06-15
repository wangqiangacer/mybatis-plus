package com.baomidou.mybatisplus.samples.quickstart.controller;

import com.baomidou.mybatisplus.samples.quickstart.service.TestUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangqinag
 * @version 1.0
 * @date 2020/5/26 16:33
 */
@RestController
public class TestController {


    @Autowired
    private TestUserService testUserService;

    @RequestMapping("insertUser")
    public  void  insertUser(){
        testUserService.insertUser();
    }
}
