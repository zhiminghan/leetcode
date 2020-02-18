package com.alogrithm.leetcode.T692;

import org.junit.Assert;

import java.util.Arrays;
import java.util.List;

/**
 * @description:
 * @author: hanzhiming
 * @url:
 * @time: 2020/2/19 01:06
 */

public class Test {

    @org.junit.Test
    public void test1(){

        Main main=new Main();
        List<String> list= Arrays.asList("i", "love");
        String[] words={"i", "love", "leetcode", "i", "love", "coding"};
        Assert.assertEquals(list,main.topKFrequent(words,2));

    }

    @org.junit.Test
    public void test2(){
        Main main=new Main();
        List<String> list= Arrays.asList("the", "is", "sunny", "day");
        String[] words={"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
        Assert.assertEquals(list,main.topKFrequent(words,4));

    }
    @org.junit.Test
    public void test3(){
        Main main=new Main();
        List<String> list= Arrays.asList("i","love","coding");
        String[] words={"i", "love", "leetcode", "i", "love", "coding"};
        Assert.assertEquals(list,main.topKFrequent(words,3));

    }

}
