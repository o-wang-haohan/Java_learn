package com.demo1.LeedCode.DynamicProgramming;


/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/10/29 下午3:31
 */
public class leedcode518 {
    public int change(int amount, int[] coins) {

        //dp数组表示当前能达到j的最大方式数量
        int[] dp = new int[amount+1];
        //对于数量问题dp0必须初始为1，否则后面全是0；
        dp[0] = 1;
        //组合问题
        for(int i = 0;i<coins.length;i++){
            //每个硬币能多次选，所以是正序遍历，完全背包问题
            for(int j = coins[i];j<=amount;j++){
                dp[j] += dp[j-coins[i]];
            }
        }
        return dp[amount];
    }
}
