package com.alogrithm.leetcode.T106;

import com.alogrithm.leetcode.common.TreeNode;

/**
 * @description: 106. 从中序与后序遍历序列构造二叉树
 * @author: hanzhiming
 * @url: https://leetcode-cn.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/
 * @time: 2020/2/13 01:40
 */

public class Main {

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return buildTree(inorder,0,inorder.length-1,postorder,0,postorder.length-1);
    }


    public TreeNode buildTree(int[] inorder, int low1, int high1, int[] postorder, int low2, int high2) {

        if(low1>high1||low2>high2) return null;

        TreeNode root=new TreeNode(postorder[high2]);
        int mid=low1;
        while(mid<=high1&&inorder[mid]!=root.val) mid++;
        root.left=buildTree(inorder,low1,mid-1,postorder,low2,low2+mid-low1-1);
        root.right=buildTree(inorder,mid+1,high1,postorder,low2+mid-low1,high2-1);
        return root;
    }

}
