package com.demo1.LeedCode.BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class leedcode102 {

    public List<List<Integer>> levelOrder(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> out_list = new ArrayList<>();
        if(root == null){
            return out_list;
        }
        queue.offer(root);
        while(queue.isEmpty()==false){
            List<Integer> in_list = new ArrayList<>();
            List<TreeNode> node_list = new ArrayList<>();

            while(queue.isEmpty()==false){
                TreeNode node = queue.poll();
                node_list.add(node);
                in_list.add(node.val);
            }
            out_list.add(in_list);
            for(int i = 0;i<node_list.size();i++){
                TreeNode cur = node_list.get(i);
                if(cur.left!=null){
                    queue.offer(cur.left);
                }
                if(cur.right!=null){
                    queue.offer(cur.right);
                }
            }
        }
        return out_list;
    }
}
