package com.demo1.LeedCode.DynamicProgramming;

import java.util.Scanner;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/10/27 下午4:53
 */
public class leedcode46_i {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int bagweight = sc.nextInt();
        int[] weight = new int[n];
        int[] value = new int[n];

        for(int i = 0;i<n;i++){
            weight[i] = sc.nextInt();
        }
        for(int i = 0; i<n;i++){
            value[i] = sc.nextInt();
        }
        //dp数组的含义 i表示物品 j表示背包容量
        //dp数组的含义 0-i的物品里面任选 并且背包容量为j的最大价值
        //一共两种情况，当前i物品选与不选两种情况
        int[][] dp = new int[n][bagweight+1];
        dp[0][0] = 0;
        for(int k = 1;k<bagweight+1;k++){
            //物品0要小于当前背包重量，才能放进去
            if(weight[0]<k){
                dp[0][k] = value[0];
            }
        }
        for(int i = 1;i<n;i++){
            for(int j = 1;j<bagweight+1;j++){
                //当前物品重量超过背包重量
                if(weight[i]>j){
                    dp[i][j] = dp[i-1][j];
                }else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j-weight[i]]+value[i]);
                }
            }
        }
    }
}
