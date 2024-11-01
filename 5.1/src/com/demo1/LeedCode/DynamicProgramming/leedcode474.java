package com.demo1.LeedCode.DynamicProgramming;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/10/29 下午2:11
 */
public class leedcode474 {
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] nums = new int[strs.length][2];
        for(int i = 0;i<strs.length;i++){
            String s = strs[i];
            int len = s.length();
            for(int j = 0;j<len;j++){
                if(s.charAt(j)=='0'){
                    nums[i][0]++;
                }else{
                    nums[i][1]++;
                }
            }
        }
        //dp数组表示当前子集的最大个数
        int[][] dp = new int[m+1][n+1];
        dp[0][0] = 0;
        //物品
        for(int i = 0;i<strs.length;i++){
            //容器的容量（最多全部物品放入）
            //两个维度分别进行遍历
            //与一个维度的差不多，类推即可
            for(int j = m;j>=nums[i][0];j--){
                for(int k = n;k>=nums[i][1];k--){
                    dp[j][k] = Math.max(dp[j][k],dp[j-nums[i][0]][k-nums[i][1]]+1);
                }
            }
        }
        return dp[m][n];
    }
}
