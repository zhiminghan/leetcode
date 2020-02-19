package com.alogrithm.leetcode.T703;

import org.junit.Assert;

/**
 * @description:
 * @author: hanzhiming
 * @url:
 * @time: 2020/2/19 17:51
 */

public class Test {

    @org.junit.Test
    public void test(){
        int k = 3;
        int[] arr = {4,5,8,2};
        KthLargest kthLargest = new KthLargest(k, arr);
        Assert.assertEquals(4,kthLargest.add(3));// returns 4
        Assert.assertEquals(5,kthLargest.add(5));// returns 5
        Assert.assertEquals(5,kthLargest.add(10));// returns 5
        Assert.assertEquals(8,kthLargest.add(9));// returns 8
        Assert.assertEquals(8,kthLargest.add(4));// returns 8

    }


}
