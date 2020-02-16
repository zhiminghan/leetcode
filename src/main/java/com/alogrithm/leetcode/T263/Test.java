package com.alogrithm.leetcode.T263;

import org.junit.Assert;

/**
 * @description:
 * @author: hanzhiming
 * @url:
 * @time: 2020/2/16 16:51
 */

public class Test {


    @org.junit.Test
    public void test1(){

        Main main=new Main();
        Assert.assertEquals(true,main.isUgly(6));
        Assert.assertEquals(true,main.isUgly(1));
        Assert.assertEquals(true,main.isUgly(8));
        Assert.assertEquals(false,main.isUgly(14));



    }


}
