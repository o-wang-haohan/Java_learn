package com.demo1.learn_static;

import java.util.Scanner;

public class TestDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        double [] p = new double[number];

        for(int i = 0; i<p.length; i++){
            p[i] = (double)(sc.nextDouble());
        }
        double db = ArrayUtil.getAverage(p);
        System.out.println(db);

    }
}
