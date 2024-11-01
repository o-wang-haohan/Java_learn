package com.demo1.LeedCode.DynamicProgramming;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/10/30 下午3:31
 */
public class leedcode122 {
    public int maxProfit(int[] prices) {
        //动态规划做法

        //dp数组表示0持有这只股票的最大现金，1表示不持有这只股票的最大现金
        int[][] dp = new int[prices.length][2];
        dp[0][0] = prices[0]*(-1);
        dp[0][1] = 0;

        for(int i = 1;i<prices.length;i++){
            //第i天持有股票：i-1天已经持有，i天买入（所以i-1天一定不持有）
            dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1]-prices[i]);
            //第i天不持有股票：i-1天已经不持有，i天卖出（所以i-1天一定持有）
            dp[i][1] = Math.max(dp[i-1][1], dp[i-1][0]+prices[i]);
        }
        return dp[prices.length-1][1];
    }
}
