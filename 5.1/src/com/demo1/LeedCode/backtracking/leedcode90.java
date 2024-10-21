package LeedCode.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/10/19 下午4:37
 */
public class leedcode90 {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> list = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        //去重一定要进行排序，这样才能保证相同的元素是相邻的
        Arrays.sort(nums);
        boolean[] used = new boolean[nums.length];
        backtracking(nums,0,used);
        return res;
    }
    public void backtracking(int[] nums, int start,boolean[] used) {
        if (start <= nums.length) {
            //收集树层节点和树根节点
            res.add(new ArrayList<>(list));
            //当走到树根节点的位置才进行返回；
            if (start == nums.length) {
                return;
            }
        }

        for (int i = start; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1] && used[i-1]==false) {
                continue;
            }
            used[i]=true;
            list.add(nums[i]);

            backtracking(nums, i + 1,used);
            list.remove(list.size() - 1);
            used[i]=false;
        }
    }
}
