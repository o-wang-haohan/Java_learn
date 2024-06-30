package com.demo1.LeedCode.String;

public class KamaCoder54 {
    public static void main(String[] args) {
        String s = replaceString("a1b2c3");
        System.out.println(s);
    }
    public static String replaceString(String s){
        StringBuilder res  = new StringBuilder();
        for(int i = 0; i<s.length(); i++){
            char tmp = s.charAt(i);
            if(tmp>='a' && tmp<='z'){
                res.append(tmp);
            }else {
                res.append("number");
            }
        }
        return res.toString();
    }
}
