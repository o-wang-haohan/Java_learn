package LeedCode.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/10/20 下午1:34
 */
public class leedcode46 {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> list = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        boolean[] used = new boolean[nums.length];
        backtracking(nums,used);
        return res;
    }

    public void backtracking(int[] nums, boolean[] used){
        if(list.size()==nums.length){
            res.add(new ArrayList<>(list));
            return;
        }

        for(int i = 0;i<nums.length;i++){
            if(used[i]==false){
                list.add(nums[i]);
                used[i]=true;
                backtracking(nums,used);
                list.remove(list.size()-1);
                used[i]=false;
            }
        }
    }
}
