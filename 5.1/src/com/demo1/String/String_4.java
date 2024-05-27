package com.demo1.String;

import java.util.Scanner;

public class String_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] chs = new char[s.length()];
        String s1 = s.replaceAll(" ","");
        while(s1.length()>1) {
            for (int i = 0; i < s1.length(); i++) {
                char c = s1.charAt(i);
                if (c == '*') {
                   s1 = s1.substring(0,i-1) + res('*',s1.substring(i-1,i+2)) + s1.substring(i+2);
                   break;
                }
                if (c == '/') {
                    s1 = s1.substring(0,i-1) + res('/',s1.substring(i-1,i+2)) + s1.substring(i+2);
                    break;
                }
                if (c == '+') {
                    s1 = s1.substring(0,i-1) + res('+',s1.substring(i-1,i+2)) + s1.substring(i+2);
                    break;
                }
                if (c == '-') {
                    s1 = s1.substring(0,i-1) + res('-',s1.substring(i-1,i+2)) + s1.substring(i+2);
                    break;
                }
            }
        }
        System.out.println(s1);
    }
    public static int res(char ch,String s_sub){
        int res  = 0;
        int a = s_sub.charAt(0)-'0';
        int b = s_sub.charAt(2)-'0';
        if(ch=='*'){
            return a*b;
        }else if(ch=='/'){
            return a/b;
        }else if(ch=='+'){
            return a+b;
        }else if(ch=='-'){
            return a-b;
        }
        return res;
    }

}
