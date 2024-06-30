package com.demo1.LeedCode.Array;

public class leedcode27 {
    public static void main(String[] args) {
        int [] nums = {3,3};
        remove(nums, 5);
    }
    public static void remove(int [] nums, int val){
        if(nums.length==0){
            return ;
        }
        int i = 0, j = nums.length-1;
        int count =0;
        while(i<j){
            while(nums[j]==val && i<j){
                j--;
            }
            while(nums[i]!=val && i<j){
                i++;
            }

            if(nums[i]==val && nums[j]!=val) {
                nums[i] = nums[j];
                nums[j] = val;
            }
        }
        if(nums[i]==val){
            System.out.print(i);
        }else {
            System.out.print(i+1);
        }
        //Arrays.toString(nums);

    }

}
