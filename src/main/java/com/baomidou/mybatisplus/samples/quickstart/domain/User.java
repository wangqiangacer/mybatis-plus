package com.baomidou.mybatisplus.samples.quickstart.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@AllArgsConstructor
@Alias("User")
public class User {
    private  Long id;
    private String name;
    private int age;
   private  String email;
}
