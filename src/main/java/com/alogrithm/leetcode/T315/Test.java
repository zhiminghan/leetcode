package com.alogrithm.leetcode.T315;

import org.junit.Assert;
import org.junit.Before;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: hanzhiming
 * @url:
 * @time: 2020/2/13 14:49
 */

public class Test {


    List<Integer> expectResult1=new ArrayList<>();

    List<Integer> expectResult2=new ArrayList<>();

    List<Integer> expectResult3=new ArrayList<>();

    List<Integer> expectResult4=new ArrayList<>();

    List<Integer> expectResult5=new ArrayList<>();


    @Before
    public void init() {

        expectResult1.add(2);
        expectResult1.add(1);
        expectResult1.add(1);
        expectResult1.add(0);

        expectResult2.add(0);

        expectResult3.add(2);
        expectResult3.add(2);
        expectResult3.add(1);
        expectResult3.add(0);

        expectResult4.add(2);
        expectResult4.add(0);
        expectResult4.add(0);

    }

    @org.junit.Test
    public void test1(){
        Main main=new Main();
        int[] nums={5,2,6,1};
        Assert.assertEquals(expectResult1,main.countSmaller(nums));
    }

    @org.junit.Test
    public void test2(){
        Main main=new Main();
        int[] nums={1};
        Assert.assertEquals(expectResult2,main.countSmaller(nums));
    }

    @org.junit.Test
    public void test3(){
        Main main=new Main();
        int[] nums={2,2,1,0};
        Assert.assertEquals(expectResult3,main.countSmaller(nums));
    }

    @org.junit.Test
    public void test4(){
        Main main=new Main();
        int[] nums={2,0,1};
        Assert.assertEquals(expectResult4,main.countSmaller(nums));
    }

    @org.junit.Test
    public void test5(){
        Main main=new Main();
        int[] nums={26,78,27,100,33,67,90,23,66,5,38,7,35,23,52,22,83,51,98,69,81,32,78,28,94,13,2,97,3,76,99,51,9,21,84,66,65,36,100,41};
        List<Integer> list=main.countSmaller(nums);
        System.out.println(list);
    }


}
