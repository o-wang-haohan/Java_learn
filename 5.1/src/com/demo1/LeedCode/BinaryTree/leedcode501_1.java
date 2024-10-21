package LeedCode.BinaryTree;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: whh
 * @Description: 只用一次遍历的方法；每次都进行记录，大于时会将数据清楚，再添加；
 * @Date: 2024/10/16 下午1:33
 */
public class leedcode501_1 {
    int count = 0, max_count = 0;
    TreeNode pre = null;
    List<Integer> list = new ArrayList<>();
    public int[] findMode(TreeNode root){
        dfs(root);
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }

    public void dfs(TreeNode root){
        if(root == null){
            return;
        }
        dfs(root.left);
        if(pre==null || pre.val!=root.val){
            count = 1;
        }else{
            count++;
        }
        if(count>max_count){
            list.clear();
            list.add(root.val);
            //这里操作后maxcount和count的值会改变，所以必须用else防止继续走下面的的条件
            //不然更新完值后还会走下面的步骤
            max_count = count;
        }else if(count==max_count){
            list.add(root.val);
        }
        pre = root;
        dfs(root.right);
    }
}
