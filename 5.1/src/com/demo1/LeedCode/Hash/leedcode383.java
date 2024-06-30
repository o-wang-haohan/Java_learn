package com.demo1.LeedCode.Hash;

import java.util.HashMap;

public class leedcode383 {
    public static void main(String[] args) {

    }
    public static boolean canConstruct(String ransomNote, String magazine){

        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i = 0; i<magazine.length();i++){
            hm.put(magazine.charAt(i),hm.getOrDefault(magazine.charAt(i),0)+1);
        }
        for(int i = 0; i<ransomNote.length();i++){
            char c = ransomNote.charAt(i);
            int count = hm.getOrDefault(ransomNote.charAt(i),0);
            if(count>0){
                count--;
                hm.put(c,count);
            }else{
                return false;
            }
        }
        return true;
    }
}
