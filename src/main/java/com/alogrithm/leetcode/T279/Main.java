package com.alogrithm.leetcode.T279;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 279. 完全平方数
 * @author: hanzhiming
 * @url: https://leetcode-cn.com/problems/perfect-squares/
 * @time: 2020/2/18 00:16
 */

public class Main {

    public int numSquares(int n) {

        int dp[]=new int[n+1];
        List<Integer> sqrts=new ArrayList<>();
        for(int i=1;i<=n;i++){

            if(isSquare(i)){
                sqrts.add(i);
                dp[i]=1;
            } else{
                int min=-1;
                for (int sqrt:sqrts) {
                    if (min == -1) min = dp[sqrt] + dp[i - sqrt];
                    else min = Math.min(dp[sqrt] + dp[i - sqrt], min);
                }
                dp[i]=min;
            }

        }
        return dp[n];
    }

    private boolean isSquare(int num) {

        int sqrt=(int)Math.sqrt(num);
        return sqrt*sqrt==num;
    }


}
