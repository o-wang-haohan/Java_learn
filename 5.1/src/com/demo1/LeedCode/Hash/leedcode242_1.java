package com.demo1.LeedCode.Hash;

public class leedcode242_1 {
    public static void main(String[] args) {

    }
    public static boolean isAnagram(String s, String t){
        if(s.length()!=t.length()){
            return false;
        }
        char[] char_s = new char[26];
        char[] char_t = new char[26];
        for(int i= 0;i<s.length();i++){
            char_s[s.charAt(i)-'a']++;
            char_t[t.charAt(i)-'a']++;
        }
        boolean flag = true;
        for(int i = 0;i<char_s.length;i++){
            if(char_s[i]!=char_t[i]){
                flag = false;
                break;
            }
        }
        return flag;
    }
}
