package com.demo1.LeedCode.BinaryTree;

public class leedcode100 {
    public boolean isSameTree(TreeNode left, TreeNode right){
        if(left==null&&right!=null){
            return false;
        }else if(left!=null && right ==null){
            return false;
        }else if(left==null && right==null){
            return true;
        }
        else if(left.val!=right.val){
            return false;
        }

        boolean out = isSameTree(left.left,right.left);
        boolean in = isSameTree(left.right, right.right);

        return out && in;
    }
}
