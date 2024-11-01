package com.demo1.LeedCode.Greedy;

import java.util.Arrays;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/10/21 下午7:03
 */
public class leedcode455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        for(int i = s.length-1,j = g.length-1;i>=0 && j>=0;){
            if(s[i]>=g[j]){
                count++;
                i--;
                j--;
            }else {
                j--;
            }
        }
        return count;
    }

}
