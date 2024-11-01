package com.demo1.LeedCode.DynamicProgramming;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/10/29 下午3:54
 */
public class leedcode377 {
    public int combinationSum4(int[] nums, int target) {

        int[] dp = new int[target+1];
        dp[0] = 1;
        for(int j = 0;j<=target;j++){
            for(int i = 0;i<nums.length;i++){
                if(j>=nums[i]){
                    dp[j] += dp[j-nums[i]];
                }
            }
        }
        return dp[target];
    }
}
