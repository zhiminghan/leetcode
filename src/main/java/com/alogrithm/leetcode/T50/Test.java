package com.alogrithm.leetcode.T50;


import org.junit.Assert;

/**
 * @description:
 * @author: hanzhiming
 * @url:
 * @time: 2020/2/16 23:11
 */

public class Test {

    @org.junit.Test
    public void test(){
        Main main=new Main();
        Assert.assertEquals(0.0,main.myPow(2.00000,-2147483648),0);
    }
}
