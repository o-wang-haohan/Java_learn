package com.demo1.LeedCode.Hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class leedcode15_1 {
    public static void main(String[] args) {
        int [] nums ={-1,0,1,2,-1,-4};
        threeSum(nums);
    }
    public static List<List<Integer>> threeSum(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>> list  = new ArrayList<>();
        for(int i = 0;i<nums.length-1;i++){
            if(nums[i]>0){
                break;
            }
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            int left = i+1;
            int end = nums.length-1;
            while(left<end){
                if(nums[i]+nums[left]+nums[end]==0){
                    ArrayList<Integer> arr = new ArrayList<>();
                    Collections.addAll(arr,nums[i],nums[left],nums[end]);
                    list.add(arr);
                    left++;
                    end--;
                    while(left<end&&nums[end]==nums[end+1]){
                        end--;
                    }
                    while(left<end&&nums[left]==nums[left-1]){
                        left++;
                    }
                    continue;
                }
                if(nums[i]+nums[left]+nums[end]>0){
                    end--;
                    continue;
                }
                if(nums[i]+nums[left]+nums[end]<0){
                    left++;
                }

            }
        }
        return list;
    }
}
