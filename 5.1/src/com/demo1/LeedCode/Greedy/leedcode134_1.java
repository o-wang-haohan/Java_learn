package com.demo1.LeedCode.Greedy;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/10/23 上午11:20
 */
public class leedcode134_1 {
    //贪心思路，如果当前累加和小于0表示起始位置最少是当前的下一个位置
    //通过总的累加和判断是否有解
    public int canCompleteCircuit(int[] gas, int[] cost){
        int curSum = 0;
        int totalSum = 0;
        int start = 0;
        for(int i = 0;i<gas.length;i++){
            curSum+=gas[i]-cost[i];
            totalSum +=gas[i]-cost[i];
            if(curSum<0){
                start = i+1;
                curSum=0;
            }
        }
        if(totalSum<0){
            return -1;
        }else{
            return start;
        }
    }
}
