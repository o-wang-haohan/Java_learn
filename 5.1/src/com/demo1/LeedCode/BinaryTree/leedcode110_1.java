package com.demo1.LeedCode.BinaryTree;

public class leedcode110_1 {
    public boolean isBalanced(TreeNode root){
        if(root == null){
            return true;
        }
        if(lengthTree(root)!=-1){
            return true;
        }else{
            return false;
        }

    }
    public int lengthTree(TreeNode node){
        if(node == null){
            return 0;
        }

        int left = lengthTree(node.left);
        if(left==-1) return -1;
        int right = lengthTree(node.right);
        if(right==-1) return -1;

        if(Math.abs(left-right)>1){
            return -1;
        }else{
            return Math.max(left,right)+1;
        }

    }
}
