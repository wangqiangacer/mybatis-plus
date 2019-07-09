package com.baomidou.mybatisplus.samples.quickstart.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class CityConstant {
    //@TableId(type = IdType.AUTO)
    private Integer id;

    private  String cityName;

    public CityConstant(String cityName) {
        this.cityName = cityName;
    }

    public CityConstant(Integer id, String cityName) {
        this.id = id;
        this.cityName = cityName;
    }

    public CityConstant() {
    }
}
