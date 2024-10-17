package com.demo1.LeedCode.BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class leedcode112 {
    int sum = 0;
    List<Integer> list = new ArrayList<>();

    public boolean hasPathSum(TreeNode root,int targetSum){
        if(root==null){
            return false;
        }
        recursion(root,root.val);

        for(int i = 0;i<list.size();i++){
            if(list.get(i)==targetSum){
                return true;
            }
        }
        return false;
    }
    //当没有必要遍历所有的路径的时候，函数就可以有返回值
    public void recursion(TreeNode node,int sum){
        if(node.left==null && node.right == null){
            list.add(sum);
            return;
        }

        if(node.left!=null){
            sum+=node.left.val;
            recursion(node.left,sum);
            sum-=node.left.val;
        }

        if(node.right!=null){
            sum+=node.right.val;
            recursion(node.right,sum);
            sum-=node.right.val;
        }
    }
}
