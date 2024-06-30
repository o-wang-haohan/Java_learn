package com.demo1.Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo3 {
    public static void main(String[] args) {

        ArrayList<String> mans = new ArrayList<>();
        Collections.addAll(mans,"zz,23","tt,24","wzy,26","ahh,27","dhh,27","wty,26");
        ArrayList<String> womans = new ArrayList<>();
        Collections.addAll(womans,"yt,23","yyt,24","zy,26","ty,27","dfgf,27","dg,26");
        List<String> list1 = mans.stream().filter(s->s.split(",")[0].length()==3).limit(2).collect(Collectors.toList());
        List<String> list2 =womans.stream().filter(s->s.split(",")[0].startsWith("y")).skip(1).collect(Collectors.toList());
        System.out.print(list2);
        List<String> list3 = Stream.concat(list1.stream(),list2.stream()).collect(Collectors.toList());
        List<Actor> aclist = new ArrayList<>();
        for(String s :list3){
            Actor actor = new Actor(s.split(",")[0],Integer.parseInt(s.split(",")[1]));
            aclist.add(actor);
        }
        System.out.print(aclist);
    }
}
