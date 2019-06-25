package com.baomidou.mybatisplus.samples.quickstart.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    private  Long id;
    private String name;
    private int age;
   private  String email;
}
