package com.alogrithm.leetcode.T98;

import com.alogrithm.leetcode.common.TreeNode;
import org.junit.Assert;
import org.junit.Before;

/**
 * @description:
 * @author: hanzhiming
 * @url:
 * @time: 2020/2/12 19:50
 */

public class Test {


    TreeNode root1;

    TreeNode root2;

    @Before
    public void init(){




        root1=new TreeNode(2);

        TreeNode l1=new TreeNode(1);

        TreeNode r1=new TreeNode(3);

        root1.left=l1;

        root1.right=r1;

        root2=new TreeNode(5);

        TreeNode l2=new TreeNode(1);

        TreeNode r2=new TreeNode(4);

        TreeNode n1=new TreeNode(3);

        TreeNode n2=new TreeNode(6);

        root2.left=l2;

        root2.right=r2;

        r2.left=n1;

        r2.right=n2;

    }

    @org.junit.Test
    public void test1(){
        Main main=new Main();
        Assert.assertEquals(true,main.isValidBST(root1));
        Assert.assertEquals(false,main.isValidBST(root2));


    }

}
