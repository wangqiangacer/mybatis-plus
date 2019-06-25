package com.baomidou.mybatisplus.samples.quickstart.Practic;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        List<Object> subList = list.subList(1, 3);
        //集合的截取
        for (Object o : subList) {
            System.out.println(o);
        }
    }
}
