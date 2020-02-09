package com.alogrithm.leetcode.T437;

import com.alogrithm.leetcode.common.TreeNode;
import org.junit.Assert;
import org.junit.Before;

/**
 * @description:
 * @author: hanzhiming
 * @url:
 * @time: 2020/2/9 16:17
 */

public class Test {

    TreeNode root;

    TreeNode root2;

    TreeNode root3;


    @Before
    public void before(){


        root=new TreeNode(10);

        root2=new TreeNode(5);

        root3=new TreeNode(1);


        TreeNode left=new TreeNode(5);

        TreeNode right=new TreeNode(-3);

        TreeNode n1=new TreeNode(3);

        TreeNode n2=new TreeNode(3);

        TreeNode n3=new TreeNode(-2);

        TreeNode n4=new TreeNode(2);

        TreeNode n5=new TreeNode(1);

        TreeNode n6=new TreeNode(11);

        TreeNode n7=new TreeNode(0);
//
//        TreeNode n8=new TreeNode(2);


        left.left=n1;
        n1.left=n2;
        n1.right=n3;
        left.right=n4;
        n4.right=n5;
        right.right=n6;
        root.left=left;
        root.right=right;

        root2.left=n7;

    }

    @org.junit.Test
    public void test1(){
       Main main=new Main();
        Assert.assertEquals(3,main.pathSum(root,8));

    }

    @org.junit.Test
    public void test2(){
        Main main=new Main();
        Assert.assertEquals(2,main.pathSum(root2,5));

    }

    @org.junit.Test
    public void test3(){
        Main main=new Main();
        Assert.assertEquals(1,main.pathSum(root3,1));

    }


    public void preOrder(TreeNode n){

        if(n!=null) System.out.print(n.val+" ");

         if(n.left!=null) preOrder(n.left);

         if(n.right!=null) preOrder(n.right);

    }

}
