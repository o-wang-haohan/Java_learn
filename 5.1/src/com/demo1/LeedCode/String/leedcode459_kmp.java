package com.demo1.LeedCode.String;

public class leedcode459_kmp {
    public static void main(String[] args) {

    }
    public static boolean repeatedSubstringPattern(String s){
        int [] next = new int[s.length()];
        int j = 0;
        next[0] = 0;
        for(int i = 1;i<s.length();i++){
            while(j>0 && s.charAt(i)!=s.charAt(j)){
                j = next[j-1];
            }
            if(s.charAt(i)==s.charAt(j)){
                j++;
                next[i] = j;
            }
        }
        int len = s.length()-next[s.length()-1];
        if(s.length()%len==0&&len!=s.length()){
            return true;
        }else{
            return false;
        }
    }
}
