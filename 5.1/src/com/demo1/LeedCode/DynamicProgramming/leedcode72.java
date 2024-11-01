package com.demo1.LeedCode.DynamicProgramming;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/11/1 下午2:27
 */
public class leedcode72 {
    public int minDistance(String word1, String word2) {

        //dp数组的含义是i-1和j-1为结尾的最少操作次数
        int[][] dp = new int[word1.length()+1][word2.length()+1];

        for(int i = 0;i<=word1.length();i++){
            dp[i][0] = i;
        }
        for(int j = 0;j<=word2.length();j++){
            dp[0][j] = j;
        }

        for(int i = 1;i<=word1.length();i++){
            for(int j = 1;j<=word2.length();j++){
                if(word1.charAt(i-1)==word2.charAt(j-1)){
                    //当相等时，不用操作，直接继承i-2和j-2为结尾的操作次数
                    dp[i][j] = dp[i-1][j-1];
                }else{
                    //不相等时，由三种操作策略
                    //1删除一个元素，相当于不选当前元素
                    //2增加一个元素，相当于第二个字符串删除一个元素
                    //3替换，相当于两者都前移一个元素的值加1；
                    dp[i][j] = Math.min(Math.min(dp[i-1][j]+1,dp[i][j-1]+1),dp[i-1][j-1]+1);
                }
            }
        }
        return dp[word1.length()][word2.length()];
    }
}
