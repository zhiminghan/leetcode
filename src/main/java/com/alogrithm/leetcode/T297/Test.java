package com.alogrithm.leetcode.T297;

import com.alogrithm.leetcode.common.TreeNode;
import org.junit.Before;

/**
 * @description:
 * @author: hanzhiming
 * @url:
 * @time: 2020/2/13 19:34
 */

public class Test {



    TreeNode root;


    @Before
    public void init(){




        root=new TreeNode(1);

        TreeNode l=new TreeNode(2);

        TreeNode r=new TreeNode(3);

        root.left=l;

        root.right=r;

        TreeNode n1=new TreeNode(4);

        TreeNode n2=new TreeNode(5);

        r.left=n1;

        r.right=n2;
    }


    @org.junit.Test
    public void test1(){
        Main main=new Main();
        String data=main.serialize(null);
        System.out.println(data);
        TreeNode n=main.deserialize(data);

    }



}
