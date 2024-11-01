package com.demo1.LeedCode.DynamicProgramming;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/10/31 下午4:39
 */
public class leedcode53_dp {
    public int maxSubArray(int[] nums) {
        //dp数组是nums[i]为结尾的最大连续子序列的和
        int [] dp = new int[nums.length];

        dp[0] = nums[0];
        int res = dp[0];
        for(int i = 1;i<nums.length;i++){
            //一共两种情况
            //由i-1的连续子序列和加上当前元素，前面的不要了从当前开始
            dp[i] = Math.max(nums[i],dp[i-1]+nums[i]);
            //最大连续子序列和不一定是最后元素结尾的
            res = Math.max(res,dp[i]);
        }
        return res;
    }
}
