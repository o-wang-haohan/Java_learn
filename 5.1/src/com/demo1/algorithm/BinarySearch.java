package com.demo1.algorithm;

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {10,12,16,23,34,56,78};
        int number = 128;
        int i = search(arr, number);
        System.out.println(i);
    }

    public static int search(int [] arr, int number){
        int min = 0;
        int max = arr.length-1;
        int mid = (min+max)/2;
        int count = 0;
        while(min<=max){
            count++;
            if(arr[mid]==number){
                System.out.println(count);
                return mid;
            }
            if(arr[mid]>number){
                max = mid -1;
                mid = (min + max)/2;
            }
            if(arr[mid]<number){
                min = mid +1;
                mid = (min + max)/2;
            }
        }
        System.out.println(count);
        return -1;
    }
}
