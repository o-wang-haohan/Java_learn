package com.demo1.LeedCode.Hash;

import java.util.HashMap;
import java.util.Set;

public class leedcode454_1 {
    public static void main(String[] args) {

    }
    public static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4){
        int n = nums1.length;

        HashMap<Integer,Integer> hm1 = new HashMap<>();
        HashMap<Integer,Integer> hm2 = new HashMap<>();
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                int n1 = nums1[i]+nums2[j];
                int n2 = nums3[i]+nums4[j];
                if(hm1.containsKey(n1)==true){
                    int tmp = hm1.get(n1);
                    tmp++;
                    hm1.put(n1,tmp);
                }else{
                    hm1.put(n1,1);
                }
                if(hm2.containsKey(n2)==true){
                    int tmp = hm2.get(n2);
                    tmp++;
                    hm2.put(n2,tmp);
                }else{
                    hm2.put(n2,1);
                }
            }
        }
        int count=0;
        Set<Integer> set = hm1.keySet();
        for(int key1:set){
            int tmp = 0-key1;
            if(hm2.containsKey(tmp)){
                count+=hm1.get(key1)*hm2.get(tmp);
            }
        }
        return count;
    }
}
