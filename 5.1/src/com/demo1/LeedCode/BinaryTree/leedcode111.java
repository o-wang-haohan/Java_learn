package com.demo1.LeedCode.BinaryTree;

public class leedcode111 {
    public int minDepth(TreeNode root){
        if(root == null){
            return 0;
        }

        int left = minDepth(root.left);
        int right = minDepth(root.right);
        if(root.left==null && root.right==null){
            return 1;
        }else if(root.left==null){
            return right+1;
        }else if(root.right==null){
            return left+1;
        }

        return left<right?left+1:right+1;
    }
}
