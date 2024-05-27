package com.demo1;

import java.util.Scanner;
//回文数的判断
public class number1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int num = a;
        int N = 10;
        int[] b = new int[N];
        int count = 0;
        while(a!=0){
            //回文数的正序和倒序一样，所以只需要将数字倒序然后判断即可
            //倒序
            b[count+1] = a%10;
            a = a/10;
            count ++;
        }
        boolean flag = true;
        int t= count;
        for(int i = 1; i<=count/2; i++){
            if(b[i] != b[t]) {
                flag = false;
                break;
            }
            t--;
        }
        if(flag){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
