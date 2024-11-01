package com.demo1.LeedCode.DynamicProgramming;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/11/1 下午4:44
 */
public class leedcode516 {
    public int longestPalindromeSubseq(String s) {
        //dp数组表示i-j区间的最长回文子序列长度
        int[][] dp = new int[s.length()][s.length()];

        //初始位置是单个字符串回文串长度
        for(int i = 0;i<s.length();i++){
            dp[i][i] = 1;
        }
        //遍历顺序看状态方程的推导方向；
        for(int i = s.length()-1;i>=0;i--){
            for(int j = i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    //当前相等，回文串长度加2
                    dp[i][j] = dp[i+1][j-1]+2;
                }else{
                    //若不相等，取只添加一个元素的回文串长度最大值
                    dp[i][j] = Math.max(dp[i+1][j],dp[i][j-1]);
                }
            }
        }
        return dp[0][s.length()-1];
    }
}
