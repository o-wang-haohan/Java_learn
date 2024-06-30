package com.demo1.algorithm;

public class RecuesionDemo {
    public static void main(String[] args) {
        int result = sum(4);
        System.out.println(result);
    }
    public static int sum(int month){
        if(month == 1||month == 2){
            return 1;
        }

        return sum(month-1) + sum(month - 2);
    }
}
