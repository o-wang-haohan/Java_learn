package com.demo1.LeedCode.DynamicProgramming;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/10/27 下午2:16
 */
public class leedcode343 {
    public int integerBreak(int n) {
        //dp数组表示获得的最大乘积
        int[] dp = new int[n+1];

        dp[0] = 0;
        dp[1] = 0;
        dp[2] = 1;
        //i对应的最大乘积，j表示对i进行分割
        for(int i = 3;i<=n;i++){
            for(int j = 1;j<i;j++){
                //j*(i-j)表示两个数相乘，j*dp[i-j]表示三个及三个以上数相乘
                //dp[i]以及和当前计算所有的dp[i]进行比较去最大值；
                dp[i] = Math.max(Math.max(j*(i-j),j*dp[i-j]),dp[i]);
            }
        }
        return dp[n];
    }
}
