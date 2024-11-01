package com.demo1.LeedCode.Greedy;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/10/25 上午11:18
 */
public class leedcode56 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)-> Integer.compare(a[0],b[0]));
        //定义新数组来接收
        ArrayList<int[]> que = new ArrayList<>();
        que.add(intervals[0]);
        for(int i = 1;i<intervals.length;i++){
            //利用新数组的最后一个元素进行接收
            if(que.get(que.size()-1)[1]>=intervals[i][0]){
                //更新右边界
                que.get(que.size()-1)[1] = Math.max(que.get(que.size()-1)[1],intervals[i][1]);
            }else{
                //加入当前元素
                que.add(intervals[i]);
            }
        }
        //que转数组时要给出具体类型
        return que.toArray(new int[que.size()][]);
    }
}
