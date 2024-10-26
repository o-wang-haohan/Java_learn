package LeedCode.BinaryTree;

import com.demo1.LeedCode.BinaryTree.TreeNode;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/10/17 下午4:25
 */
public class leedcode538 {
    //中序反方向遍历二叉搜索树（右根左）
    //sum记录每次加上当前节点的值
    //更新当前节点的值为sum
    int sum = 0;
    public TreeNode convertBST(TreeNode root){
        if(root==null){
            return null;
        }
        root.right = convertBST(root.right);
        sum = sum + root.val;
        root.val = sum;
        root.left = convertBST(root.left);
        return root;
    }
}
