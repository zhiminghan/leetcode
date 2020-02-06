package com.alogrithm.leetcode.T62;

import org.junit.Assert;

/**
 * @description:
 * @author: hanzhiming
 * @url:
 * @time: 2020/2/6 19:47
 */

public class Test {


    @org.junit.Test
    public void test1(){
        Main main=new Main();
        int sum=main.uniquePaths(3,2);
        Assert.assertEquals(3,sum);
    }

    @org.junit.Test
    public void test2(){
        Main main=new Main();
        int sum=main.uniquePaths(7,3);
        Assert.assertEquals(28,sum);
    }


}
