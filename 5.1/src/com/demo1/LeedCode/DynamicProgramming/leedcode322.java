package com.demo1.LeedCode.DynamicProgramming;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/10/29 下午4:45
 */
public class leedcode322 {
    public int coinChange(int[] coins, int amount) {

        int[] dp = new int[amount+1];
        dp[0] = 0;
        for(int i = 1;i<amount+1;i++){
            //为了不影响后续赋值，应该初始为int最大值
            dp[i] = Integer.MAX_VALUE;
        }
        //dp数组表示装满背包所需要的最少元素个数
        for(int i = 0;i<coins.length;i++){
            for(int j = coins[i];j<=amount;j++){
                //dpj表示不选当前元素的最少元素个数
                //dp[j-coins[i]]+1表示选当前元素，所以只需要dp[j-coins[i]]元素个数加上当前元素数量；

                //只有当dp[j-coins[i]]已经更新有值了，才能进行选择
                //只有dp[j-coins[i]]不是初始最大值时，该位才有选择的必要
                //dp[j-coins[i]]是初始最大值时，该位还没进行计算，值是错误的
                if(dp[j-coins[i]]!=Integer.MAX_VALUE){
                    dp[j] = Math.min(dp[j],dp[j-coins[i]]+1);
                }
            }
        }
        if(dp[amount]==Integer.MAX_VALUE){
            return -1;
        }else{
            return dp[amount];
        }

    }
}
