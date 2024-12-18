package com.demo1.LeedCode.DynamicProgramming;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/11/1 上午11:16
 */
public class leedcode115 {
    public int numDistinct(String s, String t) {

        //dp表示以i-1和j-1结尾的s出现t的个数
        int[][] dp = new int[s.length() + 1][t.length() + 1];

        for(int i = 1;i<=s.length();i++){
            dp[i][0] = 1;
        }
        dp[0][0] = 1;

        for(int i = 1;i<=s.length();i++){
            for(int j = 1;j<=t.length();j++){
                if(s.charAt(i-1)==t.charAt(j-1)){

                    dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[s.length()][t.length()];
    }
}
