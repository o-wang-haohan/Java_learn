package com.demo1.LeedCode.DynamicProgramming;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/10/27 上午11:16
 */
public class leedcode63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        int[][] dp = new int[m+1][n+1];
        //首先需要对00位置进行判断，如果00是0，那么全部都是0；
        if(obstacleGrid[0][0]==0){
            dp[0][0] = 1;
            //初始化时也要判断当前是否遇到障碍物
            //障碍物后面的全部初始化为0；
            for(int k = 1;k<m;k++){
                if(obstacleGrid[k][0]==0){
                    dp[k][0] = 1;
                }else{
                    break;
                }
            }
            for(int k = 1;k<n;k++){
                if(obstacleGrid[0][k]==0){
                    dp[0][k] = 1;
                }else{
                    break;
                }
            }
        }

        for(int i = 1;i<m;i++){
            for(int j = 1;j<n;j++){
                if(obstacleGrid[i][j]==0){
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
            }
        }
        return dp[m-1][n-1];
    }
}
