package LeedCode.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/10/20 下午2:11
 */
public class leedcode47 {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> list = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        boolean[] used = new boolean[nums.length];
        Arrays.sort(nums);
        backtracking(nums,used);
        return res;
    }
    public void backtracking(int[] nums, boolean[] used){
        if(list.size()==nums.length){
            res.add(new ArrayList<>(list));
            return;
        }

        for(int i = 0;i<nums.length;i++){
            if(used[i]==true || (i>0 && nums[i]==nums[i-1] && used[i-1]==false)){
                continue;
            }
            list.add(nums[i]);
            used[i]=true;
            backtracking(nums,used);
            list.remove(list.size()-1);
            used[i]=false;
        }
    }
}
