package com.alogrithm.leetcode.T215;

import org.junit.Assert;

/**
 * @description:
 * @author: hanzhiming
 * @url:
 * @time: 2020/2/14 00:43
 */

public class Test {

    @org.junit.Test
    public void test1(){
        Main main=new Main();
        int [] nums={3,2,1,5,6,4};
        Assert.assertEquals(4,main.findKthLargest(nums,3));
    }

    @org.junit.Test
    public void test2(){
        Main main=new Main();
        int [] nums={1,2};
        Assert.assertEquals(2,main.findKthLargest(nums,1));
    }

}
