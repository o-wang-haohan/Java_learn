package com.demo1.extends_demo2;

public class Test {
    public static void main(String[] args) {
        Person pe = new Person("老王", 30);
        Animal am = new Dog(2, "黑色");
        pe.keepPet(am, "骨头");
    }

}
