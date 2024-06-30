package com.demo1.Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class StreamDemo2 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "zz,23","ls,24","ww,25");
        Map<String, Integer> hm = list.stream().filter(s -> Integer.parseInt(s.split(",")[1])>=24)
                .collect(Collectors.toMap(s->s.split(",")[0], s -> Integer.parseInt(s.split(",")[1])));
        hm.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String s, Integer integer) {
                System.out.print(s+":"+integer);
            }
        });
    }
}
