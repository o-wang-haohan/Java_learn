package com.demo1.LeedCode.DynamicProgramming;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/11/1 上午10:43
 */
public class leedcode391 {
    public boolean isSubsequence(String s, String t) {

        //dp数组含义以i-1和j-1结尾的最长匹配子串
        int[][] dp = new int[t.length()+1][s.length()+1];

        int res = 0;
        for(int i = 1;i<=t.length();i++){
            for(int j = 1;j<=s.length();j++){
                if(t.charAt(i-1)==s.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                }else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
                res = Math.max(res,dp[i][j]);
            }
        }
        if(res == s.length()){
            return true;
        }else{
            return false;
        }
    }
}
