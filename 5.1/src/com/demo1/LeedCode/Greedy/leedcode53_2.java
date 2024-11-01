package com.demo1.LeedCode.Greedy;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/10/21 下午9:58
 */
public class leedcode53_2 {
    public int maxSubArray(int[] nums) {
        //最大子序列和
        int res = Integer.MIN_VALUE;
        //当前连续子序列和
        int max = 0;
        for(int i = 0;i<nums.length;i++){
            //如果连续和小于0，那么就立即抛弃连续和，重新计算
            //因为此时负数加上任何数都会变小；
            max+=nums[i];
            if(max>res){
                res = max;
            }
            if(max<0){
                max = 0;
            }
        }
        return res;
    }
}
