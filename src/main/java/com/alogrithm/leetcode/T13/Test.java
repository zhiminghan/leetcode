package com.alogrithm.leetcode.T13;

import org.junit.Assert;

/**
 * @description: 13. 罗马数字转整数
 * @author: hanzhiming
 * @url: https://leetcode-cn.com/problems/roman-to-integer/
 * @time: 2020/2/10 17:07
 */

public class Test {

    @org.junit.Test
    public void test1(){

        Main main=new Main();
        Assert.assertEquals(3,main.romanToInt("III"));
        Assert.assertEquals(4,main.romanToInt("IV"));
        Assert.assertEquals(9,main.romanToInt("IX"));
        Assert.assertEquals(58,main.romanToInt("LVIII"));
        Assert.assertEquals(1994,main.romanToInt("MCMXCIV"));
        Assert.assertEquals(1476,main.romanToInt("MCDLXXVI"));


    }


}
