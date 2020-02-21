package com.alogrithm.leetcode.T150;

import java.util.Stack;

/**
 * @description: 150. 逆波兰表达式求值
 * @author: hanzhiming
 * @url: https://leetcode-cn.com/problems/evaluate-reverse-polish-notation/
 * @time: 2020/2/21 20:39
 */

public class Main {

    public int evalRPN(String[] tokens) {

        Stack<String> stack=new Stack<>();
        for (String token:tokens){
            if(token.equals("+")){
                int num2=Integer.parseInt(stack.pop());
                int num1=Integer.parseInt(stack.pop());
                stack.push(String.valueOf(num1+num2));
            }else if(token.equals("-")){
                int num2=Integer.parseInt(stack.pop());
                int num1=Integer.parseInt(stack.pop());
                stack.push(String.valueOf(num1-num2));
            }else if(token.equals("*")){
                int num2=Integer.parseInt(stack.pop());
                int num1=Integer.parseInt(stack.pop());
                stack.push(String.valueOf(num1*num2));
            }else if(token.equals("/")){
                int num2=Integer.parseInt(stack.pop());
                int num1=Integer.parseInt(stack.pop());
                stack.push(String.valueOf(num1/num2));
            }else{
                stack.push(token);
            }
        }
        return Integer.parseInt(stack.pop());
    }

}
