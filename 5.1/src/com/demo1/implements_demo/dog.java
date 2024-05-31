package com.demo1.implements_demo;

public class dog extends Animal implements Swim{
    public dog(){}

    public dog(String name, int age ){
        super(name, age);
    }

    public void eat (){
        System.out.println("吃骨头");
    }

    public void swim(){
        System.out.println("狗刨");
    }
}
