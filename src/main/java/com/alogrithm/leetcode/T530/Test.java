package com.alogrithm.leetcode.T530;

import com.alogrithm.leetcode.common.TreeNode;
import org.junit.Assert;
import org.junit.Before;

/**
 * @description: 530. 二叉搜索树的最小绝对差
 * @author: hanzhiming
 * @url: https://leetcode-cn.com/problems/minimum-absolute-difference-in-bst/
 * @time: 2020/2/12 19:57
 */

public class Test {

    TreeNode root;

    @Before
    public void init() {

        root = new TreeNode(1);
        TreeNode r = new TreeNode(3);
        TreeNode n = new TreeNode(2);
        root.right=r;
        r.left=n;
    }

    @org.junit.Test
    public void test(){
        Main main=new Main();
        Assert.assertEquals(1,main.getMinimumDifference(root));
    }
}
