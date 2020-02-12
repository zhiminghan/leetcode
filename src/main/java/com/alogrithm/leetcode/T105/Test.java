package com.alogrithm.leetcode.T105;

import com.alogrithm.leetcode.common.TreeNode;

/**
 * @description:
 * @author: hanzhiming
 * @url:
 * @time: 2020/2/13 01:30
 */

public class Test {

    @org.junit.Test
    public void test1(){
        Main main=new Main();
        int []preorder = {3,9,20,15,7};
        int []inorder = {9,3,15,20,7};

        TreeNode root=main.buildTree(preorder,inorder);
        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();

    }

    public void preOrder(TreeNode n){
        if (n==null) return;

        System.out.print(n.val+" ");

        if(n.left!=null) preOrder(n.left);

        if(n.right!=null) preOrder(n.right);

    }

    public void inOrder(TreeNode n){

        if (n==null) return;

        if(n.left!=null) preOrder(n.left);

        System.out.print(n.val+" ");

        if(n.right!=null) preOrder(n.right);

    }


}
