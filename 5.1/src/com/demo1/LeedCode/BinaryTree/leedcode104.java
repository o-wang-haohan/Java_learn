package com.demo1.LeedCode.BinaryTree;

import java.util.*;

public class leedcode104 {
    public int maxDepth(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null){
            return 0;
        }
        queue.offer(root);
        int len = 0;
        while(queue.isEmpty()==false){
            int size = queue.size();
            while(size!=0){
                TreeNode node = queue.poll();
                size--;
                if(node.left!=null){
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }
                if(node.left==null && node.right==null){
                    return len+1;
                }
            }
            len++;

        }
        return len;
    }
}
