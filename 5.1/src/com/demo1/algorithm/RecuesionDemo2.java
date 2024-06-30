package com.demo1.algorithm;

public class RecuesionDemo2 {
    public static void main(String[] args) {
        System.out.println(sum(20));
    }
    //表示number台阶一共有多少种爬法
    public static int sum(int number){
        if(number==1){
            return 1;
        }
        if(number == 2){
            return 2;
        }
        return sum(number -1)+sum(number - 2);
    }
}
