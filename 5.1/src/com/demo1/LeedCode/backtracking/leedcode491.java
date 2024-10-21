package LeedCode.backtracking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/10/20 上午10:39
 */
public class leedcode491 {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> list = new ArrayList<>();
    public List<List<Integer>> findSubsequences(int[] nums) {
        backtracking(nums,0);
        return res;
    }
    //此题无法对数组进行排序，所以无法使用used数组
    //直接使用hashset去记录每层的元素是否包含当前元素即可
    public void backtracking(int[] nums, int start){
        if(list.size()>=2){
            res.add(new ArrayList<>(list));
        }
        if(start>=nums.length){
            return;
        }
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i = start; i< nums.length;i++){
            if(list.size()>0 && nums[i]<list.get(list.size()-1) || hashSet.contains(nums[i])){
                continue;
            }else{
                list.add(nums[i]);
                hashSet.add(nums[i]);
                //每次递归都会创建一个新的hashset，所以只能递归一次；
                backtracking(nums,i+1);
                list.remove(list.size()-1);
            }

        }
    }
}
