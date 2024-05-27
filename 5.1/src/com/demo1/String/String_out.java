package com.demo1.String;

import java.util.Scanner;

public class String_out {
    public static void main(String[] args) {
        int [] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        String str = "[";
        for (int i = 0; i < arr.length; i++) {
            int a = sc.nextInt();
            arr[i] = a;
            if(i!=arr.length-1){
                str = str + a + ",";
            }else {
                str = str + a + "]";
            }
        }
        System.out.println(str);

    }
}
