package com.demo1.LeedCode.Greedy;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/10/21 下午8:39
 */
public class leedcode376_1 {
    public int wiggleMaxLength(int[] nums) {
        if(nums.length==1){
            return 1;
        }
        if(nums.length==2){
            if(nums[0]==nums[1]){
                return 1;
            }else return 2;
        }
        //prediff记录前一个差值
        //curdiff记录后一个差值
        //本来就是要判断前后差值是相反的，所以就要这样设计
        int prediff = 0;
        int curdiff = 0;
        int count=1;
        for(int i = 0;i<nums.length-1;i++){
            curdiff = nums[i+1]-nums[i];
            if(prediff>=0 && curdiff<0 || prediff<=0 && curdiff>0){
                count++;
                prediff = curdiff;
            }
        }
        return count;
    }
}
