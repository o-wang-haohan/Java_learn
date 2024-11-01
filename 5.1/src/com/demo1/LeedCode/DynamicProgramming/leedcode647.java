package com.demo1.LeedCode.DynamicProgramming;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/11/1 下午3:58
 */
public class leedcode647 {
    public int countSubstrings(String s) {
        //dp数组表示从i到j的区间是否是回文子串
        boolean[][] dp = new boolean[s.length()][s.length()];
        //初始化数组时，刚开始都是false，通过状态转移数组进行判断
        int res = 0;
        //遍历顺序要看当前状态是如何由其他状态的方向推出来的
        for(int i = s.length()-1;i>=0;i--){
            for(int j = i;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    //如果当前只有一位或者两位直接是回文
                    if(j-i<=1){
                        dp[i][j] = true;
                        res++;
                    }else if(dp[i+1][j-1]){
                        //如果当前多于两位，两端往前走一位后该区间仍然是回文；
                        dp[i][j] = true;
                        res++;
                    }
                }
            }
        }
        return res;
    }
}
