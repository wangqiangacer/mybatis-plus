package com.baomidou.mybatisplus.samples.quickstart.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * @author wangqinag
 * @version 1.0
 * @date 2020/5/26 16:22
 */
@Data
public class TestUser {

    @TableId(value = "id",type = IdType.AUTO)//指定自增策略
    private  Integer id;

    private  String name;

    private  Integer age;
}
