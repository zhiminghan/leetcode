package com.alogrithm.leetcode.T973;

import org.junit.Assert;

import java.util.Arrays;
import java.util.List;

/**
 * @description:
 * @author: hanzhiming
 * @url:
 * @time: 2020/2/19 01:39
 */

public class Test {

    @org.junit.Test
    public void test1(){
        int [][]points ={{1,3},{-2,2}};
        Main main=new Main();
        int[][] rs=main.kClosest(points,1);
        print(rs);
    }

    @org.junit.Test
    public void test2(){
        Main main=new Main();
        int [][]points ={{3,3},{5,-1},{-2,4}};

        int[][] rs=main.kClosest(points,2);
        print(rs);

    }

    public void print (int[][]rs){

        for (int i=0;i<rs.length;i++){
            System.out.print(rs[i][0]+" "+rs[i][1]+" ");
        }
        System.out.println();
    }

}
