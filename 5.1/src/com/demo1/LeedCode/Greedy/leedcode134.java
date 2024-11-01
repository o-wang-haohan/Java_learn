package com.demo1.LeedCode.Greedy;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/10/23 上午10:40
 */
public class leedcode134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int[] nums = new int[gas.length];
        for(int i = 0;i<gas.length;i++){
            nums[i] = gas[i] - cost[i];
        }
        if(nums.length==1){
            if(nums[0]>=0){
                return 0;
            }else{
                return -1;
            }
        }
        int index = -1;
        for(int i = 0;i<nums.length;i++){
            int sum = 0;
            if(nums[i]>0){
                int count = nums.length;
                int j = i;
                while(count!=0){
                    sum+=nums[j%nums.length];
                    count--;
                    if(sum<0){
                        break;
                    }
                    j++;
                }
                if(sum<0){
                    i = j;
                }else{
                    return i;
                }
            }
        }
        return index;
    }
}
