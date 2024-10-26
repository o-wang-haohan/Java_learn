package LeedCode.BinaryTree;

import com.demo1.LeedCode.BinaryTree.TreeNode;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/10/16 上午9:52
 */
public class leedcode98 {
    //二叉搜索树中序遍历是有序的，所以只需要中序遍历即可
    //每次只需要记录前一个指针的值即可
    TreeNode pre = null;
    public boolean isValidBST(TreeNode root){
        if(root == null){
            return true;
        }

        boolean left = isValidBST(root.left);
        if(pre!= null && pre.val>=root.val){
            return false;
        }
        pre = root;
        boolean right = isValidBST(root.right);

        return left && right;
    }
}
