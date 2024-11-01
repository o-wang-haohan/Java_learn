package com.demo1.LeedCode.Greedy;

import java.util.Arrays;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/10/22 下午2:20
 */
public class leedcode1005 {

    public  int largestSumAfterKNegations(int[] nums, int k) {
        //正数最小值
        int min_nums = Integer.MAX_VALUE;
        //总和
        int sum = 0;
        int count = 0;
        int[] nums_f = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            if(nums[i]<0){
                nums_f[count] = nums[i];
                count++;
            }else{
                sum+=nums[i];
                min_nums = Math.min(nums[i],min_nums);
            }
        }
        Arrays.sort(nums_f);
        for(int i = 0;i<count;i++){
            if(k>0){
                sum+=Math.abs(nums_f[i]);
                k--;
                min_nums = Math.min(Math.abs(nums_f[i]),min_nums);
            }else{
                sum+=nums_f[i];
            }
        }
        if(k>0 && k%2==0){
            return sum;
        }else if(k>0 && k%2==1){
            return sum-min_nums*2;
        }else {
            return sum;
        }
    }
}
