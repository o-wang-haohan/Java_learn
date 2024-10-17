package com.demo1.LeedCode.BinaryTree;

public class leedcode513_1 {
    //定义全局变量，对于这种需要比较和更新的值
    int max_depth = 0;
    int res = 0;

    public int findBottomLeftValue (TreeNode root){

        resursion(root,1);
        return res;
    }

    public void resursion(TreeNode node,int depth){
        if(node.left==null && node.right==null){
            if(depth>max_depth){
                max_depth = depth;
                res = node.val;
            }
            return;
        }

        if(node.left!=null){
            depth++;
            resursion(node.left,depth);
            depth--;
        }
        if(node.right!=null){
            depth++;
            resursion(node.right,depth);
            depth--;
        }
    }
}

