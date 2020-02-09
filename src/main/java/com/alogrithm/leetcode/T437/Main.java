package com.alogrithm.leetcode.T437;

import com.alogrithm.leetcode.common.TreeNode;

/**
 * @description: 437. 路径总和 III
 * @author: hanzhiming
 * @url: https://leetcode-cn.com/problems/path-sum-iii/
 * @time: 2020/2/9 16:09
 */

public class Main {

    int count=0;

    public int pathSum(TreeNode root, int target) {
        if(root==null) return 0;

        preOrder(root,0,target);
        if(root.left!=null) pathSum(root.left,target);
        if(root.right!=null) pathSum(root.right,target);
        return count;
    }

    public void preOrder(TreeNode root, int sum, int target){
        sum+= root.val;
        if (sum == target) {
            count++;
        }

        if(root.left==null&&root.right==null) {
            return;
        }

        if(root.left!=null){
            preOrder(root.left,sum,target);
        }

        if(root.right!=null){
            preOrder(root.right,sum,target);
        }

    }


}
