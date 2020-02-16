package com.alogrithm.leetcode.T989;

import org.junit.Assert;
import org.junit.Before;

import java.util.LinkedList;

/**
 * @description:
 * @author: hanzhiming
 * @url:
 * @time: 2020/2/16 17:40
 */

public class Test {

    LinkedList<Integer> expectResult1=new LinkedList<>();

    LinkedList<Integer> expectResult2=new LinkedList<>();

    LinkedList<Integer> expectResult3=new LinkedList<>();

    LinkedList<Integer> expectResult4=new LinkedList<>();

    LinkedList<Integer> expectResult5=new LinkedList<>();

    LinkedList<Integer> expectResult6=new LinkedList<>();


    @Before
    public void init() {
        expectResult1.add(1);
        expectResult1.add(2);
        expectResult1.add(3);
        expectResult1.add(4);

        expectResult2.add(4);
        expectResult2.add(5);
        expectResult2.add(5);

        expectResult3.add(1);
        expectResult3.add(0);
        expectResult3.add(2);
        expectResult3.add(1);

        expectResult4.add(1);
        expectResult4.add(0);
        expectResult4.add(0);
        expectResult4.add(0);
        expectResult4.add(0);
        expectResult4.add(0);
        expectResult4.add(0);
        expectResult4.add(0);
        expectResult4.add(0);
        expectResult4.add(0);
        expectResult4.add(0);

        expectResult5.add(2);
        expectResult5.add(3);

        expectResult6.add(1);
        expectResult6.add(0);
        expectResult6.add(1);
        expectResult6.add(0);

    }

    @org.junit.Test
    public void test1(){
        Main main=new Main();
        int[] A={1,2,0,0};
        Assert.assertEquals(expectResult1,main.addToArrayForm(A,34));
    }

    @org.junit.Test
    public void test2(){
        Main main=new Main();
        int[] A={2,7,4};
        Assert.assertEquals(expectResult2,main.addToArrayForm(A,181));
    }

    @org.junit.Test
    public void test3(){
        Main main=new Main();
        int[] A={2,1,5};
        Assert.assertEquals(expectResult3,main.addToArrayForm(A,806));
    }

    @org.junit.Test
    public void test4(){
        Main main=new Main();
        int[] A={9,9,9,9,9,9,9,9,9,9};
        Assert.assertEquals(expectResult4,main.addToArrayForm(A,1));
    }

    @org.junit.Test
    public void test5(){
        Main main=new Main();
        int[] A={0};
        Assert.assertEquals(expectResult5,main.addToArrayForm(A,23));
    }

    @org.junit.Test
    public void test6(){
        Main main=new Main();
        int[] A={11};
        Assert.assertEquals(expectResult6,main.addToArrayForm(A,999));
    }
}
