package com.demo1.LeedCode.DynamicProgramming;

import java.util.Arrays;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/10/31 上午11:24
 */
public class leedcode674 {
    public int findLengthOfLCIS(int[] nums) {
        //dp数组表示以nums[i]结尾的连续递增子序列长度
        int[] dp = new int[nums.length];
        Arrays.fill(dp,1);
        int res = 1;
        for(int i = 1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                dp[i] = dp[i-1]+1;
            }
            res = Math.max(res, dp[i]);
        }
        return res;
    }
}
