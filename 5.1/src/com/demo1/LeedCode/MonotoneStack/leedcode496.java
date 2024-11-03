package com.demo1.LeedCode.MonotoneStack;

import java.util.Stack;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/11/2 下午2:49
 */
public class leedcode496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] answer2 = new int [nums2.length];
        int[] answer1 = new int[nums1.length];
        for(int i = 0;i<answer2.length;i++){
            answer2[i] = -1;
        }
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for(int i = 1;i<nums2.length;i++){
            while(stack.isEmpty()==false && nums2[i]>nums2[stack.peek()]){
                answer2[stack.peek()]=nums2[i];
                stack.pop();
            }

            stack.push(i);
        }
        for(int i = 0;i<nums1.length;i++){
            for(int j = 0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    answer1[i] = answer2[j];
                    break;
                }
            }
        }
        return answer1;
    }
}
