package com.alogrithm.leetcode.T373;

import org.junit.Assert;
import org.junit.Before;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description:
 * @author: hanzhiming
 * @url:
 * @time: 2020/2/20 00:00
 */

public class Test {

    List<List<Integer>> expectResult1=new ArrayList<>();
    List<List<Integer>> expectResult2=new ArrayList<>();
    List<List<Integer>> expectResult3=new ArrayList<>();


    @Before
    public void init(){

        expectResult1.add(Arrays.asList(1,2));
        expectResult1.add(Arrays.asList(1,4));
        expectResult1.add(Arrays.asList(1,6));

        expectResult2.add(Arrays.asList(1,1));
        expectResult2.add(Arrays.asList(1,1));

        expectResult3.add(Arrays.asList(1,3));
        expectResult3.add(Arrays.asList(2,3));
    }


    @org.junit.Test
    public void test1() {
        Main main = new Main();
        int []nums1 = {1,7,11};
        int []nums2 = {2,4,6};
        Assert.assertEquals(expectResult1,main.kSmallestPairs(nums1,nums2,3));
    }

    @org.junit.Test
    public void test2() {
        Main main = new Main();
        int []nums1 = {1,1,2};
        int []nums2 = {1,2,3};
        Assert.assertEquals(expectResult2,main.kSmallestPairs(nums1,nums2,2));
    }

    @org.junit.Test
    public void test3() {
        Main main = new Main();
        int []nums1 = {1,2};
        int []nums2 = {3};
        Assert.assertEquals(expectResult3,main.kSmallestPairs(nums1,nums2,3));
    }

}
