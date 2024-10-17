package com.demo1.LeedCode.BinaryTree;

public class leedcode572 {
    public boolean isSubtree(TreeNode root, TreeNode subRoot){
        if(root==null && subRoot==null){
            return true;
        }
        if(root == null || subRoot == null){
            return false;
        }

        boolean r = compare(root,subRoot);
        boolean left = isSubtree(root.left, subRoot);
        boolean right = isSubtree(root.right, subRoot);

        return r||left||right;


    }

    public boolean compare(TreeNode root,TreeNode subRoot){
        if(root==null && subRoot!=null){
            return false;
        }else if(root!=null && subRoot==null){
            return false;
        }else if(root==null && subRoot==null){
            return true;
        }else if(root.val!=subRoot.val){
            return false;
        }

        boolean left = compare(root.left,subRoot.left);
        boolean right = compare(root.right, subRoot.right);


        return left && right;
    }
}
