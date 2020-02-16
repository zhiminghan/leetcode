package com.alogrithm.leetcode.T989;

import java.util.LinkedList;
import java.util.List;

/**
 * @description: 989. 数组形式的整数加法
 * @author: hanzhiming
 * @url: https://leetcode-cn.com/problems/add-to-array-form-of-integer/
 * @time: 2020/2/16 17:39
 */

public class Main {

    public List<Integer> addToArrayForm(int[] A, int K) {
        LinkedList<Integer> stack=new LinkedList<>();
        int pre=0;
        for(int i=A.length-1;i>=0;i--){
            int num=pre+A[i]+K%10;
            int n=num%10;
            pre=num/10;
            K=K/10;
            stack.push(n);
        }
        if (K!=0){
            while (K!=0){
                int num=pre+K%10;
                stack.push(num%10);
                pre=num/10;
                K=K/10;
            }

        }

        if(pre>0) stack.push(pre);
        return stack;
    }
}
