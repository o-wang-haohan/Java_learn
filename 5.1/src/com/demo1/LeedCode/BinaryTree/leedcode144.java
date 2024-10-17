package com.demo1.LeedCode.BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class leedcode144 {
    public static void main (String [] args){

    }

    public List<Integer> preorderTraversal(TreeNode root){
        List<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        Stack<TreeNode> st = new Stack<>();
        st.push(root);

        while(st.isEmpty()==false){
            TreeNode node = st.pop();
            list.add(node.val);
            if(node.right !=null){
                st.push(node.right);
            }
            if(node.left != null){
                st.push(node.left);
            }
        }
        return list;


    }

}
