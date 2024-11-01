package com.demo1.LeedCode.DynamicProgramming;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/10/28 下午8:39
 */
public class leedcode416 {
    public boolean canPartition(int[] nums) {
        //01背包问题的应用，本题重量和价值相同
        //求sum/2容量的背包的最大价值
        //判断当前价值是否等于sum/2
        //问题抽象为这么多的物品，容量为sum/2的背包能不能装满
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            sum+=nums[i];
        }
        if(sum%2==1){
            return false;
        }
        int target = sum/2;

        //dp数组表示当前容量背包的最大价值
        int[] dp = new int[target+1];
        dp[0] = 0;
        for(int i = 0;i<nums.length;i++){
            for(int j = target;j>=nums[i];j--){
                //当前元素选与不选的最大值
                dp[j] = Math.max(dp[j],dp[j-nums[i]]+nums[i]);
            }
        }
        //恰好装满了这个背包，并且最大价值恰好等于sum/2
        //由于重量就是价值，装满背包的最大价值等于重量，可能出现无法装满的情况，这时最大价值不等于重量；
        if(dp[target]==target){
            return true;
        }else{
            return false;
        }
    }
}
