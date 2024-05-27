package com.demo1;

import java.util.Scanner;

public class number1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = a;
        int c = 0;
        int d = 0;
        while(a!=0){
            //个位
            c = a%10;
            //更新a
            a = a/10;
            //逆序数字时，上次数*10+这次的个位
            d = d*10 + c;
        }
        if(d==b){
            System.out.println(true);
        } else{
            System.out.println(false);
        }
    }
}
