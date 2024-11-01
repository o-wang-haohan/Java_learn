package com.demo1.LeedCode.DynamicProgramming;

import java.util.HashSet;
import java.util.List;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/10/30 上午10:43
 */
public class leedcode139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        //排列问题，超过长度就continue；多次使用，完全背包
        //dp数组要根据题目的含义来定
        //本题dp数组表示i之前的字符串可以有一个或多个字典中单词组成
        boolean[] dp = new boolean[s.length()+1];
        //其他状态需要由dp0进行推导
        dp[0] = true;
        //需要判断剩余字符串是否出现在字典集合中
        HashSet<String> hashSet = new HashSet<>(wordDict);

        //单词就是物品，字符串s就是背包，单词能否组成字符串s，就是问物品能不能把背包装满。
        for(int j = 0;j<=s.length();j++){//背包
            for(int i = 0;i<=j;i++){//物品
                //递推公式是j之前的字符串可以有一个或多个字典中单词组成，并且剩余的字符串也在字典中
                if(dp[i]==true && hashSet.contains(s.substring(i,j))==true){
                    dp[j] = true;
                }
            }
        }
        return dp[s.length()];
    }
}
