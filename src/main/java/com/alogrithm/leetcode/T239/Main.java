package com.alogrithm.leetcode.T239;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Stack;

/**
 * @description: 239. 滑动窗口最大值
 * @author: hanzhiming
 * @url: https://leetcode-cn.com/problems/sliding-window-maximum/
 * @time: 2020/2/20 21:59
 */

public class Main {

    public int[] maxSlidingWindow(int[] nums, int k) {
        int len=k<=0?0:nums.length-k+1;
        int []max=new int[len];
        Stack<Integer> stack=new Stack<>();
        PriorityQueue<Integer> heap=new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });

        int left=-1;
        for(int i=0;i<nums.length;i++){
            if(i>=k){
                max[left]=heap.peek();
                heap.remove(stack.pop());
            }
            if(stack.isEmpty()){
                left++;
                stack.push(nums[left]);
            }
            heap.offer(nums[i]);
            if(i==nums.length-1)  max[left]=heap.peek();
        }
        return max;
    }

}
