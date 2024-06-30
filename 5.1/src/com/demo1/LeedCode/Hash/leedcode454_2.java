package com.demo1.LeedCode.Hash;

import java.util.HashMap;

public class leedcode454_2 {
    public static void main(String[] args) {

    }
    public static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4){
        int n = nums1.length;
        HashMap<Integer,Integer> hm1 = new HashMap<>();
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                int n1 = nums1[i]+nums2[j];
                hm1.put(n1,hm1.getOrDefault(n1,0)+1);
            }
        }

        int count=0;
        for(int i = 0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                int tmp  = 0-(nums3[i]+nums4[j]);
                if(hm1.containsKey(tmp)){
                    count+=hm1.get(tmp);
                }
            }
        }
        return count;
    }
}
