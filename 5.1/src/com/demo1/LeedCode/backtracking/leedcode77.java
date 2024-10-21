package LeedCode.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/10/17 下午10:07
 */
public class leedcode77 {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> list = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        backtracking(1,n,k);
        return res;
    }

    public void backtracking(int start, int end,int k){
        if(k==0){
            //list是引用数据类型，直接放list其实放的是地址，list最终是空的
            //所以会导致都是空，我们要用一个新new出来的数组来存储当前list数组的值；
            res.add(new ArrayList<>(list));
            return;
        }
        //剪枝一般都在终止条件这操作
        //此时表示最多从多少开始才能达到要求；
        for(int i = start;i<=end-k+1;i++){
            list.add(i);
            k--;
            backtracking(i+1,end,k);
            list.remove(list.size()-1);
            k++;
        }
        return;
    }
}
