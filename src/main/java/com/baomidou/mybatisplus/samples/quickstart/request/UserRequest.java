package com.baomidou.mybatisplus.samples.quickstart.request;

import lombok.Data;

@Data
public class UserRequest {
    private  Long id;
    private String name;
    private int age;
    private  String email;
}
