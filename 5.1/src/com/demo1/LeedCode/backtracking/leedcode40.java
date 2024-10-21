package LeedCode.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/10/18 下午3:18
 */
public class leedcode40 {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> list = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target){
        Arrays.sort(candidates);
        //去重时看是树枝层还是树层；
        boolean[] used = new boolean[candidates.length];
        backtracking(candidates,target,0,used);
        return res;
    }

    public void backtracking(int[] candidates, int target,int start,boolean[] used) {
        if (target == 0) {
            res.add(new ArrayList<>(list));
            return;
        }
        if (target < 0) {
            return;
        }
        //start表示当前遍历到的位置
        //如果当前元素已经大于目标和，后面的循环都没有答案了，直接剪枝
        for (int i = start; i < candidates.length && candidates[i] <= target; i++) {
            //去重的逻辑，当前元素和前一个元素相等，并且当前是位于树层位置才能去重
            //used数组控制当前是哪个位置，used[i]=true时是进入了树枝层面，这种情况要保留（1，1，6）
            //要保证前一个相同的元素是没使用的
            if(i>0 && candidates[i]==candidates[i-1] && used[i-1]==false){
                continue;
            }
            list.add(candidates[i]);
            target -= candidates[i];
            used[i] = true;
            backtracking(candidates, target, i + 1,used);
            list.remove(list.size() - 1);
            target += candidates[i];
            used[i] = false;
        }
    }
}
