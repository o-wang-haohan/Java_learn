package com.demo1.LeedCode.BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class leedcode257 {
    public List<String> binaryTreePaths(TreeNode root){
        List<String> str = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        if(root==null){
            return str;
        }
        res(root,path,str);
        return str;
    }
    //如果需要的东西比较多，就需要再次起一个函数将这些参数进行传递来写。
    public void res(TreeNode node, List<Integer> path, List<String> strings){
        path.add(node.val);
        //递归终止条件
        if(node.left==null && node.right == null){
            StringBuilder sb = new StringBuilder();
            for(int i = 0;i<path.size()-1;i++){
                sb.append(path.get(i));
                sb.append("->");
            }
            sb.append(path.get(path.size()-1));
            strings.add(sb.toString());
            return;
        }

        if(node.left!=null){
            //递归+回溯
            res(node.left,path,strings);
            //向下递归了一次，所以回溯时只需要向上一级进行回溯即可
            path.remove(path.size()-1);
        }
        if(node.right!=null){
            res(node.right,path,strings);
            path.remove(path.size()-1);
        }
    }
}
