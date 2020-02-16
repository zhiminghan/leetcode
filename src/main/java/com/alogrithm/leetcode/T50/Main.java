package com.alogrithm.leetcode.T50;

/**
 * @description: 50. Pow(x, n)
 * @author: hanzhiming
 * @url: https://leetcode-cn.com/problems/powx-n/
 * @time: 2020/2/16 23:11
 */

public class Main {

    public double myPow(double x, int n) {
        if(n==0) return 1;
        double total=1;
        double half=myPow(x,n/2);
        if(n%2>0) total*=half*half*x;
        else if(n%2<0)total*=half*half*(1/x);
        else total*=half*half;
        return total;
    }

}
