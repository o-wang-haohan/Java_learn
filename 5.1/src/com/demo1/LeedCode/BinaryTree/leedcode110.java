package com.demo1.LeedCode.BinaryTree;

public class leedcode110 {
    public boolean isBalanced(TreeNode root){
        if(root == null){
            return true;
        }

        boolean l = isBalanced(root.left);
        boolean r = isBalanced(root.right);

        int left = lengthTree(root.left);
        int right = lengthTree(root.right);

        if(Math.abs(left-right)>1){
            return false;
        }else{
            return l && r;
        }

    }
    public int lengthTree(TreeNode node){
        if(node == null){
            return 0;
        }

        int left = lengthTree(node.left);
        int right = lengthTree(node.right);

        return Math.max(left,right)+1;
    }
}
