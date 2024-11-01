package com.demo1.LeedCode.DynamicProgramming;

import java.util.Scanner;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/10/27 下午7:31
 */
public class kama46 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int bagweight = sc.nextInt();

        int[] weight = new int[m];
        int[] value = new int[m];

        for(int i = 0;i<m;i++){
            weight[i] = sc.nextInt();
        }
        for(int j = 0;j<m;j++){
            value[j] = sc.nextInt();
        }

        int[] dp = new int[bagweight+1];
        dp[0] = 0;
        //一维数组j背包重量进行遍历的情况下需要倒叙遍历
        //只有倒叙遍历才能利用前面以及计算过的值

        for(int i = 0;i<m;i++){
            for(int j = bagweight;j>=0;j--){
                if(weight[i]<=j){
                    dp[j] = Math.max(dp[j],dp[j-weight[i]]+value[i]);
                }
            }
        }
        System.out.println(dp[bagweight]);
    }
}
