package com.demo1.LeedCode.DynamicProgramming;

/**
 * @Author: whh
 * @Description:
 * 本题要选出石头重量接近总和一半的石头，与分割问题一致
 * 这类问题是装满容量为定值的最大价值是多少，每个元素都是可选可不选；
 * @Date: 2024/10/28 下午10:16
 */
public class leedcode1049 {
    public int lastStoneWeightII(int[] stones) {
        //01背包问题的应用，本题重量和价值相同
        //求sum/2容量的背包的最大价值
        //判断当前价值是否等于sum/2
        //问题抽象为这么多的物品，容量为sum/2的背包能不能装满
        int sum = 0;
        for(int i = 0;i<stones.length;i++){
            sum+=stones[i];
        }
        int target = sum/2;

        //dp数组表示当前容量背包的最大价值
        int[] dp = new int[target+1];
        dp[0] = 0;
        for(int i = 0;i<stones.length;i++){
            for(int j = target;j>=stones[i];j--){
                //当前元素选与不选的最大值
                dp[j] = Math.max(dp[j],dp[j-stones[i]]+stones[i]);
            }
        }
        //dp[target]表示一堆的重量， sum-dp[target]另外一堆的重量
        return sum-dp[target]-dp[target];
        //恰好装满了这个背包，并且最大价值恰好等于sum/2
        //由于重量就是价值，装满背包的最大价值等于重量，可能出现无法装满的情况，这时最大价值不等于重量；
    }
}
