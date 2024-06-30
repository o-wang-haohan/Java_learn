package com.demo1.LeedCode.String;

public class leedcode28 {
    public static void main(String[] args) {
       int res =  strStr("mississippi","issipi");
       System.out.println(res);
    }
    public static int strStr(String haystack, String needle){
        if(haystack.length()<needle.length()){
            return -1;
        }
        int i = 0, j = 0;
        while(i<haystack.length()){
            int tmp = i;
            while(j<needle.length() && tmp<haystack.length()){
                if(haystack.charAt(tmp)==needle.charAt(j)){
                    tmp++;
                    j++;
                }else {
                    j = 0;
                    break;
                }
            }
            if(j==needle.length()){
                return i;
            }else{
                i++;
            }
        }
        return -1;
    }
}
