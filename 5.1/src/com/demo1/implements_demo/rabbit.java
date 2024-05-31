package com.demo1.implements_demo;

public class rabbit extends Animal{
    public rabbit(){}

    public rabbit(String name, int age){
        super(name, age);
    }

    public void eat(){
        System.out.println("吃胡萝卜");
    }
}
