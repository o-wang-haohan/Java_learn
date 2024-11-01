package com.demo1.LeedCode.DynamicProgramming;

import java.util.Scanner;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/10/29 下午4:20
 */
public class kama57 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int bagsize = sc.nextInt();
        int value = sc.nextInt();

        int[] dp = new int[bagsize+1];
        dp[0] = 1;
        for(int j = 1;j<=bagsize;j++){
            for(int i = 1;i<=value;i++){
                if(j>=i){
                    dp[j] += dp[j-i];
                }
            }
        }
        System.out.println(dp[bagsize]);
    }
}
