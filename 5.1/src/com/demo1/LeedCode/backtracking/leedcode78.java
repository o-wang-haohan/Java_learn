package LeedCode.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/10/19 下午3:55
 */
public class leedcode78 {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> list = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        backtracking(nums,0);
        return res;
    }

    public void backtracking(int[] nums, int start){
        if(start<=nums.length){
            //收集树层节点和树根节点
            res.add(new ArrayList<>(list));
            //当走到树根节点的位置才进行返回；
            if(start==nums.length){
                return;
            }
        }


        for(int i = start;i<nums.length;i++){
            list.add(nums[i]);
            backtracking(nums,i+1);
            list.remove(list.size()-1);
        }
    }
}
