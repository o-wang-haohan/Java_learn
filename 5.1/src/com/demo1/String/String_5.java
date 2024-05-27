package com.demo1.String;

import java.util.Scanner;

public class String_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        StringBuilder sb1 = new StringBuilder(s);
        sb1.reverse();
        if(sb.toString().equals(sb1.toString())){
            System.out.println(true);
        }else System.out.println(false);
    }
}
