package com.demo1.LeedCode.DynamicProgramming;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/10/29 下午10:32
 */
public class leedcode279 {
    public int numSquares(int n) {

        int max = Integer.MAX_VALUE;

        int[] dp = new int[n+1];
        //dp数组的含义填满n背包所需要的最少数量
        dp[0] = 0;
        for(int i = 1;i<n+1;i++){
            dp[i] = max;
        }

        for(int i = 1;i<=n;i++){
            for(int j = i*i;j<=n;j++){
                if(dp[j-i*i]!=max){
                    dp[j] = Math.min(dp[j],dp[j-i*i]+1);
                }
            }
        }
        return dp[n];
    }
}
