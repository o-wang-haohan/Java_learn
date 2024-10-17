package com.demo1.LeedCode.BinaryTree;

import java.util.*;

public class leedcode515 {
    public List<Integer> largestValues(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> out_list = new ArrayList<>();
        List<Integer> res_list = new ArrayList<>();
        if(root == null){
            return res_list;
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
        for(int i=0;i<out_list.size();i++){
            int max = Collections.max(out_list.get(i));
            res_list.add(max);
        }
        return res_list;
    }
}
