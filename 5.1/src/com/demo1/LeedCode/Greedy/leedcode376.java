package com.demo1.LeedCode.Greedy;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/10/21 下午7:20
 */
public class leedcode376 {
    public int wiggleMaxLength(int[] nums) {
        if(nums.length==1){
            return 1;
        }
        if(nums.length==2){
            if(nums[0]==nums[1]){
                return 1;
            }else return 2;
        }
        boolean flag = true;
        int count = 1;
        int j;
        for(j = 1;j<nums.length;j++){
            if(nums[j]==nums[j-1]){
                continue;
            }else{
                break;
            }
        }
        for(int i = j;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                continue;
            }
            if(i==j){
                if(nums[i]-nums[i-1]>0){
                    flag=true;
                    count++;
                }else{
                    flag=false;
                    count++;
                }
            }else {
                if(flag==true){
                    if(nums[i]-nums[i-1]<0){
                        flag=false;
                        count++;
                        continue;
                    }else{
                        while(i<nums.length && nums[i]-nums[i-1]>0){
                            i++;
                        }
                    }
                }else{
                    if(nums[i]-nums[i-1]>0){
                        flag=true;
                        count++;
                        continue;
                    }else{
                        while(i<nums.length && nums[i]-nums[i-1]<0){
                            i++;
                        }
                    }
                }
            }
        }
        return count;
    }
}
