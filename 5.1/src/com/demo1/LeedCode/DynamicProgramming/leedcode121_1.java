package com.demo1.LeedCode.DynamicProgramming;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/10/30 下午2:59
 */
public class leedcode121_1 {
    public int maxProfit(int[] prices) {
        //动态规划做法

        //dp数组表示0持有这只股票的最大现金，1表示不持有这只股票的最大现金
        int[][] dp = new int[prices.length][2];
        dp[0][0] = prices[0]*(-1);
        dp[0][1] = 0;

        for(int i = 1;i<prices.length;i++){
            dp[i][0] = Math.max(dp[i-1][0], prices[i]*(-1));
            dp[i][1] = Math.max(dp[i-1][1], dp[i-1][0]+prices[i]);
        }
        return dp[prices.length-1][1];
    }
}
