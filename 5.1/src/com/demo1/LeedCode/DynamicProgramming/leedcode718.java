package com.demo1.LeedCode.DynamicProgramming;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/10/31 下午2:01
 */
public class leedcode718 {
    public int findLength(int[] nums1, int[] nums2) {

        //dp数组表示以i-1和j-1为结尾的最长长度
        int[][] dp = new int[nums1.length+1][nums2.length+1];
        int res = 0;
        for(int i = 1;i<=nums1.length;i++){
            for(int j = 1;j<=nums2.length;j++){
                if(nums1[i-1]==nums2[j-1]){
                    dp[i][j] = dp[i-1][j-1]+1;
                }
                //最长的公共子序列并不一定是最后一个元素结尾
                //所以需要遍历所有元素
                res = Math.max(dp[i][j],res);
            }
        }
        return res;
    }
}
