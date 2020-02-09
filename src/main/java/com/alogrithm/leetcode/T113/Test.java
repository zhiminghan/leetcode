package com.alogrithm.leetcode.T113;

import com.alogrithm.leetcode.common.TreeNode;
import org.junit.Assert;
import org.junit.Before;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: hanzhiming
 * @url:
 * @time: 2020/2/8 22:30
 */

public class Test {

    TreeNode root;

    TreeNode root2;

    TreeNode root3;


    List<List<Integer>> expectResult1=new ArrayList<>();

    List<List<Integer>> expectResult2=new ArrayList<>();

    List<List<Integer>> expectResult3=new ArrayList<>();



    @Before
    public void before(){

        List<Integer> result=new ArrayList<>();
        result.add(5);

        List<Integer> result2=new ArrayList<>();
        result2.add(5);
        result2.add(4);
        result2.add(11);
        result2.add(2);

        List<Integer> result3=new ArrayList<>();
        result3.add(5);
        result3.add(8);
        result3.add(4);
        result3.add(5);

        expectResult1.add(result2);
        expectResult1.add(result3);

        expectResult2.add(result);



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
        Assert.assertEquals(expectResult1,main.pathSum(root,22));

    }

    @org.junit.Test
    public void test2(){
        Main main=new Main();
        Assert.assertEquals(expectResult2,main.pathSum(root2,5));

    }

    @org.junit.Test
    public void test3(){
        Main main=new Main();
        Assert.assertEquals(expectResult3,main.pathSum(root3,1));

    }


}
