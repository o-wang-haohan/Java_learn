package LeedCode.BinaryTree;

import com.demo1.LeedCode.BinaryTree.TreeNode;

/**
 * @Author: whh
 * @Description: 通过控制数组的下标实现，就避免了重新创建数组
 * @Date: 2024/10/17 下午3:58
 */
public class leedcode108_1 {
    public TreeNode sortedArrayToBST(int[] nums){
        return BST_index(nums,0,nums.length-1);
    }

    public TreeNode BST_index(int[] nums,int start,int end){
        if(start>end){
            return null;
        }
        //区间选择左闭右闭
        int mid = (start+end)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = BST_index(nums,start,mid-1);
        root.right = BST_index(nums,mid+1,end);
        return root;
    }
}
