package com.alogrithm.leetcode.T783;

import com.alogrithm.leetcode.common.TreeNode;
import org.junit.Assert;
import org.junit.Before;

/**
 * @description:
 * @author: hanzhiming
 * @url:
 * @time: 2020/2/17 18:43
 */

public class Test {


    TreeNode root;

    TreeNode root2;


    @Before
    public void init() {

        root = new TreeNode(4);
        TreeNode l = new TreeNode(2);
        TreeNode r = new TreeNode(6);
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(3);
        root.left=l;
        root.right=r;
        l.left=n1;
        l.right=n2;


        root2 = new TreeNode(27);
        TreeNode k1 = new TreeNode(34);
        TreeNode k2= new TreeNode(58);
        TreeNode k3 = new TreeNode(50);
        TreeNode k4 = new TreeNode(44);
        root2.right=k1;
        k1.right=k2;
        k2.left=k3;
        k3.left=k4;

    }

    @org.junit.Test
    public void test(){

        Main main=new Main();
        Assert.assertEquals(6,main.minDiffInBST(root2));
    }


}
