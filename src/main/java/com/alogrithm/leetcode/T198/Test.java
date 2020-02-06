package com.alogrithm.leetcode.T198;

import org.junit.Assert;

/**
 * @description: 198. 打家劫舍
 * @author: hanzhiming
 * @url: https://leetcode-cn.com/problems/house-robber/
 * @time: 2020/2/6 16:28
 */

public class Test {

    @org.junit.Test
    public void test1(){
        Main main=new Main();
        int []nums=new int[]{1,2,3,1};
        int maxSal=main.rob(nums);
        Assert.assertEquals(4,maxSal);
    }

    @org.junit.Test
    public void test2(){
        Main main=new Main();
        int []nums=new int[]{2,7,9,3,1};
        int maxSal=main.rob(nums);
        Assert.assertEquals(12,maxSal);
    }

    @org.junit.Test
    public void test3(){
        Main main=new Main();
        int []nums=new int[]{1,4};
        int maxSal=main.rob(nums);
        Assert.assertEquals(4,maxSal);
    }

    @org.junit.Test
    public void test4(){
        Main main=new Main();
        int []nums=new int[]{3};
        int maxSal=main.rob(nums);
        Assert.assertEquals(3,maxSal);
    }
}