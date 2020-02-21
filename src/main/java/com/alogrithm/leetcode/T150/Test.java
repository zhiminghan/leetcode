package com.alogrithm.leetcode.T150;

import org.junit.Assert;

/**
 * @description:
 * @author: hanzhiming
 * @url:
 * @time: 2020/2/21 20:39
 */

public class Test {

    @org.junit.Test
    public void test1() {

        String[] tokes = {"2", "1", "+", "3", "*"};
        Main main = new Main();
        Assert.assertEquals(9, main.evalRPN(tokes));

    }

    @org.junit.Test
    public void test2() {
        String[] tokes = {"4", "13", "5", "/", "+"};
        Main main = new Main();
        Assert.assertEquals(6, main.evalRPN(tokes));

    }

    @org.junit.Test
    public void test3() {
        String[] tokes = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        Main main = new Main();
        Assert.assertEquals(22, main.evalRPN(tokes));
    }

}