package com.demo1.LeedCode.BinaryTree;

public class leedcode404 {
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null || (root.left==null&&root.right==null)){
            return 0;
        }
        int sum = 0;
        int flag = 0;
        return recursion(root,sum,flag);
    }

    public int recursion(TreeNode node, int sum, int flag){
        int left_sum = 0;
        if(node.left!=null){
            left_sum = recursion(node.left,sum,1);
        }
        int right_sum = 0;
        if(node.right!=null){
            right_sum = recursion(node.right,sum,0);
        }

        if(node.left==null && node.right==null){
            if(flag==1){
                sum+=node.val;
            }
            return sum;
        }

        return left_sum+right_sum;
    }
}
