package com.demo1.LeedCode.BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class leedcode513 {
    public int findBottomLeftValue(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> out_list = new ArrayList<>();
        queue.offer(root);
        while(queue.isEmpty()==false){
            int size = queue.size();
            List<Integer> in_list = new ArrayList<>();
            for(int i = 0; i<size;i++){
                TreeNode node = queue.poll();
                in_list.add(node.val);
                if(node.left!=null){
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }
            }
            out_list.add(in_list);
        }
        return out_list.get(out_list.size()-1).get(0);
    }
}
