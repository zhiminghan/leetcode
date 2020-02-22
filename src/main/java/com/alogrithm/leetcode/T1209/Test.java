package com.alogrithm.leetcode.T1209;

import org.junit.Assert;

/**
 * @description:
 * @author: hanzhiming
 * @url:
 * @time: 2020/2/22 14:32
 */

public class Test {


    @org.junit.Test
    public void test() {
        Main main = new Main();
        Assert.assertEquals("abcd", main.removeDuplicates("abcd",2));
        Assert.assertEquals("aa", main.removeDuplicates("deeedbbcccbdaa",3));
        Assert.assertEquals("ps", main.removeDuplicates( "pbbcggttciiippooaais",2));


    }

}
