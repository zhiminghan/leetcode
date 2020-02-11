package com.alogrithm.leetcode.T409;

import org.junit.Assert;
import org.junit.Before;

/**
 * @description:
 * @author: hanzhiming
 * @url:
 * @time: 2020/2/11 15:59
 */

public class Test {


    @Before
    public void init(){

    }

    @org.junit.Test
    public void test(){

        Main main=new Main();

        Assert.assertEquals(7,main.longestPalindrome("abccccdd"));
        Assert.assertEquals(3,main.longestPalindrome("ccc"));

    }

}
