package com.alogrithm.leetcode.T114;

import com.alogrithm.leetcode.common.TreeNode;
import org.junit.Assert;
import org.junit.Before;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: hanzhiming
 * @url:
 * @time: 2020/2/9 20:29
 */

public class Test {

    TreeNode root;
    TreeNode root2;



    List<TreeNode> expectedResult1=new ArrayList<>();

    List<TreeNode> expectedResult2=new ArrayList<>();

    List<TreeNode> expectedResult3=new ArrayList<>();



    @Before
    public void init(){

        root=new TreeNode(1);
        TreeNode left=new TreeNode(2);
        TreeNode right=new TreeNode(5);
        TreeNode n1=new TreeNode(3);
        TreeNode n2=new TreeNode(4);
        TreeNode n3=new TreeNode(6);
        root.left=left;
        root.right=right;
        left.left=n1;
        left.right=n2;
        right.right=n3;

        expectedResult1.add(root);
        expectedResult1.add(left);
        expectedResult1.add(n1);
        expectedResult1.add(n2);
        expectedResult1.add(right);
        expectedResult1.add(n3);

        root2=new TreeNode(5);
        TreeNode n4=new TreeNode(7);
        root2.left=n4;
        expectedResult2.add(root2);
        expectedResult2.add(n4);
    }

    @org.junit.Test
    public void test1(){
        Main main=new Main();
        main.flatten(root);
        List<TreeNode> result=nodetoList(root);
        Assert.assertEquals(expectedResult1,result);
    }

    @org.junit.Test
    public void test2(){
        Main main=new Main();
        main.flatten(root2);
        List<TreeNode> result=nodetoList(root2);
        Assert.assertEquals(expectedResult2,result);
    }

    @org.junit.Test
    public void test3(){
        Main main=new Main();
        main.flatten(null);
        List<TreeNode> result=nodetoList(null);
        Assert.assertEquals(expectedResult3,result);
    }


    public List<TreeNode> nodetoList(TreeNode root){

        List<TreeNode> list=new ArrayList<>();
        while (root!=null){
            list.add(root);
            root=root.right;
        }
        return list;
    }

}
