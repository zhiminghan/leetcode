package com.alogrithm.leetcode.T367;

/**
 * @description: 367. 有效的完全平方数
 * @author: hanzhiming
 * @url: https://leetcode-cn.com/problems/valid-perfect-square/
 * @time: 2020/2/18 01:08
 */

public class Main {

    public boolean isPerfectSquare(int num) {

        int left=1;
        int right=num/2>46340?46340:num/2;

        while (left<=right){
           int mid=left+(right-left)/2;
           int total=mid*mid;
           if(total==num) return true;
           else if(total<num) left=mid+1;
           else right=mid-1;
        }
        return num==1?true:false;
    }

}
