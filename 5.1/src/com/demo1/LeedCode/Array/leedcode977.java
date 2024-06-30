package com.demo1.LeedCode.Array;

public class leedcode977 {
    public static void main(String[] args) {
        int [] t = {-7,-3,2,3,11};
        int [] r = squer(t);
        for(int i = 0; i<r.length; i++){
            System.out.print(r[i]+" ");
        }

    }
    public static int [] squer(int [] nums){
        final int N  = 10010;
        int [] p = new int[N];
        int [] res = new int [nums.length];
        //ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = 0; i<nums.length; i++){
            int index = Math.abs(nums[i]);
            p[index]++;
        }
        int t = 0;
        for(int i = 0; i<p.length; i++){
            int count = p[i];
            if(count==0){
                continue;
            }else {
                while(count!=0){
                    res[t]=i*i;
                    t++;
                    count--;
                }
            }
        }

        return res;

    }
}
