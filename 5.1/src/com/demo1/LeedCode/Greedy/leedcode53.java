package com.demo1.LeedCode.Greedy;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/10/21 下午9:20
 */
public class leedcode53 {
    public int maxSubArray(int[] nums) {
        //res要记录数组的开始位置
        int res = nums[0];
        int max = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]<0){
                if(max+nums[i]<=0){
                    //数组全是小于0情况
                    if(nums[i]>res){
                        res = nums[i];
                    }
                    max = 0;
                }else{
                    max+=nums[i];
                }
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
