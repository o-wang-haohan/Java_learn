package com.demo1.extends_demo2;

public class Person {
    private String name;
    private int age;


    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public void keepPet(Animal am, String some){
        if(am instanceof Dog d){
            System.out.print(am.getAge()+am.getColor());
            d.eat(some);
        }else if (am instanceof Cat c) {
            System.out.print(am.getAge()+am.getColor());
            c.eat(some);
        }

    }
}
