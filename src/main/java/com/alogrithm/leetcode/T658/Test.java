package com.alogrithm.leetcode.T658;

import org.junit.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description:
 * @author: hanzhiming
 * @url:
 * @time: 2020/2/20 01:04
 */

public class Test {

    List<Integer> expectResult=Arrays.asList(1,2,3,4);


    @org.junit.Test
    public void test() {
        Main main = new Main();
        int []nums = {1,2,3,4,5};
        Assert.assertEquals(expectResult,main.findClosestElements(nums,4,3));
        Assert.assertEquals(expectResult,main.findClosestElements(nums,4,-1));

    }

}
