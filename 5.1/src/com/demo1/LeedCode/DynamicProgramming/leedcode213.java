package com.demo1.LeedCode.DynamicProgramming;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/10/28 下午7:01
 */
public class leedcode213 {
    public int rob(int[] nums){
        if(nums.length==1){
            return nums[0];
        }
        //形成环后，多了个限制条件，首尾元素不能同时选
        //那么剩下三种情况，首元素选尾不选，尾选首不选，首尾都不选
        // 首选尾不选包括首位都不选
        int[] nums_new = new int[nums.length-1];
        for(int i = 0;i<nums_new.length;i++){
            nums_new[i] = nums[i];
        }
        int res_first = rob_0(nums_new);
        for(int i = 1;i<nums.length;i++){
            nums_new[i-1] = nums[i];
        }
        int res_end = rob_0(nums_new);
        return Math.max(res_first,res_end);
    }
    public int rob_0(int[] nums) {
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