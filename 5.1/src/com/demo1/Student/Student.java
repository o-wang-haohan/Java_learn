package com.demo1.Student;

public class Student {
    private String id;
    private String name;
    private int age;
    private String address;

    public  Student(){

    }

    public Student(String id, String name, int age,String address){
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return this.id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return this.address;
    }

}
