package com.demo1.LeedCode.BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class leedcode637 {
    public List<Double> averageOfLevels(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> out_list = new ArrayList<>();
        List<Double> res_list = new ArrayList<>();
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
        for(int i = 0; i< out_list.size(); i++){
            List<Integer> list_tmp = out_list.get(i);
            long sum = 0;
            for(int j = 0; j<list_tmp.size();j++){
                sum+=list_tmp.get(j);
            }
            res_list.add((double)sum/list_tmp.size());
        }
        return res_list;
    }
}
