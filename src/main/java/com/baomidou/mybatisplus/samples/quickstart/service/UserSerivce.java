package com.baomidou.mybatisplus.samples.quickstart.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.samples.quickstart.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface UserSerivce extends IService<User> {


    /**
     * <p>
     * 插入（批量），该方法不适合 Oracle
     * </p>
     *
     * @param userList 实体对象列表
     * @return boolean
     */
    boolean insertBatch(List<User> userList);
}
