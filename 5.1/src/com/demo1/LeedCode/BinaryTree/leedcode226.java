package com.demo1.LeedCode.BinaryTree;

public class leedcode226 {
    public TreeNode invertTree(TreeNode root){
        if(root==null){
            return root;
        }
        TreeNode node = root;
        TreeNode tmp = node.left;
        node.left = node.right;
        node.right = tmp;

        if(node.left!=null){
            TreeNode left_node = node.left;
            invertTree(left_node);
        }

        if(node.right!=null){
            TreeNode right_node = node.right;
            invertTree(right_node);
        }


        return root;

    }
}
