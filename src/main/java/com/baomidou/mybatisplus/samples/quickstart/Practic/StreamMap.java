package com.baomidou.mybatisplus.samples.quickstart.Practic;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMap {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("hello", "baidu");
        stream.map(String::toUpperCase).collect(Collectors.toList()).forEach(s -> System.out.println(s));
    }
}
