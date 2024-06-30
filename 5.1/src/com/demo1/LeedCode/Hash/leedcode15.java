package com.demo1.LeedCode.Hash;

import java.util.*;

public class leedcode15 {
    public static void main(String[] args) {

    }
    public static List<List<Integer>> threeSum(int[] nums){
        HashMap<Integer,Integer> hm = new HashMap<>();
        //0表示未访问，1代表访问
        for(int i = 0;i<nums.length;i++){
            hm.put(i,nums[i]);
        }
        List<List<Integer>> list = new ArrayList<>();
        Set<Integer> keys = hm.keySet();
        for(int key1:keys){
            if(hm.get(key1)==1){
                continue;
            }
            hm.put(key1,1);
            for(int key2:keys){
                if(hm.get(key2)==1){
                    continue;
                }
                int tmp = 0-key1-key2;
                if(hm.containsKey(tmp) && hm.get(tmp)==0){
                    ArrayList<Integer> arr = new ArrayList<>();
                    Collections.addAll(arr,key1,key2,tmp);
                    list.add(arr);
                    hm.put(key2,1);
                    hm.put(tmp,1);
                }
            }
        }
        return list;
    }
}
