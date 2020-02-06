package com.alogrithm.leetcode.T198;

/**
 * @description: 198. 打家劫舍
 * @author: hanzhiming
 * @url: https://leetcode-cn.com/problems/house-robber/
 * @time: 2020/2/6 16:28
 */

public class Main {


    public int rob(int[] nums) {

        int n=nums.length;
        if(n==0) return 0;
        int []dp=new int[n+1];
        dp[0]=0;
        dp[1]=nums[0];
        for(int i=2;i<dp.length;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i-1]);
        }
        return dp[n];
    }
}