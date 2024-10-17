package com.demo1.LeedCode.BinaryTree;

import java.util.*;

public class leedcode429 {
    public List<List<Integer>> levelOrder(NTreeNode root){
        Queue<NTreeNode> queue = new LinkedList<>();
        List<List<Integer>> out_list = new ArrayList<>();
        if(root == null){
            return out_list;
        }
        queue.offer(root);
        while(queue.isEmpty()==false){
            List<Integer> in_list = new ArrayList<>();
            int size = queue.size();
            while(size!=0){
                NTreeNode node = queue.poll();
                in_list.add(node.val);
                size--;
                for(int i=0;i<node.children.size();i++){
                    queue.add(node.children.get(i));
                }
            }
            out_list.add(in_list);

        }
        return out_list;
    }
}
