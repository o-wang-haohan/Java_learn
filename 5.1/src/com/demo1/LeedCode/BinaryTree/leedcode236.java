package LeedCode.BinaryTree;

import com.demo1.LeedCode.BinaryTree.TreeNode;

/**
 * @Author: whh
 * @Description:
 * 必须是一个在左子树一个在右子树这种情况，或者其中一个在当前根节点；
 * 从底向上遍历，也即是后序遍历；
 * 左子树或者右子树出现节点即返回；
 * 左右子树都出现节点返回自身；
 * 此时自身就是最近公共祖先节点；
 * @Date: 2024/10/16 下午3:07
 */
public class leedcode236 {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        if(root == null){
            return null;
        }
        if(root==p || root==q){
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);

        if(left != null && right!=null){
            return root;
        }
        if(left != null && right ==null){
            return left;
        }
        if(left == null && right != null){
            return right;
        }
        return null;
    }


}
