package com.alogrithm.leetcode.T199;

import com.alogrithm.leetcode.common.TreeNode;
import org.junit.Assert;
import org.junit.Before;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: hanzhiming
 * @url:
 * @time: 2020/2/9 22:12
 */

public class Test {


    TreeNode root;

    List<Integer> expectResult=new ArrayList<>();



    @Before
    public void init(){

        expectResult.add(1);

        expectResult.add(3);

        expectResult.add(4);

        root=new TreeNode(1);

        TreeNode left=new TreeNode(2);

        TreeNode right=new TreeNode(3);

        TreeNode n1=new TreeNode(5);

        TreeNode n2=new TreeNode(4);

        left.right=n1;
        right.right=n2;
        root.left=left;
        root.right=right;


    }

    @org.junit.Test
    public void test1(){
        Main main=new Main();
        Assert.assertEquals(expectResult,main.rightSideView(root));

    }

}
