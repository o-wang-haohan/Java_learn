package com.demo1.algorithm;

public class sum {
    public static void main(String[] args) {
        System.out.println(sum(100));
    }
    //递归最重要的是这个方法表示的含义
    //先把问题进行拆解，100的和==100+99的和
    //所以定义方法为前多少项的和即可
    //最后再注意退出递归的条件
    public static int sum(int number){
        if(number == 1){
            return 1;
        }
        return number + sum(number - 1);
    }
}
