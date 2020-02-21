package com.alogrithm.leetcode.T239;

import org.junit.Assert;

/**
 * @description:
 * @author: hanzhiming
 * @url:
 * @time: 2020/2/20 22:09
 */

public class Test {

    @org.junit.Test
    public void test() {

        Main main=new Main();
        int[] nums={5,5,5,1,1,1};
        print(main.maxSlidingWindow(nums,0));
    }

    public void print(int []nums){
        for(int num:nums){
            System.out.print(num+" ");
        }
        System.out.println();
    }
}
