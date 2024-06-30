package com.demo1.LeedCode.Hash;

import java.util.HashSet;

public class leedcode349 {
    public static void main(String[] args) {

    }
    public static int[] intersection(int[] nums1, int[] nums2){
        final int N = 1010;
        int[] res1 = new int[N];
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i = 0; i<nums1.length;i++){
            res1[nums1[i]]++;
        }
        for(int i = 0; i<nums2.length;i++){
            if(res1[nums2[i]]!=0){
                set.add(nums2[i]);
            }
        }
        int[] res = new int[set.size()];
        int j = 0;
        for(int n:set){
            res[j]=n;
            j++;
        }
        return res;
    }
}
