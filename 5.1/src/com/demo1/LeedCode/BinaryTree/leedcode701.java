package LeedCode.BinaryTree;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/10/16 下午5:20
 */
public class leedcode701 {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode node = new TreeNode(val);
        if(root==null){
            return node;
        }
        TreeNode cur = root;
        while(cur!=null){
            if(val> cur.val){
                if(cur.right==null){
                    cur.right=node;
                    break;
                }else{
                    cur = cur.right;
                }
            }else if(val< cur.val){
                if(cur.left==null){
                    cur.left = node;
                    break;
                }else{
                    cur = cur.left;
                }
            }
        }
        return root;
    }
}
