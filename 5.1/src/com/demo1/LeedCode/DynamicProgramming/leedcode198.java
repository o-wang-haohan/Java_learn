package com.demo1.LeedCode.DynamicProgramming;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/10/28 下午6:44
 */
public class leedcode198 {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        if(nums.length==1){
            return nums[0];
        }
        if(nums.length==2){
            return Math.max(nums[0],nums[1]);
        }
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        for(int i = 2;i<nums.length;i++){
            //dp数组表示第i天能够得到的最大价值（考虑第i天，能够偷盗的最大价值，第i天不一定要偷）
            //由两部分组成，今天偷和今天不偷
            dp[i] = Math.max(dp[i-1],nums[i]+dp[i-2]);
        }
        return dp[nums.length-1];
    }
}
