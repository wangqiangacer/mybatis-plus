package com.baomidou.mybatisplus.samples.quickstart.Practic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List languages = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");
        List list=new ArrayList();
       languages.stream().forEach(s->{
           if(languages.size()>0){
                list.add(s);
           }
       });

        System.out.println("list==============="+list.size());
        //languages.stream().forEach(s-> System.out.println(s));
//       languages.stream().filter(new Predicate() {
//           @Override
//           public boolean test(Object o) {
//               return o.equals("Java");
//           }
//       }).forEach(s-> System.out.println(s));

//        List<User> list = new ArrayList<>();
//        User user1 = new User("张三",15,"男");
//        User user2 = new User("李四",22,"男");
//        User user3 = new User("王五",25,"男");
//        User user4 = new User("赵六",30,"男");
//        User user5 = new User("李世民",28,"男");
//        User user6 = new User("杨贵妃",18,"女");
//        User user7 = new User("貂蝉",16,"女");
//        list.add(user1);
//        list.add(user2);
//        list.add(user3);
//        list.add(user4);
//        list.add(user5);
//        list.add(user6);
//        list.add(user7);


//        List<User> list1 = list.stream().filter(user -> !"张三".equals(user.getName())).collect(Collectors.toList());
//        list1.stream().forEach(user -> System.out.println(user));


//        List<User> list1 = list.stream().filter(user -> user.getAge() < 30 && "女".equals(user.getSex())).collect(Collectors.toList());
//        for (User user : list1) {
//            System.out.println(user);
//        }
        //map类型映射转换
//        List<Users> list1 = list.stream().map(user -> new Users(user.getName(), user.getAge(), user.getSex())).collect(Collectors.toList());
//        for (Users users : list1) {
//            System.out.println(users);
//        }
        //age 转map
//        List<Integer> list2 = list.stream().map(user -> user.getAge()).collect(Collectors.toList());
//        for (Integer integer : list2) {
//            System.out.println(integer);
//        }
//        Map<Integer, User> map = list.stream().collect(Collectors.toMap(User::getAge, Function.identity()));
//        System.out.println(map);



    }
}
