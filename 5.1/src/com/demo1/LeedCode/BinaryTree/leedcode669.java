package LeedCode.BinaryTree;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/10/17 下午1:45
 */
public class leedcode669 {

    public TreeNode trimBST(TreeNode root, int low, int high){
        if(root == null){
            return null;
        }
        if(root.val<low){
            //当前节点不满足，但是其右子树可能满足
            //所以需要将右子树处理后的子树进行返回
            TreeNode right = trimBST(root.right,low,high);
            return right;
        }
        if(root.val>high){
            TreeNode left = trimBST(root.left,low,high);
            return left;
        }

        //根节点的左子树需要接住处理过后的左子树
        root.left = trimBST(root.left,low,high);
        root.right = trimBST(root.right,low,high);

        //最终返回根节点
        return root;
        }
}

