package com.demo1.LeedCode.BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class leedcode113 {
    List<List<Integer>> out_list = new ArrayList<>();
    List<Integer> in_list = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum){
        if(root==null){
            return out_list;
        }
        in_list.add(root.val);
        targetSum-=root.val;
        recursion(root,targetSum,in_list);
        return out_list;
    }
    public void recursion(TreeNode node, int targetSum, List<Integer> in_list){
        if(node.left == null && node.right == null){
            if(targetSum == 0){
                //in_list是List结构，属于引用数据类型，在进行数据保存的时候，需要格外注意
                //一定要注意先复制一份这个引用数据，再将这个数据添加进去
                //否则加入的都是同一个引用数据类型的地址
                out_list.add(new ArrayList<>(in_list));
            }
            return;
        }
        if(node.left!=null){
            in_list.add(node.left.val);
            targetSum-=node.left.val;
            recursion(node.left,targetSum,in_list);
            targetSum+=node.left.val;
            in_list.remove(in_list.size()-1);
        }

        if(node.right!=null){
            in_list.add(node.right.val);
            targetSum-=node.right.val;
            recursion(node.right,targetSum,in_list);
            targetSum+=node.right.val;
            in_list.remove(in_list.size()-1);
        }

    }
}
