package com.baomidou.mybatisplus.samples.quickstart;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.samples.quickstart.Common.PageModel;
import com.baomidou.mybatisplus.samples.quickstart.domain.LoanProduct;
import com.baomidou.mybatisplus.samples.quickstart.domain.User;
import com.baomidou.mybatisplus.samples.quickstart.domain.WindowTab;
import com.baomidou.mybatisplus.samples.quickstart.mapper.LoanProductMapper;
import com.baomidou.mybatisplus.samples.quickstart.mapper.UserMapper;
import com.baomidou.mybatisplus.samples.quickstart.mapper.WindowTabMapper;
import com.baomidou.mybatisplus.samples.quickstart.request.UserRequest;
import com.baomidou.mybatisplus.samples.quickstart.service.*;
import com.jayway.jsonpath.Criteria;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.CollectionUtils;
import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisApplicationTests {
    @Autowired
    private UserMapper  userMapper;
    @Autowired
    private UserServiceImpl userServiceimpl;
    @Autowired
    private CityConstantServiceImpl cityConstantService;
    @Autowired
    private  LoanProductServiceImpl loanProductService;
    @Autowired
    private WindowTabMapper windowTabMapper;
    @Autowired
    private LoanProductMapper loanProductMapper;

    @Autowired
    private  UserSerivce userSerivce;



    @Test
    public  void testUser(){
        userMapper.selectList(null).forEach(user -> {
            System.out.println(user);
        });
    }

    @Test
    public  void  batchInsertUser(){
        ArrayList<User> list = new ArrayList<>(1000);
        for (int i = 2; i < 1000; i++) {
            User user = new User();
            user.setAge(21);
            user.setEmail("www.baidu.com");
            user.setName("xiaoming");
            list.add(user);

        }
        boolean b = userServiceimpl.saveBatch(list);
        if (b){
            System.out.println("批量插入成功");
        }else {
            System.out.println("批量插入失败");
        }
    }
    @Test
    public void contextLoads() {
        List<User> selectList = userMapper.selectList(null);
        for (User user : selectList) {
            System.out.println(user);
        }
    }
    @Test
    public  void  findCondition(){
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.gt("age",20);
        List<User> selectList = userMapper.selectList(wrapper);

        System.out.println("人数为："+userMapper.selectCount(wrapper));
        for (User user : selectList) {
            System.out.println(user);
        }
    }

    @Test
    public  void findPage(){

        Page<User> page1 = new Page<>(1, 2);
        IPage<User> userIPage = userMapper.selectPage(page1, null);

        System.out.println(userIPage.getTotal());


    }

    @Test
    public  void update(){
        //修改值
//        User user = new User();
//        user.setAge(20);
//
//        UpdateWrapper<User> wrapper = new UpdateWrapper<>();
//         wrapper.eq("name", "Tom");
//        int update = userMapper.update(user, wrapper);
//        System.out.println(update);
//        System.out.println(update);
    }

    @Test
    public  void wrapper() {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("name", "Tom");
        // QueryWrapper<User> name = wrapper.select("name");
//        List<Object> objects = userServiceimpl.listObjs(name,Object::toString);
//        objects.stream().forEach(s-> System.out.println(s));

        List<User> list = userServiceimpl.list(wrapper);
        for (User user : list) {
            System.out.println(user);
        }
    }
    @Test
    public void findPageList(){
        //模糊查询加分页 mybatisplus 中使用QueryWrapper构建查询条件
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.like("name","Tom");
        IPage<User> page = new Page<>(1, 2);
        IPage<User> userIPage = userMapper.selectPage(page, wrapper);
        if(CollectionUtils.isEmpty(userIPage.getRecords())||userIPage.getRecords().size()==0){
            System.out.println("数据查询为空！！！");
        }else {
            HashMap<String, Object> map = new HashMap<>();
            userIPage.getRecords().stream().forEach(item->{

                map.put("name",item.getName());
                map.put("age",item.getAge());
                System.out.println(map);
            });
        }

    }
    @Test
    public  void  findAll(){
        List<User> users = userMapper.selectList(null);
        users.stream().forEach(s-> System.out.println(s));
    }
    @Test
    public  void insert(){
        User user = new User(6L,"Tom1",34,"www.12254");

        userMapper.insert(user);

    }

    @Test
    public  void  findPage1(){

        //模糊查询加分页实现
        IPage<User> userPage =(IPage) new Page<>(1,2);
        QueryWrapper queryWrapper=new QueryWrapper();
      //queryWrapper.eq("name","Tom");
      queryWrapper.like("name","Tom");

//        String name="Tom";
//        Pattern pattern=Pattern.compile("^.*"+name+".*$", Pattern.CASE_INSENSITIVE);
//        Criteria criteria=Criteria.where("name").regex(pattern);
        IPage<User> userIPage = userMapper.selectPage(userPage, queryWrapper);
       if(null==userIPage.getRecords()||userIPage.getSize()==0){
           System.out.println("数据不存在！！！！");
       }else {
           userIPage.getRecords().stream().forEach(item->{
               HashMap<String, Object> map = new HashMap<>();
               map.put("name",item.getName());
               map.put("age",item.getAge());
               System.out.println(map);
           });
       }
    }
    @Test
    public  void findOne(){

        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.gt("id",2);
        userMapper.selectList(wrapper).stream().forEach(user -> System.out.println(user));
    }

    @Test
    public  void findMap(){
        List<User> list = userMapper.selectList(null);

        //按照年龄排序
        Comparator<User> comparing = Comparator.comparing(User::getAge);
        List<User> list1 = list.stream().sorted(comparing).collect(Collectors.toList());
        list1.stream().forEach(user -> System.out.println(user));
    }
    @Test
    public  void updateById(){
        User user = new User(1L, "xioaming", 23, "www.baidu.com");
       userMapper.updateById(user);

    }
    @Test
    public  void selectById(){
        User user = userMapper.selectById(1l);
        System.out.println(user);
    }
    @Test
    public  void selectCount(){
        QueryWrapper wrapper =new QueryWrapper();
        wrapper.gt("id",1);
        Integer integer = userMapper.selectCount(wrapper);
        System.out.println(integer);
    }
    @Test
    public  void selectPage(){
        QueryWrapper wrapper =new QueryWrapper();
        wrapper.gt("id",1);
        Page<User> page = new Page<>(1, 3);
        IPage iPage = userMapper.selectPage(page, wrapper);
        System.out.println(iPage.getRecords());
    }

    @Autowired
    private  UserServiceImpl userService;
    @Test
    public  void getOne(){
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.lambda().eq(User::getName,"Tom");
        User user = userServiceimpl.getOne(wrapper);
        System.out.println(user);
    }
    @Test
    public  void exeit(){
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("name","Tom");
        User user = userMapper.selectOne(wrapper);

        //System.out.println(user);
        if(Optional.ofNullable(user).isPresent()){
            System.out.println( "用户已经存在");
        }
    }

    @Test
    public  void findList(){
        Page page = new Page<>(1, 3);
        IPage<User> iPage = userMapper.selectPage(page, null);
        List<User> records = iPage.getRecords();
//        List<Integer> list = records.stream().map(User::getAge).collect(Collectors.toList());
//        for (Integer integer : list) {
//            System.out.println(integer);
//        }

//        List<String> list = records.stream().map(User::getName).collect(Collectors.toList());
//        list.stream().forEach(s -> System.out.println(s));

    }
    @Test
    public  void test111(){
        QueryWrapper<LoanProduct> wrapper = new QueryWrapper<>();
        wrapper.eq("status", 2);
        wrapper.eq("del", 0);
        wrapper.gt("api_category", 0);
        List<LoanProduct> productList = loanProductService.list(wrapper);
        productList.stream().forEach(s-> System.out.println(s));
    }
    @Test
    public  void readFile() throws Exception{
        try{
            String encoding="UTF-8"; //字符编码
            File f = new File("");
            if(f.isFile() && f.exists()){
                InputStreamReader read = new InputStreamReader (new FileInputStream(f),encoding);
                BufferedReader   in   =   new   BufferedReader(read);
                String   line;
                while((line   =   in.readLine())!=null) {
                    System.out.println(line);
                }
                read.close();
            }
        }
        catch(Exception e){
            System.out.println("读取文件内容操作出错");
            e.printStackTrace();
        }
    }
    @Test
    public  void findPages(){
        //分页查询
        Page<User> page = new Page<>(1, 3);
        IPage<User> iPage = userMapper.selectPage(page, Wrappers.<User>lambdaQuery().orderByDesc(User::getId));
        PageModel pageModel = PageModel.buildByIPage(iPage);
        System.out.println(pageModel.getData());
    }
    @Test
    public  void testCompareAge(){
        List<User> list = userMapper.selectList(null);
        //按照年龄排序
        Comparator<User> comparing = Comparator.comparing(User::getAge);
        List<User> users = list.stream().sorted(comparing).collect(Collectors.toList());
        users.stream().forEach(user -> System.out.println(user));
    }

    //模糊查询加分页
    @Test
    public  void findLikePage(){
        Page<User> page = new Page<>(1, 3);
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        String name="Tom";
        Pattern pattern=Pattern.compile("^.*"+name+".*$", Pattern.CASE_INSENSITIVE);
        Criteria criteria=Criteria.where("name").regex(pattern);

        //userMapper.selectList(page,);

    }
    @Test
    public void findWindowTab(){
        Page<WindowTab> page = new Page<>(1, 10);
        QueryWrapper<WindowTab> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("name","关于");
        queryWrapper.orderByAsc("update_time");
        IPage<WindowTab> windowTabIPage = windowTabMapper.selectPage(page, queryWrapper);
        windowTabIPage.getRecords().stream().forEach(windowTab -> System.out.println(windowTab));

    }
    @Test
    public  void findLoanProduct(){
        QueryWrapper<LoanProduct> wrapper = new QueryWrapper<>();
        wrapper.eq("status","2");
        wrapper.orderByAsc("level");
        loanProductMapper.selectList(wrapper).stream().forEach(loanProduct -> System.out.println(loanProduct));
    }
    @Test
    public  void findUser(){
        User user = userMapper.findOne(1);
        System.out.println(user);
    }

    @Test
    public  void selectUser(){
        User user = userMapper.selectUser(1);
        System.out.println(user);
    }

    @Test
    public  void findCondition1(){
        UserRequest request = new UserRequest();
        //request.setName("Jack");
        //request.setAge(23);
        request.setId(4l);
        User user = userMapper.findConditon(request);
        System.out.println(user);
    }

    @Test
    public  void updateUser(){
        UserRequest request = new UserRequest();
        request.setId(4l);
        request.setName("Sandy666");
        //request.setAge(23);
         userMapper.updateUser(request);
    }
    @Test
    public  void findIds(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        List<User> userList = userMapper.findUserIds(list);
        userList.stream().forEach(user -> System.out.println(user));
    }
    @Test
    public  void findUserMap(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        Map map = new HashMap<>();
        map.put("name","Jack");
        map.put("list",list);
        List<User> userList = userMapper.findUserMap(map);
        userList.stream().forEach(user -> System.out.println(user));
    }
}
