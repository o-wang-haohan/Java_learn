package com.demo1.LeedCode.BinaryTree;

public class leedcode106_1 {

    public TreeNode buildTree(int[] inorder, int[] postorder){
        int inorderstart = 0;
        int inorderend = inorder.length-1;
        int postorderstart = 0;
        int postorderend = postorder.length -1;
        return recursion(inorder,inorderstart,inorderend,postorder,postorderstart,postorderend);
    }

    public TreeNode recursion(int [] inorder, int inorderstart, int inorderend, int[] postorder, int postorderstart, int postorderend){
        if(postorder.length==0){
            return null;
        }
        int root_val = postorder[postorderend];
        TreeNode root = new TreeNode(root_val);
        if(postorderstart==postorderend){
            return root;
        }
        int index = 0;
        //区间左闭右闭
        for(int i = inorderstart;i<=inorderend;i++){
            if(root_val==inorder[i]){
                index=i;
            }
        }
        int left_inorderstart = inorderstart;
        int left_inorderend = index-1;
        int left_postorderstart = postorderstart;
        int left_postorderend = postorderstart+left_inorderend-left_inorderstart;
        if(left_inorderend<left_inorderstart || left_postorderend<left_postorderstart){
            root.left=null;
        }else {
            root.left = recursion(inorder, left_inorderstart, left_inorderend, postorder, left_postorderstart, left_postorderend);
        }
        int right_inorderstart = index+1;
        int right_inorderend = inorderend;
        int right_postorderstart = left_postorderend +1;
        int right_postorderend = right_postorderstart+(right_inorderend-right_inorderstart);
        if(right_inorderend<right_inorderstart || right_postorderend<right_postorderstart){
            root.right = null;
        }else {
            root.right = recursion(inorder, right_inorderstart, right_inorderend, postorder, right_postorderstart, right_postorderend);
        }
        return root;
    }
}
