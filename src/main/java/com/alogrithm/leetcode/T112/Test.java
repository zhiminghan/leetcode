package com.alogrithm.leetcode.T112;

import com.alogrithm.leetcode.common.TreeNode;
import org.junit.Assert;
import org.junit.Before;

/**
 * @description:
 * @author: hanzhiming
 * @url:
 * @time: 2020/2/9 16:57
 */

public class Test {

    TreeNode root;

    TreeNode root2;

    TreeNode root3;



    @Before
    public void before(){




        root=new TreeNode(5);

        root2=new TreeNode(5);


        root3=new TreeNode(1);


        TreeNode left=new TreeNode(4);

        TreeNode right=new TreeNode(8);

        TreeNode n1=new TreeNode(11);

        TreeNode n2=new TreeNode(7);

        TreeNode n3=new TreeNode(2);

        TreeNode n4=new TreeNode(13);

        TreeNode n5=new TreeNode(4);

        TreeNode n6=new TreeNode(5);

        TreeNode n7=new TreeNode(1);

        TreeNode n8=new TreeNode(2);


        left.left=n1;
        n1.left=n2;
        n1.right=n3;

        right.left=n4;
        right.right=n5;
        n5.left=n6;
        n5.right=n7;
        root.left=left;
        root.right=right;

        root3.left=n8;

    }

    @org.junit.Test
    public void test1(){
        Main main=new Main();
        Assert.assertEquals(true,main.hasPathSum(root,22));

    }

    @org.junit.Test
    public void test2(){
        Main main=new Main();
        Assert.assertEquals(true,main.hasPathSum(root2,5));

    }

    @org.junit.Test
    public void test3(){
        Main main=new Main();
        Assert.assertEquals(false,main.hasPathSum(root,13));

    }
}
