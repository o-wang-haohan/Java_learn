package com.demo1.MapDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo1 {
    public static void main(String[] args) {

        Map<String, String> m = new HashMap<>();
        m.put("11","22");
        m.put("33", "44");

        Set<String> keys =  m.keySet();
        for(String k : keys){
            System.out.println(m.get(k));
        }

        Iterator<String> it = keys.iterator();
        while(it.hasNext()){
            System.out.println(m.get(it.next()));
        }

        keys.forEach(s -> System.out.println(m.get(s)));

        System.out.println(m);
    }
}
