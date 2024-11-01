package com.demo1.LeedCode.DynamicProgramming;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/10/30 下午5:02
 */
public class leedcode123 {
    public int maxProfit(int[] prices) {
        //最多只能买卖两次，所以状态会增加

        int [][] dp = new int[prices.length][5];
        //dp1表示第一次持有，2表示第一次不持有，3表示第二次持有，4表示第二次不持有
        dp[0][1] = 0-prices[0];
        dp[0][2] = 0;
        dp[0][3] = 0-prices[0];
        dp[0][4] = 0;
        for(int i = 1;i<prices.length;i++){
            dp[i][1] = Math.max(dp[i-1][1], 0-prices[i]);
            dp[i][2] = Math.max(dp[i-1][2], dp[i-1][1]+prices[i]);
            dp[i][3] = Math.max(dp[i-1][3], dp[i-1][2]-prices[i]);
            dp[i][4] = Math.max(dp[i-1][4], dp[i-1][3]+prices[i]);
        }
        return Math.max(dp[prices.length-1][4],dp[prices.length-1][2]);
    }
}
