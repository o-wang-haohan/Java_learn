package com.demo1.LeedCode.Array;

public class leedcode209 {
    public static void main(String[] args) {

    }
    public static int sum(int [] nums,int val){
        int sum = 0;
        int start = 0;
        int length = nums.length+1;
        //终止位置表示到该位置之前的最短子序列都判断过了
        //滑动窗口的思想
        for(int j = 0;j<nums.length;j++) {
            sum += nums[j];
            while(sum>=val){
                if(length>j-start +1){
                    length  = j - start +1;
                }
                sum-=nums[start];
                start++;
            }
        }
        if(length == nums.length+1){
            return 0;
        }else{
            return length;
        }
    }
}
