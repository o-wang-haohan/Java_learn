package com.demo1.LeedCode.DynamicProgramming;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/10/26 下午3:42
 */
public class leedcode509 {
    public int fib(int n) {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int[] nums = new int[n+1];
        nums[0] = 0;
        nums[1] = 1;
        for(int i = 2;i<=n;i++){
            nums[i] = nums[i-1]+nums[i-2];
        }
        return nums[n];
    }
}
