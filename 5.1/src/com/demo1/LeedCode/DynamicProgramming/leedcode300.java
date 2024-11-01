package com.demo1.LeedCode.DynamicProgramming;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/10/31 上午10:48
 */
public class leedcode300 {
    public int lengthOfLIS(int[] nums) {
        //dpi数组定义为以nums[i]为结尾的最长连续递增子序列的长度
        int[] dp = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            //长度最少为1；
            dp[i] = 1;
        }
        int res = 1;
        for(int i = 1;i<nums.length;i++){
            for(int j = 0;j<i;j++){
                if(nums[i]>nums[j]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
            //由于dp定义为以nums[i]为结尾，所以不一定是最后一个元素才是结尾元素
            //需要遍历整个数组
            res = Math.max(dp[i],res);
        }
        return res;
    }
}
