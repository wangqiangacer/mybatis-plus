package com.baomidou.mybatisplus.samples.quickstart;

import com.baomidou.mybatisplus.samples.quickstart.domain.UserDynamic;
import com.baomidou.mybatisplus.samples.quickstart.mapper.UserDynamicMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author wangqinag
 * @version 1.0
 * @date 2020/6/15 16:42
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDynamicTest {


    @Autowired
    private UserDynamicMapper userDynamicMapper;

    @Autowired
    private MongoTemplate mongoTemplate;
    @Test
    public  void  testAddUserDynamic(){
        userDynamicMapper.selectList(null).stream().forEach(userDynamic -> {
//            System.out.println(userDynamic);
            //插入MongoDB
            mongoTemplate.insert(userDynamic,"user_dynamic");
            System.out.println("插入完成");
        });
    }

    /**
     * mongo 条件查询
     */
    @Test
    public  void  testPageUserDynamic(){
        Query query = new Query(Criteria.where("content").is("他特特").and("location").is("成都市 武侯区"));
        List<UserDynamic> list = mongoTemplate.find(query, UserDynamic.class, "user_dynamic");
        for (UserDynamic userDynamic : list) {
            System.out.println(userDynamic);
        }
    }
}
