package com.demo1.LeedCode.Greedy;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/10/26 下午2:19
 */
public class leedcode968 {
    int res = 0;
    public int minCameraCover(TreeNode root) {
        if(recursion(root)==0){
            res++;
        }
        return res;
    }
    //对于每个节点定义三个状态
    //0无覆盖 1有摄像头 2覆盖
    //后续遍历 返回根节点的状态
    //贪心思路：叶子节点的上一个节点要有摄像头，有摄像头的上上个节点再放置摄像头

    public int recursion(TreeNode root){
        if(root == null){
            return 2;
        }
        int left = recursion(root.left);
        int right = recursion(root.right);
        //三种情况
        //先检查俩孩子是否都已覆盖
        if(left==2 && right==2){
            return 0;
        }
        //再检查是否孩子里面出现了没覆盖的情况，就要先处理
        if(left==0 || right==0){
            res++;
            return 1;
        }
        //最后再检查孩子里面是否有摄像头；
        if(left==1 || right==1){
            return 2;
        }

        return -1;
    }
}
