package com.alogrithm.leetcode.T1047;

import java.util.Stack;

/**
 * @description: 1047. 删除字符串中的所有相邻重复项
 * @author: hanzhiming
 * @url: https://leetcode-cn.com/problems/remove-all-adjacent-duplicates-in-string/
 * @time: 2020/2/20 23:16
 */

public class Main {

    public String removeDuplicates(String S) {

        Stack<Character> stack=new Stack<>();
        StringBuffer sb=new StringBuffer();
        char[] chars=S.toCharArray();
        for(Character c:chars){

            if(stack.isEmpty()) stack.push(c);
            else if(stack.peek()==c){
                stack.pop();
            }else {
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) sb.append(stack.pop());

        return sb.reverse().toString();
    }
}
