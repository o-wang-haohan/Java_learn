package com.demo1;

import java.util.Scanner;

public class number {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            while (a != 0) {
                int b = a % 10;
                System.out.println(b);
                a = a / 10;
            }
        }
    }
}
