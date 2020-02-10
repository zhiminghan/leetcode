package com.alogrithm.leetcode.T9;

/**
 * @description: 9. 回文数
 * @author: hanzhiming
 * @url: https://leetcode-cn.com/problems/palindrome-number/
 * @time: 2020/2/10 16:44
 */

public class Main {

    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int y=x;
        int palindromeNum=0;

        while(x>0){
            int mod=x%10;
            x=x/10;
            palindromeNum=10*palindromeNum+mod;
        }

        return palindromeNum==y;
    }

}
