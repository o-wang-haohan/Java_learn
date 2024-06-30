package com.demo1.LeedCode.Array;

public class leedcode59 {
    public static void main(String[] args) {

    }

    public static int [][] matix(int n){
        int [][] nums = new int[n][n];
        int i =0;
        int j =0;
        int startx = 0;
        int starty = 0;
        int offset = 1;
        int t = 1;
        int loop = n/2;
        while(loop!=0){
            i = startx;
            for(j = starty;j<n-offset;j++){
                nums[i][j] = t;
                t++;
            }
            for(i = startx;i<n-offset;i++){
                nums[i][j] = t;
                t++;
            }
            for(;j>starty;j--){
                nums[i][j] = t;
                t++;
            }
            for(;i>startx;i--){
                nums[i][j] = t;
                t++;
            }
            startx++;
            starty++;
            offset++;
            loop--;

        }
        if(n%2!=0){
            nums[n/2][n/2]=t;
        }
        return nums;
    }
}
