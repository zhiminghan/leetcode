package com.alogrithm.leetcode.T322;

import org.junit.Assert;

/**
 * @description: 零钱兑换
 * @author: hanzhiming
 * @url: https://leetcode-cn.com/problems/coin-change/
 * @time: 2020/2/6 16:06
 */

public class Test {

    @org.junit.Test
    public void test1(){

        Main main=new Main();
        int []coins = {2};
        int amount = 3;
        int count=main.coinChange(coins,amount);
        Assert.assertEquals(-1,count);
    }

    @org.junit.Test
    public void test2(){

        Main main=new Main();
        int []coins = new int[]{1, 2, 5};
        int amount = 11;
        int count=main.coinChange(coins,amount);
        Assert.assertEquals(3,count);

    }

    @org.junit.Test
    public void test3(){

        Main main=new Main();
        int []coins = new int[]{1, 3, 5};
        int amount = 5;
        int count=main.coinChange(coins,amount);
        Assert.assertEquals(1,count);

    }

    @org.junit.Test
    public void test4(){

        Main main=new Main();
        int []coins = new int[]{1,3,5};
        int amount = 0;
        int count=main.coinChange(coins,amount);
        Assert.assertEquals(0,count);

    }
}
