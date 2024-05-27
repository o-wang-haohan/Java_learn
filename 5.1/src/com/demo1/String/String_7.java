package com.demo1.String;

import java.util.Scanner;

public class String_7 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        boolean flag = false;
        if(A.length()!=B.length()){
            System.out.println("false");
        }else if(A.equals(B)){
            flag = true;
            System.out.println(flag);
        }else{
            int num = A.length() -1;
            String temp = A;
            while(num>0){
                temp = convert(temp);
                if(temp.equals(B)){
                    flag = true;
                    break;
                }
                num--;
            }
            System.out.println(flag);
        }
    }

    public static String convert(String str){
        char one = str.charAt(0);
        String str_new = str.substring(1) + one;
        return str_new;
    }
}
