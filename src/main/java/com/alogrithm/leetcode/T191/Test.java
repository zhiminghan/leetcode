package com.alogrithm.leetcode.T191;

import org.junit.Assert;

/**
 * @description:
 * @author: hanzhiming
 * @url:
 * @time: 2020/2/15 14:10
 */

public class Test {


    @org.junit.Test
    public void test(){
        Main main=new Main();
        Assert.assertEquals(3,main.hammingWeight(00000000000000000000000000001011));
        Assert.assertEquals(1,main.hammingWeight(00000000000000000000000010000000));

    }

}
