package com.alogrithm.leetcode.T1021;

import java.util.Stack;

/**
 * @description: 1021. 删除最外层的括号
 * @author: hanzhiming
 * @url: https://leetcode-cn.com/problems/remove-outermost-parentheses/
 * @time: 2020/2/20 21:40
 */

public class Main {

    public String removeOuterParentheses(String S) {
        char[] chars=S.toCharArray();
        Stack<Character> stack=new Stack<>();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<chars.length;i++){

            if(chars[i]=='('){
                if(!stack.isEmpty()){
                    sb.append(chars[i]);
                }
                stack.push(chars[i]);
            }

            if(chars[i]==')'){
                stack.pop();
                if(!stack.isEmpty()){
                    sb.append(chars[i]);
                }
            }
        }
        return sb.toString();
    }
}
