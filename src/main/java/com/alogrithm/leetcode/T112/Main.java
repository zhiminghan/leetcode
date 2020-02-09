package com.alogrithm.leetcode.T112;

import com.alogrithm.leetcode.common.TreeNode;

/**
 * @description: 112. 路径总和
 * @author: hanzhiming
 * @url: https://leetcode-cn.com/problems/path-sum/
 * @time: 2020/2/9 16:55
 */

public class Main {

    public boolean hasPathSum(TreeNode root, int target) {

        if(root==null) return false;
        return preOrder(root,0,target);

    }

    public boolean preOrder(TreeNode root, int sum, int target){

        if(root==null) return false;
        sum+= root.val;
        if(root.left==null&&root.right==null) {
            if (sum == target) {
                return true;
            }
        }
        return preOrder(root.left,sum,target)||preOrder(root.right,sum,target);
    }

}
