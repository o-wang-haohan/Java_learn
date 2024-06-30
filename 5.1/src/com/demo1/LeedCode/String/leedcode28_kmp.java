package com.demo1.LeedCode.String;

public class leedcode28_kmp {
    public static void main(String[] args) {
       int t  =  strStr("ababcaababcaabc","ababcaabc");
       System.out.print(t);
       System.out.println();
       String s = "ababcaabc";
       int[] next = new int[s.length()];
       getNext(next,s);
    }

    public static int strStr(String haystack, String needle){
        if(haystack.length()<needle.length()){
            return -1;
        }
        int [] next = new int[needle.length()];
        /*
        for(int i = 1;i<needle.length();i++){
            for(int tmp_start = i-1,tmp_end = 1;tmp_start>=0;tmp_start--,tmp_end++){
                if(needle.substring(0,tmp_start+1).equals(needle.substring(tmp_end,i+1))){
                    next[i] = tmp_start+1;
                    break;
                }
            }

        }
         */
        getNext(next,needle);
        for(int i = 0,j = 0;i<haystack.length();){
            if(haystack.charAt(i)==needle.charAt(j)){
                if(j==needle.length()-1){
                    return i-j;
                }
                i++;
                j++;

            }else{
                if(j==0){
                    i++;
                    continue;
                }
                j = next[j-1];

            }
        }
        return -1;

    }
    public static void getNext(int[] next, String s){
        //j是后缀末尾的位置，i是前缀起始的位置
        int j = 0;
        next[0] = 0;
        for(int i = 1;i<s.length();i++){
            while(j>0&&s.charAt(i)!=s.charAt(j)){
                j = next[j-1];
            }
            if(s.charAt(i)==s.charAt(j)){
                j++;
                next[i] = j;
            }
        }

    }
}
