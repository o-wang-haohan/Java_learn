package LeedCode.BinaryTree;

import java.util.*;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/10/16 下午12:43
 */
public class leedcode501 {
    Map<Integer,Integer> val_count = new HashMap<>();
    public int[] findMode(TreeNode root){
        dfs(root);
        int val_max = Collections.max(val_count.values());
        List<Integer> res = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : val_count.entrySet()){
            if(entry.getValue()==val_max){
                res.add(entry.getKey());
            }
        }
        int[] arrays = new int[res.size()];
        int i = 0;
        for(int item : res){
            arrays[i] = item;
            i++;
        }
        return arrays;

    }
    public void dfs(TreeNode root){
        if(root == null){
            return;
        }
        dfs(root.left);
        if(val_count.get(root.val)==null){
            val_count.put(root.val,1);
        }else{
            val_count.put(root.val,val_count.get(root.val)+1);
        }
        dfs(root.right);
    }
}
