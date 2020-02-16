package com.alogrithm.leetcode.T263;

/**
 * @description: 263. 丑数
 * @author: hanzhiming
 * @url: https://leetcode-cn.com/problems/ugly-number/
 * @time: 2020/2/16 16:51
 */

public class Main {

    public boolean isUgly(int num) {
        if(num==0) return false;
        if(num==1) return true;

        int[] primes={2,3,5};

        for (int prime:primes){
            if(num%prime==0) return isUgly(num/prime);
        }
        return false;
    }

}
