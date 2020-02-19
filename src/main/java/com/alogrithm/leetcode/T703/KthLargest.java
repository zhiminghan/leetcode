package com.alogrithm.leetcode.T703;

import java.util.PriorityQueue;

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
