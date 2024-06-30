package com.demo1.Stream;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamDemo1 {
    public static void main(String[] args) {

        HashSet<Integer> hs = new HashSet<>();
        Collections.addAll(hs,1,2,3,4,5,6,7,8,9,10);
        Set<Integer> set = hs.stream().filter(s -> s%2==0).collect(Collectors.toSet());
        set.forEach(s-> System.out.print(s + " "));

    }
}
