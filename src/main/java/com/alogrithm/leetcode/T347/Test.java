package com.alogrithm.leetcode.T347;

import org.junit.Assert;

import java.util.Arrays;
import java.util.List;

/**
 * @description:
 * @author: hanzhiming
 * @url:
 * @time: 2020/2/19 00:52
 */

public class Test {

    @org.junit.Test
    public void test1(){

        Main main=new Main();
        int[]nums={1,1,1,2,2,3};
        List<Integer> list= Arrays.asList(1,2);
        Assert.assertEquals(list,main.topKFrequent(nums,2));
    }

    @org.junit.Test
    public void test2() {

        Main main = new Main();
        int[] nums = {1};
        List<Integer> list = Arrays.asList(1);
        Assert.assertEquals(list, main.topKFrequent(nums, 1));
    }


    }
