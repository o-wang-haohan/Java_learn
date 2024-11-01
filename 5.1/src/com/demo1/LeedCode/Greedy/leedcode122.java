package com.demo1.LeedCode.Greedy;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/10/22 上午9:44
 */
public class leedcode122 {
    public int maxProfit(int[] prices) {
        if(prices.length==1){
            return 0;
        }
        int max = 0;
        int min = 0;
        int res = 0;
        int prediff = 0;
        int curdiff = 0;
        for(int i = 0;i<prices.length;i++){
            if (i > 0){
                prediff = prices[i] - prices[i-1];
            }
            if(i<prices.length-1){
                curdiff = prices[i+1] - prices[i];
            }else {
                curdiff=0;
            }
            //记录下转点
            if(prediff<=0 && curdiff>0){
                min = prices[i];
            }
            //记录上转点，同时重新记录上下转点；
            if(prediff>0 && curdiff<=0){
                max = prices[i];
                res += (max-min);
                min = 0;
                max = 0;
            }
        }
        return res;
    }
}
