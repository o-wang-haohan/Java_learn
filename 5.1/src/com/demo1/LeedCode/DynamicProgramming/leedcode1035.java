package com.demo1.LeedCode.DynamicProgramming;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/10/31 下午3:44
 */
public class leedcode1035 {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        //dp数组表示i-1为结尾，j-1为结尾的最大子序列长度
        //一共是三个方向
        //最长公共子序列的题目
        int[][] dp = new int[nums1.length+1][nums2.length+1];
        int res = 0;
        for(int i = 1;i<=nums1.length;i++){
            for(int j = 1;j<=nums2.length;j++){
                if(nums1[i-1]==nums2[j-1]){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
                res = Math.max(res,dp[i][j]);
        }
        }
        return res;
    }
}
