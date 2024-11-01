package com.demo1.LeedCode.DynamicProgramming;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/10/30 下午7:34
 */
public class leedcode309 {
    public int maxProfit(int[] prices) {

        //dp0表示持有股票的最大值，dp1表示保持冷冻期后的未持有状态
        //dp2表示今天卖出，dp3表示今天是冷冻期
        //未持有状态包括冷冻期后卖出和今天卖出
        int[][] dp = new int[prices.length][4];
        dp[0][0] = 0-prices[0];
        dp[0][1] = 0;

        for(int i = 1;i<prices.length;i++){
            //当前持有股票的最大值，由前一天持有值，今天买入
            //今天买入有两种情况，前一天是冷冻期后的未持有状态和前一天是冷冻期，后面都可以买入股票
            //i-1表示昨天的状态；
            dp[i][0] = Math.max(Math.max(dp[i-1][0],dp[i-1][1]-prices[i]),dp[i-1][3]-prices[i]);
            dp[i][1] = Math.max(dp[i-1][1],dp[i-1][3]);
            dp[i][2] = dp[i-1][0] + prices[i];
            dp[i][3] = dp[i-1][2];
        }
        return Math.max(Math.max(dp[prices.length-1][1],dp[prices.length-1][2]),dp[prices.length-1][3]);
    }
}
