package com.alogrithm.leetcode.T367;

import org.junit.Assert;

/**
 * @description:
 * @author: hanzhiming
 * @url:
 * @time: 2020/2/18 01:14
 */

public class Test {

    @org.junit.Test
    public void test(){
        Main main=new Main();
        Assert.assertEquals(true,main.isPerfectSquare(16));
        Assert.assertEquals(true,main.isPerfectSquare(808201));

    }


}
