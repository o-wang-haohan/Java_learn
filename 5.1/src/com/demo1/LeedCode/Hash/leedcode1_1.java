package com.demo1.LeedCode.Hash;

import java.util.HashMap;

public class leedcode1_1 {
    public static void main(String[] args) {

    }
    public static int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> hm = new HashMap<>();
        int[] res = new int [2];
        for(int i = 0;i<nums.length;i++){
            if(hm.containsKey(target-nums[i])==false){
                hm.put(nums[i],i);
            }else{
                res[0] = hm.get(target-nums[i]);
                res[1] = i;
                break;
            }
        }
        return res;
    }
}
