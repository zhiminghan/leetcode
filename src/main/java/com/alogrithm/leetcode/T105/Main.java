package com.alogrithm.leetcode.T105;

import com.alogrithm.leetcode.common.TreeNode;

/**
 * @description: 105. 从前序与中序遍历序列构造二叉树
 * @author: hanzhiming
 * @url: https://leetcode-cn.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
 * @time: 2020/2/13 00:46
 */

public class Main {

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        return buildTree(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
    }


    public TreeNode buildTree(int[] preorder, int low1, int high1, int[] inorder, int low2, int high2) {

        if (low1 > high1||low2>high2) return null;

        TreeNode root = new TreeNode(preorder[low1]);

        int mid = low2;
        for (; mid <= high2 && inorder[mid] != root.val; mid++) ;


        root.left = buildTree(preorder, low1 + 1, high1, inorder, low2, mid - 1);

        root.right = buildTree(preorder, low1 + 1 + mid - low2, high1, inorder, mid + 1, high2);

        return root;
    }
}