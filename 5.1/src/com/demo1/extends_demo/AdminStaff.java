package com.demo1.extends_demo;

public class AdminStaff extends Employee{
    public AdminStaff(){

    }
    public AdminStaff(String id, String name){
        super(id,name);
    }
    @Override
    public void work(){
        System.out.println("行政工作");
    }
}
