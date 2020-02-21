package com.alogrithm.leetcode.T844;

import org.junit.Assert;

/**
 * @description:
 * @author: hanzhiming
 * @url:
 * @time: 2020/2/20 23:25
 */

public class Test {

    @org.junit.Test
    public void test1() {
        Main main = new Main();
        String S = "ab#c";
        String T = "ad#c";
        Assert.assertEquals(true,main.backspaceCompare(S,T));
    }

    @org.junit.Test
    public void test2() {
        Main main = new Main();
        String S = "ab##";
        String T = "c#d#";
        Assert.assertEquals(true,main.backspaceCompare(S,T));
    }

    @org.junit.Test
    public void test3() {
        Main main = new Main();
        String S = "a##c";
        String T = "#a#c";
        Assert.assertEquals(true,main.backspaceCompare(S,T));
    }

    @org.junit.Test
    public void test4() {
        Main main = new Main();
        String S = "a#c";
        String T = "b";
        Assert.assertEquals(false,main.backspaceCompare(S,T));
    }
}
