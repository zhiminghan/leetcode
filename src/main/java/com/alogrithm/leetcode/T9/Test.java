package com.alogrithm.leetcode.T9;

import org.junit.Assert;
import org.junit.Before;

/**
 * @description:
 * @author: hanzhiming
 * @url:
 * @time: 2020/2/10 16:45
 */

public class Test {

    @Before
    public void init(){

    }


    @org.junit.Test
    public void test1(){

        Main main=new Main();
        Assert.assertEquals(true,main.isPalindrome(121));

        Assert.assertEquals(false,main.isPalindrome(-121));

        Assert.assertEquals(false,main.isPalindrome(10));

    }


}
