package com.demo1.LeedCode.BinaryTree;


public class leedcode101_1 {
    public boolean isSymmetric(TreeNode root){
        return compare(root.left,root.right);
    }

    public boolean compare(TreeNode left, TreeNode right){
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

        boolean out = compare(left.left,right.right);
        boolean in = compare(left.right, right.left);

        return out && in;
    }
}
