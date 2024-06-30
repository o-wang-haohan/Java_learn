package com.demo1.LeedCode.Hash;

import java.util.HashSet;

public class leedcode202 {
    public static void main(String[] args) {

    }
    public static boolean isHappy(int n){
        HashSet<Integer> set = new HashSet<>();
        set.add(n);
        int sum = 0;
        while(true){
            while(n!=0) {
                sum += (n % 10) * (n % 10);
                n = n/10;
            }
            if(sum==1){
                return true;
            }

            if(set.contains(sum)){
                return false;
            }
            set.add(sum);
            n = sum;
            sum = 0;
        }
    }
}
