package com.baomidou.mybatisplus.samples.quickstart.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Alias("User")
public class User {
    @TableId(type = IdType.ID_WORKER)
    private  Long id;
    private String name;
    private int age;
   private  String email;
}
