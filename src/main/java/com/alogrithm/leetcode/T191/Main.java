package com.alogrithm.leetcode.T191;

/**
 * @description: 191. 位1的个数
 * @author: hanzhiming
 * @url: https://leetcode-cn.com/problems/number-of-1-bits/
 * @time: 2020/2/15 14:02
 */

public class Main {


//    x & 1 == 1 or == 0 判断奇偶（x % 2 == 1）
//    x = x & (x - 1) 清零最低位的1
//    x & -x  得到最低位的1

    public int hammingWeight(int n) {
        int num=1;
        int count=0;
        for(int i=0;i<32;i++){
            if((n&num)!=0) count++;
            num<<=1;
        }
        return count;
    }


    public int hammingWeight2(int n) {
        int count=0;
        while(n!=0){
          count++;
          n=n&(n-1);
        }
        return count;
    }
}
