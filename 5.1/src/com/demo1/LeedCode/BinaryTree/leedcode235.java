package LeedCode.BinaryTree;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/10/16 下午3:45
 */
public class leedcode235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        if(root == null) return null;

        if(root.val>p.val && root.val>q.val){
            return lowestCommonAncestor(root.left,p,q);
        }
        if(root.val<p.val && root.val<q.val){
            return lowestCommonAncestor(root.right,p,q);
        }

        return root;
    }
}
