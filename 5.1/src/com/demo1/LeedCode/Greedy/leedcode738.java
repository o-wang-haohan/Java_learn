package com.demo1.LeedCode.Greedy;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/10/26 上午10:22
 */
public class leedcode738 {
    public int monotoneIncreasingDigits(int n) {
        if(n>=0 && n<=9){
            return n;
        }
        String num  = Integer.toString(n);
        int[] nums = new int[num.length()];
        for(int i = 0;i<num.length();i++){
            nums[i] = num.charAt(i) - '0';
        }
        //需要记录从哪个位置开始后面的全部是9
        int index = nums.length;
        for(int i = nums.length-1;i>0;i--){
            if(nums[i]<nums[i-1]){
                nums[i-1] -= 1;
                index = i;
            }

        }
        if(index<nums.length){
            for(int i =index;i<nums.length;i++){
                nums[i] = 9;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<nums.length;i++){
            sb.append(nums[i]);
        }

        return Integer.parseInt(sb.toString());
    }
}
