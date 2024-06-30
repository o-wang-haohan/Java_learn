package com.demo1.LeedCode.Hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class leedcode18 {
    public static void main(String[] args) {
        int [] nums= {2,2,2,2,2};
        int target = 8;
        fourSum(nums,target);
    }
    public static List<List<Integer>> fourSum(int[] nums, int target){
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0;i< nums.length-3;i++){
            if(nums[i]>0&&nums[i]>target){
                return list;
            }
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            for(int j = i+1;j<nums.length-2;j++){
                if(nums[j]>0&&nums[i]+nums[j]>target){
                    break;
                }
                if(j>(i+1)&&nums[j]==nums[j-1]){
                    continue;
                }
                int left = j+1;
                int end = nums.length-1;
                while(left<end){
                    if(nums[i]+nums[j]+nums[left]+nums[end]>target){
                        end--;
                    }else if(nums[i]+nums[j]+nums[left]+nums[end]<target){
                        left++;
                    }else{
                        ArrayList<Integer> arr = new ArrayList<>();
                        Collections.addAll(arr,nums[i],nums[j],nums[left],nums[end]);
                        list.add(arr);
                        left++;
                        end--;
                        while(left<end&&nums[left]==nums[left-1]){
                            left++;
                        }
                        while(left<end&&nums[end]==nums[end+1]){
                            end--;
                        }
                    }
                }
            }
        }
        return list;
    }
}
