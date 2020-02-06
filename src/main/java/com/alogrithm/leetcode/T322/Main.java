package com.alogrithm.leetcode.T322;

/**
 * @description: 零钱兑换
 * @author: hanzhiming
 * @url: https://leetcode-cn.com/problems/coin-change/
 * @time: 2020/2/6 15:28
 */

public class Main {


    public int coinChange(int[] coins, int amount) {

        int []dp=new int[amount+1];

        for(int i=1;i<=amount;i++){
            dp[i]=-1;
        }

        for(int j=1;j<=amount;j++) {
            for (int i = 0; i < coins.length; i++) {
                if(j >= coins[i]&&dp[j-coins[i]]!=-1){
                    if(dp[j]==-1) {
                        dp[j] = dp[j - coins[i]] + 1;
                    }else {
                        dp[j] = Math.min(dp[j - coins[i]] + 1, dp[j]);
                    }
                }

            }
        }
        return dp[amount];
    }



}
