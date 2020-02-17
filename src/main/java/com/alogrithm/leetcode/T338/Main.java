package com.alogrithm.leetcode.T338;

/**
 * @description: 338. 比特位计数
 * @author: hanzhiming
 * @url: https://leetcode-cn.com/problems/counting-bits/
 * @time: 2020/2/18 00:13
 */

public class Main {

    public int[] countBits(int num) {
        int[] dp=new int[num+1];
        dp[0]=0;
        int k=0;
        for(int i=1;i<=num;i++){
            if((i&(i-1))==0){
                dp[i]=1;
                k=i;
            }else dp[i]=1+dp[i-k];
        }
        return dp;

    }

}
