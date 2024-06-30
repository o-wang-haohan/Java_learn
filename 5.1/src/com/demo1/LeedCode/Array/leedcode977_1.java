package com.demo1.LeedCode.Array;

public class leedcode977_1 {
    public static void main(String[] args) {

    }
    public static int [] squer(int [] nums){
        int i = 0;
        int j = nums.length-1;
        int k = nums.length-1;
        int [] res = new int [nums.length];
        while(k>=0){
            if(nums[i]*nums[i]>nums[j]*nums[j]){
                res[k]=nums[i]*nums[i];
                i++;

            }else{
                res[k] = nums[j]*nums[j];
                j--;

            }
            k--;
        }
        return res;
    }
}
