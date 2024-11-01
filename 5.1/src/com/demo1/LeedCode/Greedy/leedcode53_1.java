package com.demo1.LeedCode.Greedy;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/10/21 下午9:46
 */
public class leedcode53_1 {
    public int maxSubArray(int[] nums) {
        //res要记录数组的开始位置
        int res = nums[0];
        int max = 0;
        for(int i = 0;i<nums.length;i++){
            //如果连续和小于0，那么就立即抛弃连续和，重新计算
            //因为此时负数加上任何数都会变小；
            if(max+nums[i]<0){
                if(nums[i]>res){
                    res = nums[i];
                }
                max = 0;
            }else{
                max+=nums[i];
                if(max>res){
                    res = max;
                }
            }
        }
        return res;
    }
}
