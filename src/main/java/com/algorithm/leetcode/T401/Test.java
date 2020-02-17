package com.algorithm.leetcode.T401;


import org.junit.Assert;
import org.junit.Before;

import java.util.Arrays;
import java.util.List;

/**
 * @description: 401. 二进制手表
 * @author: hanzhiming
 * @url: https://leetcode-cn.com/problems/binary-watch/submissions/
 * @time: 2020/2/17 22:16
 */

public class Test {

    private List<String> expectedResult1;

    private List<String> expectedResult2;

    @Before
    public void init(){
        //<============预期结果集==================>
        expectedResult1= Arrays.asList("0:00");
        expectedResult2= Arrays.asList("1:00", "2:00", "4:00", "8:00", "0:01", "0:02", "0:04", "0:08", "0:16", "0:32");
    }

    @org.junit.Test
    public void test1(){
        Main main=new Main();
        Assert.assertEquals( expectedResult1,main.readBinaryWatch(0));
    }

    @org.junit.Test
    public void test2(){
        Main main=new Main();
        Assert.assertEquals( expectedResult2,main.readBinaryWatch(1));
    }



}
