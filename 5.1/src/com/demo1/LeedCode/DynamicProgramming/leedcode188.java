package com.demo1.LeedCode.DynamicProgramming;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/10/30 下午5:23
 */
public class leedcode188 {
    public int maxProfit(int k, int[] prices) {

        //dp数组单数第k次持有，双数表示第k次不持有
        int[][] dp = new int[prices.length][2*k+1];
        for(int i = 1;i<=2*k;i+=2){
            dp[0][i] = 0-prices[0];
        }
        for(int i = 1;i<prices.length;i++){
            for(int j = 1;j<=2*k;j++){
                if(j%2==1){
                    dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j-1]-prices[i]);
                }else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j-1]+prices[i]);
                }
            }
        }
        return dp[prices.length-1][2*k];
    }
}
