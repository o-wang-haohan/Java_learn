package LeedCode.BinaryTree;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/10/15 下午4:49
 */
public class leedcode700 {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null){
            return root;
        }
        if(root.val==val){
            return root;
        }
        TreeNode left_node = null;
        TreeNode right_node = null;
        if(root.left!=null){
            left_node= searchBST(root.left,val);
        }
        if(root.right!=null){
            right_node= searchBST(root.right,val);
        }
        if(left_node!=null){
            return left_node;
        }
        if(right_node!= null){
            return right_node;
        }

        return null;

    }


}
