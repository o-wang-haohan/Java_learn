package com.demo1.LeedCode.Greedy;

/**
 * @Author: whh
 * @Description:
 * 需要记录当前覆盖范围和下一步覆盖范围；
 * @Date: 2024/10/22 上午11:04
 */
public class leedcode45 {
    public int jump(int[] nums) {
        if(nums.length==1){
            return 0;
        }
        int count = 0;
        //当前覆盖范围
        int cover = 0;
        //下一步的覆盖范围
        int next = 0;
        for(int i = 0;i<nums.length;i++){
            //在上一步覆盖范围里面能跳的最远的距离
            next = Math.max(i+nums[i],next);
            //如果到达当前覆盖范围最后一个
            if(i==cover){
                //当前没有到终点
                if(cover<nums.length-1){
                    count++;
                    //将当前覆盖范围更新
                    cover = next;
                    //更新后要再次判断是否能到达终点
                    if(cover>=nums.length-1){
                        break;
                    }
                }else {
                    break;
                }
            }
        }
        return count;
    }
}
