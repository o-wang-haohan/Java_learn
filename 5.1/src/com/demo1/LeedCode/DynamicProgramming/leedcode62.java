package com.demo1.LeedCode.DynamicProgramming;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/10/27 上午10:28
 */
public class leedcode62 {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        dp[0][0] = 1;
        for(int k = 1;k<n;k++){
            dp[0][k] = 1;
        }
        for(int k = 1;k<m;k++){
            dp[k][0] = 1;
        }
        //由于最左边和最上边已经初始化了
        //所以必须从左向右 和从上向下遍历
        for(int i = 1;i<m;i++){
            for(int j = 1;j<n;j++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
}
