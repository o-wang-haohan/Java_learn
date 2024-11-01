package com.demo1.LeedCode.Greedy;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: whh
 * @Description:
 * 巧妙的解法，通过先记录每个字母所在的最远位置
 * 存储时利用小写字母的特性；
 * 对于每个最远位置进行更新，如果遍历到最远位置就记录目前的个数，并且更新左边界；
 * @Date: 2024/10/25 上午10:41
 */
public class leedcode763 {
    public List<Integer> partitionLabels(String s) {
        List<Integer> res = new ArrayList<>();
        //先统计字母最远出现的位置
        //每个字母在数组里面的最远位置
        //hash的每个位置代表每个字母
        int[] hash = new int[27];
        for(int i = 0;i<s.length();i++){
            //巧妙的利用字母差来记录位置
            hash[s.charAt(i)-'a'] = i;
        }
        int left = 0;
        int right = 0;
        for(int i = 0;i<s.length();i++){
            //右边位置表示目前最远的
            right = Math.max(hash[s.charAt(i) - 'a'],right);
            if(i==right){
                res.add(right-left+1);
                left = i+1;
            }
        }
        return res;

    }
}
