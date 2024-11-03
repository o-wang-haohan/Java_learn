package com.demo1.LeedCode.MonotoneStack;

import java.util.Stack;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/11/2 下午2:14
 */
public class leedcode739 {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] answer = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        //单调栈中存放下标
        stack.push(0);
        for(int i = 1;i<temperatures.length;i++){
            while(stack.isEmpty()==false && temperatures[i]>temperatures[stack.peek()]){
                answer[stack.peek()] = i-stack.peek();
                stack.pop();
            }
            if(stack.isEmpty()){
                stack.push(i);
                continue;
            }else{
                stack.push(i);
            }
        }
        return answer;
    }
}
