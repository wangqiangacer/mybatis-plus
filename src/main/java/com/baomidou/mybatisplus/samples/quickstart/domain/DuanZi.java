package com.baomidou.mybatisplus.samples.quickstart.domain;

import lombok.Data;

@Data
public class DuanZi {
    private Integer id;
    private  String content;

    public DuanZi(Integer id, String content) {
        this.id = id;
        this.content = content;
    }

    public DuanZi() {
    }
}
