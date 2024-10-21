package LeedCode.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/10/18 下午2:21
 */
public class leedcode39 {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> list = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target){
        //先对数组进行排序后面剪枝
        Arrays.sort(candidates);
        backtracking(candidates,target,1,0);
        return res;
    }

    public void backtracking(int[] candidates, int target,int k,int start){
        if(target==0){
            res.add(new ArrayList<>(list));
            return;
        }
        if(target<0){
            return;
        }
        if(k>=150){
            return;
        }
        //start表示当前遍历到的位置
        //如果当前元素已经大于目标和，后面的循环都没有答案了，直接剪枝
        for(int i = start;i<candidates.length && candidates[i]<=target;i++){
            list.add(candidates[i]);
            target-=candidates[i];
            backtracking(candidates,target,k+1,i);
            list.remove(list.size()-1);
            target+=candidates[i];
        }
    }
}
