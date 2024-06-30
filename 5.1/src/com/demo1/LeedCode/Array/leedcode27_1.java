package com.demo1.LeedCode.Array;

public class leedcode27_1 {
    public static void main(String[] args) {

    }
    public static int remove(int [] nums, int val){
        if(nums.length==0){
            return 0;
        }
        //i表示快指针，j代表慢指针，j表示新数组的索引，nums[i]表示需要的赋值
        int i = 0,j = 0;
        for(;i< nums.length;i++){
            if(nums[i]!=val){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
