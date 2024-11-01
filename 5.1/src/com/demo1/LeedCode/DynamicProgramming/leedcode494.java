package com.demo1.LeedCode.DynamicProgramming;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/10/29 上午10:11
 */
public class leedcode494 {
    public int findTargetSumWays(int[] nums, int target) {

        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            sum+=nums[i];
        }
        if (Math.abs(target) > sum) return 0; // 此时没有方案
        //找不到与之相等的数；
        if ((target + sum) % 2 == 1) return 0; // 此时没有方案
        //问题转换为凑满这个res容量的方法个数
        //dp数组表示结果等于res的方法个数
        //dp数组表示容量为j有dpj种方法
        int res = (sum+target)/2;

        int[] dp = new int[res+1];
        //dp0表示当前容量为0的方法为1,放0件物品；
        dp[0] = 1;
        for(int i = 0;i<nums.length;i++){
            for(int j = res;j>=nums[i];j--){
                //j-nums[i] 的含义就是除去已有的nums[i]后的dp的数量
                //去除掉当前的值之后还有的dp种方法，然后进行累加
                dp[j] += dp[j-nums[i]];
            }
        }
        return dp[res];
    }
}
