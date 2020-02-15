package com.alogrithm.leetcode.T187;

import org.junit.Assert;
import org.junit.Before;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: hanzhiming
 * @url:
 * @time: 2020/2/11 17:45
 */

public class Test {

    List<String> expectResult1=new ArrayList<>();
    List<String> expectResult2=new ArrayList<>();


    @Before
    public void init(){

        expectResult1.add("AAAAACCCCC");
        expectResult1.add("CCCCCAAAAA");

        expectResult2.add("CCGGCCGGCC");
    }


    @org.junit.Test
    public void test1(){
        Main main=new Main();
        Assert.assertEquals(expectResult1,main.findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"));
    }

    @org.junit.Test
    public void test2(){
        Main main=new Main();
        Assert.assertEquals(expectResult2,main.findRepeatedDnaSequences("CCGGCCGGCCGGCC"));
    }

}
