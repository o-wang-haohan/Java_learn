package com.demo1.learn_static1;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student st1 = new Student("tt0",23,"nan");
        Student st2 = new Student("tt1",26,"nan");
        Student st3 = new Student("tt2",13,"nan");
        list.add(st1);
        list.add(st2);
        list.add(st3);

        int maxAge = StudentUtil.getMaxAge(list);
        System.out.println(maxAge);
    }
}
