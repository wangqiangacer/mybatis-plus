package com.baomidou.mybatisplus.samples.quickstart.practic;

public class ClassLoaderDemo {
    private  static  int count=1;
    static {
        count=1;
    }
    public static void main(String[] args) {
        count=2;
        System.out.println("count:"+count);
        System.out.println(ClassLoaderDemo.class.getClassLoader());
        System.out.println(ClassLoaderDemo.class.getClassLoader().getParent());
        System.out.println(ClassLoaderDemo.class.getClassLoader().getParent().getParent());
    }
}
