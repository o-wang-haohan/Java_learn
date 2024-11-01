package com.demo1.LeedCode.Greedy;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/10/24 上午11:25
 */
public class leedcode406 {
    //对于两个维度的题目，一定是先根据一个维度来排序
    //然后再以第二个维度来排序
    //先根据身高来排，这样前面有多少个比当前大的就确定了
    //然后再根据k来进行插入操作
    public int[][] reconstructQueue(int[][] people) {
        //排序规则的书写；
        Arrays.sort(people, (a,b)->{
            if(a[0]==b[0]) return a[1]-b[1];
            return b[0]-a[0];
        });
        //linkedlist能够根据序号插入数据；
        LinkedList<int[]> que = new LinkedList<>();
        for(int i = 0;i<people.length;i++){
            int index = people[i][1];
            que.add(index,people[i]);
        }
        //直接转换为数组，但是要给出类型；
        int[][] res = que.toArray(people);
        return res;
    }
}
