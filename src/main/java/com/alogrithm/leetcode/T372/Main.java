package com.alogrithm.leetcode.T372;

/**
 * @description: 372. 超级次方
 * @author: hanzhiming
 * @url: https://leetcode-cn.com/problems/super-pow/solution/
 * @time: 2020/2/18 14:10
 */

public class Main {

    public int superPow(int a, int[] b) {
        int sum=0;
        for(int n:b){
            sum=(10*sum+n)%1140;
        }
        int rs=myPow(a,sum);
        return rs>=1337?rs%1337:rs;
    }

    private int myPow(int x, int n) {
        if(n==0) return 1;
        int total=1;
        int half=myPow(x,n/2);
        if(half>=1337) half=half%1337;
        if(x>=1337) x=x%1337;
        if(n%2>0) total*=half*half*x;
        else total*=half*half;
        return total;
    }

}
