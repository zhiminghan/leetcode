package com.alogrithm.leetcode.T215;

import java.util.PriorityQueue;

/**
 * @description: 215. 数组中的第K个最大元素
 * @author: hanzhiming
 * @url: https://leetcode-cn.com/problems/kth-largest-element-in-an-array/
 * @time: 2020/2/12 01:43
 */

public class Main {

    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i=0;i<nums.length;i++){
            if(queue.size()<k){
                queue.add(nums[i]);
            }else if(queue.peek()<nums[i]){
                queue.poll();
                queue.add(nums[i]);
            }
        }
        return queue.peek();
    }
}