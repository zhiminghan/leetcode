package com.alogrithm.leetcode.T682;

import org.junit.Assert;

/**
 * @description:
 * @author: hanzhiming
 * @url:
 * @time: 2020/2/20 23:06
 */

public class Test {

    @org.junit.Test
    public void test1() {
        Main main = new Main();
        String []ops = {"5","2","C","D","+"};
        Assert.assertEquals(30,main.calPoints(ops));
    }

    @org.junit.Test
    public void test2() {
        Main main = new Main();
        String []ops = {"5","-2","4","C","D","9","+","+"};
        Assert.assertEquals(27,main.calPoints(ops));
    }

}
