package com.demo1.LeedCode.DynamicProgramming;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/10/31 上午10:25
 */
public class leedcode714 {
    public int maxProfit(int[] prices, int fee) {
        //卖出时付手续费

        int[][] dp = new int[prices.length][2];

        dp[0][0] = 0-prices[0];
        dp[0][1] = 0;

        for(int i = 1;i<prices.length;i++){
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1]-prices[i]);
            dp[i][1] = Math.max(dp[i-1][1],dp[i-1][0]+prices[i]-fee);
        }
        return Math.max(dp[prices.length-1][0],dp[prices.length-1][1]);
    }
}
