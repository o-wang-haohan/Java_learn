package com.demo1.LeedCode.Greedy;

import java.util.Arrays;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/10/23 下午12:55
 */
public class leedcode135 {
    public int candy(int[] ratings) {
        if(ratings.length==0){
            return 0;
        }
        if(ratings.length==1){
            return 1;
        }
        //分为两次去遍历数组
        //第一次右边比左边大
        //第二次左边比右边大
        //最后取两次的最值
        int[] candy = new int[ratings.length];
        Arrays.fill(candy, 1);
        for(int i = 0;i<ratings.length-1;i++){
            if(ratings[i+1]>ratings[i]){
                candy[i+1] = candy[i]+1;
            }
        }
        for(int i = ratings.length-1;i>0;i--){
            if(ratings[i-1]>ratings[i]){
                candy[i-1] = Math.max(candy[i]+1,candy[i-1]);
            }
        }
        int sum = Arrays.stream(candy).sum();
        return sum;
    }
}
