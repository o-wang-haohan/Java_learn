package com.demo1.algorithm;

public class quickSort {
    public static void main(String[] args) {
        int [] arr = {5,4,6,7,34,86,868,8,9};
        quickSort(arr,0,arr.length-1);
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void quickSort(int [] arr,int start, int end){
        //问题就在这，start是有可能直接大于end的这种情况，边界条件最好写完整
        //递归的出口一定注意
        if(start >= end){
            return;
        }

        int tmp = arr[start];
        int i=start+1, j = end;
        while(i<j){
            //i<j防止超出边界
            //并且一定要先移动右边指针，最后才能停在小于基准数的位置
            while(arr[j]>=tmp && i<j){
                j--;
            }
            while(arr[i]<=tmp && i<j){
                i++;
            }
            int t = arr[j];
            arr[j] = arr[i];
            arr[i] = t;
        }
        int t = arr[start];
        arr[start] = arr[i];
        arr[i] = t;
        //当排完序后只有一个元素时，start==i==j，此时i-1会小于start，所以出口必须是start>=end
        //当一边只有一个元素时，start==end，但是当一边没有元素时，start会小于end
        quickSort(arr, start, i-1);
        quickSort(arr, i+1, end);


    }


}
