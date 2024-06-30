package com.demo1.algorithm;

public class RecuesionDemo1 {
    public static void main(String[] args) {
        System.out.println(sum(1));

    }
    //第几天还没吃的桃子的数量
    public static int sum(int day){
        if(day==10){
            return 1;
        }
        //第1天的数量等于（第二天的数量+1）*2
        return (sum(day+1)+1)*2 ;
    }
}
