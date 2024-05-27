package com.demo1.String;

public class String_8 {
    public static void main(String[] args) {
        String str = "123456";
        int length  = str.length();
        int number = 0;
        for(int i = 0; i<str.length(); i++){
            int num = str.charAt(i) - '0';
            number = number*10 + num;
        }
        System.out.println(number);
    }


}
