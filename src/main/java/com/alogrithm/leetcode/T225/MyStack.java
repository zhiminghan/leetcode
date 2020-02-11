package com.alogrithm.leetcode.T225;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 225. 用队列实现栈
 * @author: hanzhiming
 * @url: https://leetcode-cn.com/problems/implement-stack-using-queues/
 * @time: 2020/2/11 22:51
 */

public class MyStack {

    private List<Integer> list;
    /** Initialize your data structure here. */
    public MyStack() {
        list=new ArrayList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        list.add(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return list.remove(list.size()-1);
    }

    /** Get the top element. */
    public int top() {
        return list.get(list.size()-1);
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return list.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */