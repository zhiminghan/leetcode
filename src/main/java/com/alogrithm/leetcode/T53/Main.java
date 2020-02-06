package com.alogrithm.leetcode.T53;

/**
 * @description: 53. 最大子序和
 * @author: hanzhiming
 * @url: https://leetcode-cn.com/problems/maximum-subarray/
 * @time: 2020/2/6 19:11
 */

public class Main {

    public int maxSubArray(int[] nums) {

        int n=nums.length;
        int[] dp=new int[n];
        int max=0;
        for(int i=0;i<n;i++){
            if (i==0||dp[i-1]<0) dp[i]=nums[i];
            else dp[i]=dp[i-1]+nums[i];
            if (i==0) max=dp[i];
            else max=Math.max(max,dp[i]);
        }
        return max;
    }
}