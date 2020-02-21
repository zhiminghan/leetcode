package com.alogrithm.leetcode.T844;

import java.util.Stack;

/**
 * @description: 844. 比较含退格的字符串
 * @author: hanzhiming
 * @url: https://leetcode-cn.com/problems/backspace-string-compare/
 * @time: 2020/2/20 23:25
 */

public class Main {

    public boolean backspaceCompare(String S, String T) {

        char[] chars1=S.toCharArray();
        char[] chars2=T.toCharArray();
        StringBuffer sb1=new StringBuffer();
        StringBuffer sb2=new StringBuffer();

        Stack<Character> stack1=new Stack<>();
        Stack<Character> stack2=new Stack<>();

        for (int i=0;i<chars1.length;i++) {
            if (stack1.isEmpty()) stack1.push(chars1[i]);
            else if(chars1[i]=='#') stack1.pop();
            else stack1.push(chars1[i]);

        }

        for (int j=0;j<chars2.length;j++) {
            if (stack2.isEmpty()) stack2.push(chars2[j]);
            else if (chars2[j] == '#') stack2.pop();
            else stack2.push(chars2[j]);
        }

        while (!stack1.isEmpty()) {
            Character c = stack1.pop();
            if (c != '#') sb1.append(c);
        }

        while (!stack2.isEmpty()) {
            Character c = stack2.pop();
            if (c != '#') sb2.append(c);
        }

        return sb1.reverse().toString().equals(sb2.reverse().toString());
    }

}
