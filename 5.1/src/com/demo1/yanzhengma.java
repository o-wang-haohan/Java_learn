package com.demo1;

import java.util.Random;

public class yanzhengma {
    public static void main(String[] args) {
        String s = "";
        char [] a = new char[52];
        for (int i = 0; i<26; i++){
            a[i] = (char)((int)'a'+i);
        }
        for (int i = 0; i<26; i++){
            a[i+26] = (char)((int)'A'+i);
        }
        /*
        for(int i = 0; i<52; i++){
            System.out.print(a[i]);
        }
                */
        char [] chs = new char[5];
        for (int i = 0; i < 4; i++) {
            Random rand = new Random();
            int num = rand.nextInt(52);
            chs[i] = a[num];
        }
        Random rand = new Random();
        int number = rand.nextInt(10);
        chs[4] = (char) ((int)'0'+number);
        for (int i = 0; i<5; i++) {
            s+=chs[i];
            System.out.print(chs[i]);
        }
        System.out.println();
        System.out.print(s);
    }
}
