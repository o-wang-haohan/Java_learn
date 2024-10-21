package LeedCode.BinaryTree;


public class leedcode617 {


    //首先需要确定需要返回节点，所以有返回值
    //其次确定终止条件，一棵树为空就返回另外一棵树
    //都不为空就对当前树赋值
    //再依次为左子树和右子树赋值
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2){
        if(root1==null){
            return root2;
        }
        if(root2==null){
            return root1;
        }

        TreeNode node = new TreeNode();
        node.val = root1.val+root2.val;

        node.left = mergeTrees(root1.left,root2.left);
        node.right = mergeTrees(root1.right, root2.right);

        return node;
    }


}
