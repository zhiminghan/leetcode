package com.alogrithm.leetcode.T290;

import org.junit.Assert;

/**
 * @description:
 * @author: hanzhiming
 * @url:
 * @time: 2020/2/11 16:21
 */

public class Test {

    @org.junit.Test
    public void test(){

        Main main=new Main();

        Assert.assertEquals(true,main.wordPattern("abba","dog cat cat dog"));
        Assert.assertEquals(false,main.wordPattern("abba","dog cat cat fish"));
        Assert.assertEquals(false,main.wordPattern("aaaa","dog cat cat dog"));
        Assert.assertEquals(false,main.wordPattern("abba","dog dog dog dog"));

    }



}
