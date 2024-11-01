package com.demo1.LeedCode.Greedy;

/**
 * @Author: whh
 * @Description: 采用覆盖范围来解决此题
 * 只需看能够覆盖到哪个位置就行
 * @Date: 2024/10/22 上午10:20
 */
public class leedcode55 {
    public boolean canJump(int[] nums) {
        if(nums.length==1){
            return true;
        }
        int cover = 0;
        //i结束位置为最大覆盖范围
        for(int i = 0; i<=cover;i++){
            //当前元素覆盖范围与最大覆盖范围进行比较
            cover = Math.max(i+nums[i],cover);
            if(cover>=nums.length-1){
                return true;
            }
        }
        return false;
    }

}
