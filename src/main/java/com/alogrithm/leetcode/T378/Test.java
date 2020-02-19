package com.alogrithm.leetcode.T378;

import org.junit.Assert;

/**
 * @description:
 * @author: hanzhiming
 * @url:
 * @time: 2020/2/19 22:12
 */

public class Test {

    @org.junit.Test
    public void test() {
        Main main = new Main();
       int[][] matrix = {
               {1,  5,  9},
               {10, 11, 13},
               {12, 13, 15}
       };
       Assert.assertEquals(13,main.kthSmallest(matrix,8));
    }
}