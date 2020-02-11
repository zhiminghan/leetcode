package com.alogrithm.leetcode.T155;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 155. 最小栈
 * @author: hanzhiming
 * @url: https://leetcode-cn.com/problems/min-stack/
 * @time: 2020/2/11 23:14
 */

public class MinStack {

    private List<Integer> data;
    private List<Integer> minData;

    /** initialize your data structure here. */
    public MinStack() {
        data=new ArrayList<>();
        minData=new ArrayList<>();
    }

    public void push(int x) {
        data.add(x);
       int size=minData.size();
        if (size==0)
            minData.add(x);
        else
            minData.add(Math.min(minData.get(size-1),x));
    }

    public void pop() {
       data.remove(data.size()-1);
       minData.remove(minData.size()-1);

    }

    public int top() {
        return data.get(data.size()-1);
    }

    public int getMin() {
        return minData.get(minData.size()-1);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */