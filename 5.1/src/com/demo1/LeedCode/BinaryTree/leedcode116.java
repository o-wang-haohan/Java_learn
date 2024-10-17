package com.demo1.LeedCode.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class leedcode116 {
    public Node connect(Node root){
        if(root==null){
            return null;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while(queue.isEmpty()==false){
            int size = queue.size();
            while(size!=0){
                Node node = queue.poll();
                if(size==1){
                    node.next = null;
                }else{
                    node.next = queue.peek();
                }
                size--;
                if(node.left!=null){
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }
            }
        }
        return root;
    }
}
