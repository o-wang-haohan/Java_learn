package com.demo1.String;

import java.util.Scanner;

public class String_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String [] convert = {"","a","s","d","f","g","h","j","k","l"};
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<s.length();i++){
            int num = s.charAt(i)-'0';
            sb.append(convert[num]);
        }
        String res = sb.toString();
        System.out.println(res);
    }
}
