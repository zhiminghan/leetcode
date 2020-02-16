package com.alogrithm.leetcode.T67;

import org.junit.Assert;

/**
 * @description:
 * @author: hanzhiming
 * @url:
 * @time: 2020/2/16 18:20
 */

public class Test {

    @org.junit.Test
    public void test1(){
        Main main=new Main();
        Assert.assertEquals("100",main.addBinary("11","1"));
    }

    @org.junit.Test
    public void test2(){
        Main main=new Main();
        Assert.assertEquals("10101",main.addBinary("1010","1011"));
    }


}
