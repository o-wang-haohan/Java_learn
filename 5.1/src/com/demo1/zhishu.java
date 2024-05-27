package com.demo1;

import java.util.Scanner;
//可以从平方根的角度考虑问题
//循环只需要从2-平方根即可
//a*b= x；那么一个数一定大于根号x，一个数一定小于根号x
public class zhishu {
    public static void main(String[] args) {
        //判断质数
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        boolean flag = true;
        if(x == 1 || x==2){
            flag = true;
        } else if(x>2) {
            for (int i = 2; i <= x / 2 + 1; i++) {
                if (x % i == 0) {
                    flag = false;
                    break;
                }
            }
        }
        if(flag){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
