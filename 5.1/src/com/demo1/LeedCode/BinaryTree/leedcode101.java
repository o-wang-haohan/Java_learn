package com.demo1.LeedCode.BinaryTree;

import java.util.*;

public class leedcode101 {
    public boolean isSymmetric(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> out_list = new ArrayList<>();
        List<Integer> res_list = new ArrayList<>();
        if(root == null){
            return true;
        }
        queue.offer(root);
        while(queue.isEmpty()==false){
            List<Integer> in_list = new ArrayList<>();
            int size = queue.size();
            while(size!=0){
                TreeNode node = queue.poll();
                if(node==null){
                    in_list.add(null);
                }else {
                    in_list.add(node.val);
                }
                size--;
                if(node!=null){
                    queue.offer(node.left);
                    queue.offer(node.right);
                }
            }
            out_list.add(in_list);
        }
        for(int i=0;i<out_list.size();i++){
            List<Integer> list = out_list.get(i);
            for(int j = 0,k=list.size()-1; j<k;j++,k--){
                if(list.get(j)!=list.get(k)){
                    return false;
                }
            }
        }
        return true;
    }
}
