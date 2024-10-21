package LeedCode.BinaryTree;

/**
 * @Author: whh
 * @Description:
 * 当前节点如果处理的是左子树，返回值就是处理过后的左子树，只需要让当前根节点的左子树接住即可。
 * 删除节点的逻辑是让根节点直接跳过该节点，指向该节点的左孩子或者右孩子。
 * @Date: 2024/10/17 上午11:03
 */
public class leedcode {
    public TreeNode deleteNode(TreeNode root, int key){
        if(root == null){
            return null;
        }
        if(root.val == key){
            if(root.left==null && root.right==null){
                return null;
            }else if(root.left==null && root.right!= null){
                return root.right;
            }else if(root.left!=null && root.right==null){
                return root.left;
            }else{
                TreeNode node = root.right.left;
                root.right.left=root.left;
                TreeNode tmp_node = root.left;
                while (tmp_node.right!=null){
                    tmp_node = tmp_node.right;
                }
                tmp_node.right = node;
                return root.right;
            }
        }
        if(key<root.val){
            root.left = deleteNode(root.left,key);
        }
        if(key>root.val){
            root.right = deleteNode(root.right,key);
        }
        return root;
    }

}
