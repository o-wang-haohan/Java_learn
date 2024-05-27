package com.demo1.String;

import java.util.Scanner;

public class String_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char [] chars = new char[s.length()];
        String s_new = "";
        for (int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);

        }
        for (int i = chars.length-1; i>=0; i--) {
            s_new = s_new + chars[i];
        }
        System.out.println(s_new);
    }
}
