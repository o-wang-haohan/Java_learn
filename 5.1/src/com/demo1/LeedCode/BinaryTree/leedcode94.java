package com.demo1.LeedCode.BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class leedcode94 {

    public List<Integer> inorderTraversal(TreeNode root){
        List<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }

        Stack<TreeNode> st = new Stack<>();
        TreeNode node = root;
        while(node != null || st.isEmpty()==false){
            if(node != null){
                st.push(node);
                node = node.left;
            }else {
                node = st.pop();
                list.add(node.val);
                node = node.right;
            }
        }
        return list;
    }
}
