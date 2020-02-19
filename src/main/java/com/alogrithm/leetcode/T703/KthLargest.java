package com.alogrithm.leetcode.T703;

import java.util.PriorityQueue;

/**
 * @description: 703. 数据流中的第K大元素
 * @author: hanzhiming
 * @url: https://leetcode-cn.com/problems/kth-largest-element-in-a-stream/
 * @time: 2020/2/19 17:24
 */
public class KthLargest {

    PriorityQueue<Integer> heap;
    int k;

    public KthLargest(int k, int[] nums) {
        heap=new PriorityQueue<>();
        this.k=k;
        for (int i=0;i<nums.length;i++){
            add(nums[i]);
        }

    }
    
    public int add(int val) {

        if(heap.size()<k){
            heap.add(val);
        }else if(heap.peek()<val){
            heap.poll();
            heap.add(val);
        }

        return heap.peek();
    }

}
