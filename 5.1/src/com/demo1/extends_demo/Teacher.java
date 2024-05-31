package com.demo1.extends_demo;

public class Teacher extends Employee{
    public Teacher(){

    }

    public Teacher(String id, String name){
        super(id,name);
    }

    @Override
    public void work(){
        System.out.println("老师工作");
    }
}
