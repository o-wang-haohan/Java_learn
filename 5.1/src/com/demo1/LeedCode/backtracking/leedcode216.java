package LeedCode.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/10/18 上午10:20
 */
public class leedcode216 {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> list = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        backtracking(1,n,k);
        return res;
    }

    public void backtracking(int start, int n,int k){
        if(k==0 && n==0){
            res.add(new ArrayList<>(list));
            return;
        }
        if(n<0 || k<0){
            return;
        }

        //k表示还需要几个数
        //9是结束位置，9-k+1表示最晚在哪结束，剩下的元素不够了
        for(int i = start; i<=9-k+1;i++){
            list.add(i);
            k--;
            n-=i;
            backtracking(i+1,n,k);
            list.remove(list.size()-1);
            k++;
            n+=i;
        }
        return;
    }
}
