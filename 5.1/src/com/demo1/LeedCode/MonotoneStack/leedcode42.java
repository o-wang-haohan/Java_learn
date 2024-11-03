package com.demo1.LeedCode.MonotoneStack;

import java.util.Stack;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/11/2 下午4:52
 */
public class leedcode42 {
    public int trap(int[] height) {
        int[] answer  = new int[height.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        int res = 0;
        for(int i = 1;i<height.length;i++){
            while(stack.isEmpty()==false && height[i]>height[stack.peek()]){
                int mid = stack.pop();
                if(stack.isEmpty()==false){
                    int h = Math.min(height[i],height[stack.peek()])-height[mid];
                    int w = i-stack.peek()-1;
                    res+=h*w;
                }
            }
            stack.push(i);
        }
        return res;
    }
}
