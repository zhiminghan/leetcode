package com.alogrithm.leetcode.T53;

import org.junit.Assert;

/**
 * @description:
 * @author: hanzhiming
 * @url:
 * @time: 2020/2/6 19:22
 */

public class Test {

    @org.junit.Test
    public void test1(){

        Main main=new Main();
        int[]nums={-2,1,-3,4,-1,2,1,-5,4};
        int maxSum=main.maxSubArray(nums);
        Assert.assertEquals(6,maxSum);
    }

    @org.junit.Test
    public void test2(){

        Main main=new Main();
        int[]nums={-2};
        int maxSum=main.maxSubArray(nums);
        Assert.assertEquals(-2,maxSum);
    }

}
