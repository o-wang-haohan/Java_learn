package com.demo1.LeedCode.Greedy;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/10/22 上午10:11
 */
public class leedcode122_1 {
    public int maxProfit(int[] prices) {
        if(prices.length==1){
            return 0;
        }
        int res = 0;
        //整个区间分为每一天的区间
        //只需每一天的区间是整数就加进去
        for(int i = 1; i<prices.length;i++){
            if(prices[i]-prices[i-1]>0){
                res+=prices[i]-prices[i-1];
            }
        }
        return res;
    }
}
