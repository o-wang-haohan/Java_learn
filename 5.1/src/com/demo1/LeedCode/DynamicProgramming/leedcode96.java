package com.demo1.LeedCode.DynamicProgramming;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/10/27 下午2:58
 */
public class leedcode96 {
    public int numTrees(int n) {
        //dp问题一定要去分解为子问题，看子问题与原问题的对应关系
        //dp数组表示当前整数能够满足二叉搜索数的数量
        int[] dp = new int[n+1];
        //0个节点也满足题意
        dp[0] = 1;
        dp[1] = 1;
        //i表示节点的数量
        for(int i = 2;i<=n;i++){
            //分别对应每个以1到i为根节点的情况
            for(int j = 1;j<=i;j++){
                //左右孩子的节点数量，
                //二叉搜索树左子树肯定是j-1个节点，一共i个节点
                dp[i] += dp[j-1]*dp[i-(j-1) -1];
            }
        }
        return dp[n];
    }
}
