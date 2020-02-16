package com.alogrithm.leetcode.T258;

/**
 * @description: 258. 各位相加
 * @author: hanzhiming
 * @url: https://leetcode-cn.com/problems/add-digits/
 * @time: 2020/2/16 18:37
 */

public class Main {

    public int addDigits(int num) {
        int sum=0;
        while(num!=0){
            sum+=num%10;
            num=num/10;
        }
        if(sum>=10) return addDigits(sum);
        return sum;

    }
}
