package com.demo1;

import java.util.Random;
import java.util.Scanner;

public class erfen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Random r= new Random();
        int b = r.nextInt(100) + 1;
        int begin = 1;
        int end = 100;
        int count = 0;
        while(true){
            count++;
            if(b==a){
                System.out.println(b);
                System.out.println(count);
                break;
            }
            if (b>a){
                end = b-1;
                //范围更新为（begin，b-1）
                b = r.nextInt(end-begin+1) +begin;
            }
            if(b<a){
                begin = b+1;
                //范围更新为（b+1,end）
                b = r.nextInt(end-begin+1) +begin;
            }
        }

    }
}
