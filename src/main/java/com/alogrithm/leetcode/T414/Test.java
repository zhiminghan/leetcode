package com.alogrithm.leetcode.T414;

import org.junit.Assert;

/**
 * @description:
 * @author: hanzhiming
 * @url:
 * @time: 2020/2/19 17:29
 */

public class Test {

    @org.junit.Test
    public void test1(){
        Main main=new Main();
        int [] nums={3, 2, 1};
        Assert.assertEquals(1,main.thirdMax(nums));
    }

    @org.junit.Test
    public void test2(){
        Main main=new Main();
        int [] nums={1,2};
        Assert.assertEquals(2,main.thirdMax(nums));
    }

    @org.junit.Test
    public void test3(){
        Main main=new Main();
        int [] nums={2, 2, 3, 1};
        Assert.assertEquals(1,main.thirdMax(nums));
    }

}
