package LeedCode.BinaryTree;

import java.util.Arrays;

/**
 * @Author: whh
 * @Description: TODO
 * @Date: 2024/10/17 下午2:59
 */
public class leedcode108 {
    public TreeNode sortedArrayToBST(int[] nums){
        if(nums.length==0){
            return null;
        }
        if(nums.length==1){
            return new TreeNode(nums[0]);
        }
        TreeNode root = new TreeNode(nums[nums.length/2]);
        int[] left_nums = Arrays.copyOfRange(nums,0,nums.length/2);
        int[] right_nums = Arrays.copyOfRange(nums,nums.length/2+1,nums.length);
        root.left = sortedArrayToBST(left_nums);
        root.right = sortedArrayToBST(right_nums);
        return root;
    }
}
