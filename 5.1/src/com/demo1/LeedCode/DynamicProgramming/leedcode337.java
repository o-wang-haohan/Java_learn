package com.demo1.LeedCode.DynamicProgramming;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/10/28 下午8:15
 */
public class leedcode337 {
    public int rob(TreeNode root) {
        //树形dp的题目
        //遍历数组并且进行状态转移
        //只记录偷当前节点的最大值和不偷当前节点的最大值；
        int[] res = recursion(root);
        return Math.max(res[0],res[1]);
    }
    public int[] recursion(TreeNode root){
        if(root==null){
            return new int[2];
        }
        //后序遍历
        int[] leftdp = recursion(root.left);
        int[] rightdp = recursion(root.right);

        int[] dp = new int[2];
        //dp0表示不偷当前节点,最大值就是左孩子偷和不偷的最大值加上右孩子偷和不偷的最大值
        dp[0] = Math.max(leftdp[0],leftdp[1]) + Math.max(rightdp[0], rightdp[1]);
        //dp1表示偷当前节点，那么最大值就是当前节点加上左右不偷的值；
        dp[1] = root.val+leftdp[0]+rightdp[0];

        return dp;
    }
}
