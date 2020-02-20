package com.alogrithm.leetcode.T1021;

import org.junit.Assert;

/**
 * @description:
 * @author: hanzhiming
 * @url:
 * @time: 2020/2/20 21:40
 */

public class Test {

    @org.junit.Test
    public void test(){
        Main main=new Main();
        Assert.assertEquals("()()()",main.removeOuterParentheses("(()())(())"));
        Assert.assertEquals("()()()()(())",main.removeOuterParentheses("(()())(())(()(()))"));
        Assert.assertEquals("",main.removeOuterParentheses("()()"));
    }

}
