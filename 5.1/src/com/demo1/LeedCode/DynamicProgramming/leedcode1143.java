package com.demo1.LeedCode.DynamicProgramming;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/10/31 下午2:35
 */
public class leedcode1143 {
    public int longestCommonSubsequence(String text1, String text2) {
        //dp数组表示i-1为结尾，j-1为结尾的最大子序列长度
        //一共是三个方向
        int[][] dp = new int[text1.length()+1][text2.length()+1];
        int res = 0;
        for(int i = 1;i<=text1.length();i++){
            for(int j = 1;j<=text2.length();j++){
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                }else{
                    //当前只关注当前的元素值；
                    //不相等时，当前元素就取左边和上面的最大值即可；
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
                res = Math.max(res,dp[i][j]);
            }
        }
        return res;
    }
}
