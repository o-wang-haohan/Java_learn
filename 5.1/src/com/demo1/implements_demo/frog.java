package com.demo1.implements_demo;

public class frog extends Animal implements Swim{

    public frog(){}

    public frog(String name, int age){
        super(name, age);
    }

    public void eat(){
        System.out.println("吃虫子");
    }

    public void swim(){
        System.out.println("蛙泳");
    }
}
