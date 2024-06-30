package com.demo1.LeedCode.Hash;

public class leedcode454 {
    public static void main(String[] args) {

    }
    public static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4){
        int n = nums1.length;
        long[] nums5 = new long[n*n];
        long[] nums6 = new long[n*n];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                nums5[i*n+j] = nums1[i]+nums2[j];
                nums6[i*n+j] = nums3[i]+nums4[j];
            }
        }
        int count=0;
        for(int i= 0;i<nums5.length;i++){
            for(int j = 0;j<nums6.length;j++){
                if(nums5[i]+nums6[j]==0){
                    count++;
                }
            }
        }
        return count;
    }
}
