package com.alogrithm.leetcode.T71;

import org.junit.Assert;

/**
 * @description:
 * @author: hanzhiming
 * @url:
 * @time: 2020/2/21 20:58
 */

public class Test {


    @org.junit.Test
    public void test() {

        Main main = new Main();
        Assert.assertEquals("/home", main.simplifyPath("/home/"));
        Assert.assertEquals("/", main.simplifyPath("/../"));
        Assert.assertEquals("/home/foo", main.simplifyPath("/home//foo/"));
        Assert.assertEquals("/c", main.simplifyPath("/a/./b/../../c/"));
        Assert.assertEquals("/c", main.simplifyPath("/a/../../b/../c//.//"));
        Assert.assertEquals("/a/b/c", main.simplifyPath("/a//b////c/d//././/.."));

        String[] paths="/a//b////c/d//././/..".split("/");
        for (String path:paths) System.out.print(path+" ");

    }


}
