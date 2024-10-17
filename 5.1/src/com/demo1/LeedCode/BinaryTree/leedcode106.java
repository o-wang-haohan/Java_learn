package com.demo1.LeedCode.BinaryTree;

import java.util.Arrays;

public class leedcode106 {

    public TreeNode buildTree(int[] inorder, int[] postorder){
        if(postorder.length==0){
            return null;
        }
        if(postorder.length==1){
            return new TreeNode(postorder[0]);
        }

        int root_val = postorder[postorder.length-1];
        TreeNode root_node = new TreeNode(root_val);
        int [] left_order = null;
        int [] right_order = null;
        int [] left_post = null;
        int [] right_post = null;
        for(int i = 0;i<inorder.length;i++){
            if(inorder[i]==root_val){
                 left_order = Arrays.copyOfRange(inorder,0,i);
                 right_order= Arrays.copyOfRange(inorder,i+1,inorder.length);
                 left_post = Arrays.copyOfRange(postorder,0,left_order.length);
                 right_post = Arrays.copyOfRange(postorder,left_order.length,postorder.length-1);
            }
        }

        TreeNode left_node =buildTree(left_order,left_post);
        TreeNode right_node = buildTree(right_order,right_post);

        root_node.left = left_node;
        root_node.right = right_node;

        return root_node;
    }
}
