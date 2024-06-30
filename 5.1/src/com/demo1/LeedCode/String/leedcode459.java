package com.demo1.LeedCode.String;

public class leedcode459 {
    public static void main(String[] args) {

    }
    public static boolean repeatedSubstringPattern(String s){
        boolean flag = false;
        for(int i = 0;i<s.length()/2;i++){
            if(s.length()%(i+1)!=0){
                continue;
            }
            int j = i+1;
            for(;j<s.length();){
                if(s.charAt(j)==s.charAt(j%(i+1))){
                    j++;
                }else{
                    break;
                }
            }
            if(j==s.length()){
                flag = true;
            }
        }
        return flag;
    }
}
