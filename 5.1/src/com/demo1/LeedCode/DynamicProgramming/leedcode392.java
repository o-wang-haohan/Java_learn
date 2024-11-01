package com.demo1.LeedCode.DynamicProgramming;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/10/31 下午5:15
 */
public class leedcode392 {
    public boolean isSubsequence(String s, String t) {

        int i = 0;
        int j = 0;
        for(;i<t.length() && j<s.length();){
            if(t.charAt(i) == s.charAt(j)){
                i++;
                j++;
            }else{
                i++;
            }

        }
        if(j!=s.length()){
            return false;
        }
        return true;
    }
}
