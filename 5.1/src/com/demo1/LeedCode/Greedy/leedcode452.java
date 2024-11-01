package com.demo1.LeedCode.Greedy;

import java.util.Arrays;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/10/24 下午5:34
 */
public class leedcode452 {
    public static void main(String args[]){
        int[][] tt = new int[][]{new int[]{-2147483646,-2147483645}, new int[]{2147483646,2147483647}};
        findMinArrowShots(tt);
    }
    public static int findMinArrowShots(int[][] points) {
        // 根据气球直径的开始坐标从小到大排序
        // 使用Integer内置比较方法，不会溢出（否则会溢出）

        Arrays.sort(points,(a, b) -> Integer.compare(a[0], b[0]));
        int result = points.length;

        for(int i = 0;i<points.length-1;i++){
            long val = (long) points[i][1]- (long) points[i+1][0];
            if(points[i][1]<0 && points[i+1][0]>0){
                continue;
            }
            if(val>=0){
                result--;
                //只需更新有边界也可以
                int[] tmp =  new int[2];
                tmp[0] = Math.max(points[i][0],points[i+1][0]);
                tmp[1] = Math.min(points[i][1],points[i+1][1]);
                points[i+1][0] = tmp[0];
                points[i+1][1] = tmp[1];
            }
        }
        return result;
    }
}
