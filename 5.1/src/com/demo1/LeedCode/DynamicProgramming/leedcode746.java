package com.demo1.LeedCode.DynamicProgramming;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/10/27 上午10:13
 */
public class leedcode746 {
    public int minCostClimbingStairs(int[] cost) {
        //dp数组表示爬到当前位置所需要的最少费用
        int[] dp = new int[cost.length+1];
        dp[1] = 0;
        dp[2] = Math.min(cost[0],dp[1]+cost[1]);
        for(int i = 3;i<=cost.length;i++){
            dp[i] = Math.min(dp[i-1]+cost[i-1],dp[i-2] + cost[i-2]);
        }
        return dp[cost.length];
    }
}
