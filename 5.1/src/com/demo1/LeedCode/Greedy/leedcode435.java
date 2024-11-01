package com.demo1.LeedCode.Greedy;

import java.util.Arrays;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/10/25 上午10:21
 */
public class leedcode435 {
    public int eraseOverlapIntervals(int[][] intervals) {
        int res = 0;
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));
        for(int i = 0; i<intervals.length-1;i++){
            if(intervals[i][1]<=intervals[i+1][0]){
                continue;
            }else {
                res++;
                intervals[i+1][1] = Math.min(intervals[i][1],intervals[i+1][1]);
            }
        }
        return res;
    }
}
