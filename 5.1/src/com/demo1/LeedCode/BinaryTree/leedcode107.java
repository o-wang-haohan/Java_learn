package com.demo1.LeedCode.BinaryTree;

import java.util.*;

public class leedcode107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> out_list = new ArrayList<>();
        if(root == null){
            return out_list;
        }
        queue.offer(root);
        while(queue.isEmpty()==false){
            List<Integer> in_list = new ArrayList<>();
            int size = queue.size();
            while(size!=0){
                TreeNode node = queue.poll();
                in_list.add(node.val);
                size--;
                if(node.left!=null){
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }
            }
            out_list.add(in_list);

        }
        Collections.reverse(out_list);
        return out_list;
    }
}
