package com.alogrithm.leetcode.T236;

import com.alogrithm.leetcode.common.TreeNode;
import org.junit.Assert;
import org.junit.Before;

/**
 * @description:
 * @author: hanzhiming
 * @url:
 * @time: 2020/2/9 19:39
 */

public class Test {

    TreeNode root;

    TreeNode p1;
    TreeNode q1;
    TreeNode exptectResult1;

    TreeNode p2;
    TreeNode q2;
    TreeNode exptectResult2;


    @Before
    public void init(){

        root=new TreeNode(3);
        TreeNode left=new TreeNode(5);
        TreeNode right=new TreeNode(1);
        TreeNode n1=new TreeNode(6);
        TreeNode n2=new TreeNode(2);
        TreeNode n3=new TreeNode(0);
        TreeNode n4=new TreeNode(8);
        TreeNode n5=new TreeNode(7);
        TreeNode n6=new TreeNode(4);
        root.left=left;
        root.right=right;
        left.left=n1;
        left.right=n2;
        right.left=n3;
        right.right=n4;
        n2.left=n5;
        n2.right=n6;

        p1=left;
        q1=right;
        exptectResult1=root;
        p2=left;
        q2=n6;
        exptectResult2=p2;
    }

    @org.junit.Test
    public void test1(){
        Main main=new Main();
        Assert.assertEquals(exptectResult1,main.lowestCommonAncestor(root,p1,q1));

    }

    @org.junit.Test
    public void test2(){
        Main main=new Main();
        Assert.assertEquals(exptectResult2,main.lowestCommonAncestor(root,p2,q2));

    }

    @org.junit.Test
    public void test3(){
        Main main=new Main();
        Assert.assertEquals(null,main.lowestCommonAncestor(null,p2,q2));

    }

}
