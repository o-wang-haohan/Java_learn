package com.demo1.implements_demo;

public class Test {
    public static void main(String[] args) {
        dog d = new dog("tt", 3);
        System.out.println(d.getName()+d.getAge());
        d.eat();
        d.swim();
    }
}
