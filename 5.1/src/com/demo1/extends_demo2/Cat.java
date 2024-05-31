package com.demo1.extends_demo2;

public class Cat extends Animal{
    public Cat(){}
    public Cat(int age, String color){
        super(age, color);
    }

    public void catchMouse(){
        System.out.println("逮老鼠");
    }
}
