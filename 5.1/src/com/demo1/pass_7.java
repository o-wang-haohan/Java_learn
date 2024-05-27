package com.demo1;

public class pass_7 {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            if(i%7==0){
                System.out.println(i);
                continue;
            }
            int c = i;
            while(c!=0){
                int b = c%10;
                if(b==7){
                    System.out.println(i);
                    break;
                }
                c = c/10;
            }
        }
    }
}
