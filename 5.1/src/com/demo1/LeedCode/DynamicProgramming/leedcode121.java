package com.demo1.LeedCode.DynamicProgramming;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/10/30 下午2:41
 */
public class leedcode121 {
    public int maxProfit(int[] prices) {
        int res = 0;
        int low = prices[0];
        for(int i = 0;i<prices.length;i++){
            //贪心的思路
            //取最左边的最小值
            low = Math.min(low,prices[i]);
            //找到最小值后，找从最小值开始的后面的差值的最大值；
            res = Math.max(res,prices[i]-low);
        }
        return res;
    }
}
