package com.demo1;

import java.util.Scanner;

public class pingfanggen {
    public static void main(String[] args) {
        //根号x取值在(1,x/2)之间
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        //求根号x的整数部分
        for (int i = 1; i <= x/2+1; i++) {
            if(i*i>x){
                System.out.println(i-1);
                break;
            }
        }
    }
}
