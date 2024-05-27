package com.demo1.Student;

import java.util.Random;
import java.util.Vector;
//生成验证码
public class Test {
    public static void main(String[] args) {
        String str = getCode();
        System.out.println(str);
    }

    public static String getCode(){
        //生成随机大写和小写字母，先将所有的大写和小写字母存储到向量中
        //生成随机索引，取值即可
        Vector<Character> list = new Vector<>();
        for (int i = 0; i<26; i++){
            char ch = (char) ('a' + i);
            char ch1 = (char) ('A' + i);
            list.add(ch);
            list.add(ch1);
        }
        //拼接字符串首选StringBuilder类
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        for(int i = 0; i<4; i++){
            int index = r.nextInt(list.size());
            char c = list.get(index);
            sb.append(c);
        }
        int num = r.nextInt(10);
        sb.append(num);
        String code = convert(sb.toString());
        return code;
    }
    //打乱字符串的数据，生成随机索引，交换当前元素和随机索引的值即可
    //改变字符串的值的两种方法：1.字符串转为字符数组，2.subString方法
    public static String convert(String str){
        char [] chs = str.toCharArray();
        Random r = new Random();
        int num = r.nextInt(str.length() - 1);
        char temp = chs[num];
        chs[num] = chs[str.length() - 1];
        chs[str.length() - 1] = temp;
        String st = new String(chs);
        return st;
    }
}
