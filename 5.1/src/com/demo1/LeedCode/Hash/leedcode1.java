package com.demo1.LeedCode.Hash;

import java.util.HashMap;
import java.util.Set;

public class leedcode1 {
    public static void main(String[] args) {
        int[] nums = {-18,12,3,0};
        twoSum(nums,-6);
    }
    public static int [] twoSum(int[] nums, int target){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                int count = hm.get(nums[i]);
                count++;
                hm.put(nums[i],count);
            }else {
                hm.put(nums[i],1);
            }
        }
        int[] res = new int[2];
        Set<Integer> hs = hm.keySet();
        for(int n : hs){
            int y = target - n;
            if(y==n){
                if(hm.get(n)>1){
                    res[0]=n;
                    res[1]=n;
                }
            }else{
                if(hs.contains(y)==true){
                    res[0]=n;
                    res[1]=y;
                }
            }
        }
        int [] result = new int[2];
        if(res[0]==res[1]){
            int i = 0;
            for(;i<nums.length;i++){
                if(nums[i]==res[0]){
                    result[0]=i;
                    break;
                }
            }
            for(int j = i+1;j<nums.length;j++){
                if(nums[j]==res[1]){
                    result[1]=j;
                    break;
                }
        }
    }else{
            for(int i = 0;i<nums.length;i++){
                if(nums[i]==res[0]){
                    result[0]=i;
                }
                if(nums[i]==res[1]){
                    result[1]=i;
                }
            }
        }
        return result;
    }
}
