package LeedCode.BinaryTree;

import com.demo1.LeedCode.BinaryTree.TreeNode;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/10/16 上午11:14
 */
public class leedcode530 {
    TreeNode pre = null;
    int min = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root){
        dfs(root);
        return min;
    }
    public void dfs(TreeNode root){
        if(root == null){
            return;
        }

        dfs(root.left);
        if(pre!=null && Math.abs(root.val-pre.val)<min){
            min = Math.abs(root.val-pre.val);
        }
        pre = root;
        dfs(root.right);
    }
}
