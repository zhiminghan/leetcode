package com.alogrithm.leetcode.T106;

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
        int []inorder = {9,3,15,20,7};
        int []postorder = {9,15,7,20,3};

        TreeNode root=main.buildTree(inorder,postorder);
        inOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();

    }

    public void postOrder(TreeNode n){
        if (n==null) return;


        if(n.left!=null) postOrder(n.left);

        if(n.right!=null) postOrder(n.right);

        System.out.print(n.val+" ");
    }

    public void inOrder(TreeNode n){

        if (n==null) return;

        if(n.left!=null) inOrder(n.left);

        System.out.print(n.val+" ");

        if(n.right!=null) inOrder(n.right);

    }


}
