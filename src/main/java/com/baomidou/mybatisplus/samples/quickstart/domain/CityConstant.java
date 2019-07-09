package com.baomidou.mybatisplus.samples.quickstart.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class CityConstant {
    @TableId(type = IdType.AUTO)
    private Long id;

    private  String cityName;
}
