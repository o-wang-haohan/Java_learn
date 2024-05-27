package com.demo1;

import java.util.Scanner;

public class number2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int s = 0;
        int y = 0;
        while(a-b>=0){
            a = a-b;
            s++;
            y = a;
        }
         System.out.println(s);
        System.out.println(y);
    }
}
