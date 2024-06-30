package com.demo1.LeedCode.String;

public class leedcode541 {
    public static void main(String[] args) {
        String s = "abcdefg";
        reverseStr(s,2);
    }
    public static String reverseStr(String s, int k){
        char[] arr  = s.toCharArray();
        int count = arr.length/(2*k);
        if(count>0) {
            int start = 0;
            int end = k-1;
            while (count != 0) {
                reverseStrarr(arr,start,end);
                start = start+2*k;
                end = end + 2*k;
                count--;
            }
            int remain = arr.length-1-start+1;
            if(remain<k){
                reverseStrarr(arr,start,arr.length-1);
            }else{
                reverseStrarr(arr,start,start+k-1);
            }
        }else{
            if(arr.length<k){
                reverseStrarr(arr,0,arr.length-1);
            }else{
                reverseStrarr(arr,0,k-1);
            }
        }
        String res  = new String(arr);
        return res;

    }
    //传入数组首索引和尾索引
    public static void reverseStrarr(char[] arr,int start,int end){
        for(int i = start,j = end;i<start+(end-start+1)/2;i++,j--){
            char tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
        }

    }
