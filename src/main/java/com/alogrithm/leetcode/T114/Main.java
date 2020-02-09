package com.alogrithm.leetcode.T114;

import com.alogrithm.leetcode.common.TreeNode;

/**
 * @description: 114. 二叉树展开为链表
 * @author: hanzhiming
 * @url: https://leetcode-cn.com/problems/flatten-binary-tree-to-linked-list/
 * @time: 2020/2/9 20:23
 */

public class Main {

    public void flatten(TreeNode root) {

        if(root==null) return;
        TreeNode left=root.left;
        TreeNode right=root.right;

        if(left==null&&right==null) return;

        if((left!=null)&&(left.left!=null||left.right!=null)) flatten(left);

        if (left!=null) {
            root.left=null;
            root.right=left;
        }

        TreeNode last=null;
        while(left!=null){
            last=left;
            left=left.right;
        }

        if((right!=null)&&(right.left!=null||right.right!=null)) flatten(right);

        if (right!=null&&last!=null){
            last.right=right;
        }
    }

}
