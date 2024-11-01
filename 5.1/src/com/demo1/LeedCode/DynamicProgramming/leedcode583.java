package com.demo1.LeedCode.DynamicProgramming;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/11/1 下午1:55
 */
public class leedcode583 {
    public int minDistance(String word1, String word2) {
        //dp表示i-1和j-1结尾的最长公共子序列长度
        int [][] dp = new int[word1.length()+1][word2.length()+1];
        //初始化数组要根据dp数组含义或者递推公式进行推导；
        int res = 0;
        for(int i = 1;i<=word1.length();i++){
            for(int j = 1;j<=word2.length();j++){
                if(word1.charAt(i-1)==word2.charAt(j-1)){
                    //这里看dp数组表示的含义
                    dp[i][j] = dp[i-1][j-1] +1;
                }else{
                    //这里看两边是否都可以删除字母
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
                res = Math.max(res,dp[i][j]);
            }
        }
        return word1.length()+word2.length()-res*2;
    }
}
