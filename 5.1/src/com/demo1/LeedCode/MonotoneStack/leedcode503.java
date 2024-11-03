package com.demo1.LeedCode.MonotoneStack;

import java.util.Arrays;
import java.util.Stack;

/**
 * @Author: whh
 * @Description: 环要通过取模进行模拟求解
 * 相当于重新拼接了原数组；
 * @Date: 2024/11/2 下午3:20
 */
public class leedcode503 {
    public int[] nextGreaterElements(int[] nums) {
        int[] answer = new int[nums.length];
        Arrays.fill(answer,-1);
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        //对于这种成环的问题一定要记得取模的运算
        //这样就能够走两边数组，相当于再次走一遍数组
        for(int i = 1;i<nums.length*2;i++){
            while(stack.isEmpty()==false && nums[i%nums.length]>nums[stack.peek()]){
                answer[stack.peek()] = nums[i%nums.length];
                stack.pop();
            }
            stack.push(i%nums.length);
        }
        return answer;
    }
}
