package com.alogrithm.leetcode.T451;

import org.junit.Assert;

/**
 * @description:
 * @author: hanzhiming
 * @url:
 * @time: 2020/2/19 21:21
 */

public class Test {

    @org.junit.Test
    public void test() {
       Main main=new Main();

       Assert.assertEquals("eetr",main.frequencySort("tree"));
       Assert.assertEquals("cccaaa",main.frequencySort("cccaaa"));
       Assert.assertEquals("bbAa",main.frequencySort("Aabb"));


    }
}
