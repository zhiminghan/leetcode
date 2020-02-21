package com.alogrithm.leetcode.T682;

import java.util.Stack;

/**
 * @description: 682. 棒球比赛
 * @author: hanzhiming
 * @url: https://leetcode-cn.com/problems/baseball-game/
 * @time: 2020/2/20 23:02
 */

public class Main {

    public int calPoints(String[] ops) {
        Stack<Integer> stack=new Stack<>();
        for(String str:ops){
            if(str=="C") stack.pop();
            else if(str=="D"){
                int score=stack.peek();
                stack.push(2*score);
            }else if(str=="+"){
                int score1=stack.pop();
                int score2=stack.pop();
                stack.push(score2);
                stack.push(score1);
                stack.push(score1+score2);
            }else {
                int score=Integer.parseInt(str);
                stack.push(score);
            }
        }

        int sum=0;
        while (!stack.isEmpty()){
            sum+=stack.pop();
        }
        return sum;
    }
}
