package com.alogrithm.leetcode.T232;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 232. 用栈实现队列
 * @author: hanzhiming
 * @url: https://leetcode-cn.com/problems/implement-queue-using-stacks/
 * @time: 2020/2/11 22:59
 */

public class MyQueue {
    /** Initialize your data structure here. */
    private List<Integer> list;
    public MyQueue() {
        list=new ArrayList<>();

    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        list.add(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        return list.remove(0);
    }

    /** Get the front element. */
    public int peek() {
        return list.get(0);
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return list.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
