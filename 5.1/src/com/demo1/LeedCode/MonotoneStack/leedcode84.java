package com.demo1.LeedCode.MonotoneStack;

import java.util.Stack;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/11/2 下午8:44
 */
public class leedcode84 {
    public int largestRectangleArea(int[] heights) {
        //对于每个元素往左找第一个小的和往右找第一个小于当前元素的位置
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        int res = 0;
        //在数组左右两边分别加0这样就避免边界处理；
        for(int i = 0;i<heights.length;i++){
            while(stack.isEmpty()==false && heights[i]<heights[stack.peek()]){
                int mid = stack.pop();
                if(stack.isEmpty()==false){
                    int h = heights[mid];
                    int w = i-stack.peek()-1;
                    res = Math.max(h*w,res);
                }else{
                    int h = heights[mid];
                    int w = i-(-1)-1;
                    res = Math.max(h*w,res);
                }
            }
            stack.push(i);
        }
        while(stack.isEmpty()==false){
            int mid = stack.pop();
            if(stack.isEmpty()==false){
                int h = heights[mid];
                int w = heights.length-stack.peek()-1;
                res = Math.max(h*w,res);
            }else{
                res = Math.max(res,heights[mid]*heights.length);
            }
        }
        return res;
    }
}
