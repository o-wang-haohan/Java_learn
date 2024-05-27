package com.demo1;

import java.util.Scanner;

public class number1_2 {
    public static void main(String[] args) {
       int b =  extracted();
       int res = reversal(b);
        System.out.println(res);
    }
    public static int reversal(int b){
        int res = 0;
        while(b!=0){
            int temp = b%10;
            temp = ((temp+10)-5)%10;
            res = res * 10 + temp;
            b = b/10;
        }
        return res;
    }
    public static int extracted() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int b = 0;
        while(num!=0){
            int a = num%10;
            a = (a+5)%10;
            b = b*10+a;
            num = num/10;
        }
        System.out.println(b);
        return b;
    }
}
